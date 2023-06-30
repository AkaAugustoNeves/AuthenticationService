package br.com.pilares.msperson.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.pilares.msperson.model.dto.ErroDTO;
import br.com.pilares.msperson.model.enums.Erro;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<ErroDTO> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErroDTO(Erro.getErroByString(ex.getMessage())));
    }

}
