package com.nest.sleuth.advice;

import com.nest.sleuth.web.SleuthController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author botter
 */
@ControllerAdvice(basePackageClasses = SleuthController.class)
public class FooControllerAdvice extends ResponseEntityExceptionHandler{


    @ExceptionHandler(CommonException.class)
    @ResponseBody
    ResponseEntity<?> handlerControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus httpStatus = getStatus(request);
        System.out.println("1111111");
        return new ResponseEntity<Object>(new CustomerErrorType(httpStatus.value(), ex.getMessage()), httpStatus);
    }

    private HttpStatus getStatus(HttpServletRequest request) {

        Integer statusCode = (Integer) request.getAttribute("java.servlet.error.status_code");
        System.out.println("statusCode = " + statusCode);
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return HttpStatus.valueOf(statusCode);
    }

    private class CustomerErrorType {
        private int value;

        private String message;

        public CustomerErrorType(int value, String message) {
            this.value = value;
            this.message = message;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }


}
