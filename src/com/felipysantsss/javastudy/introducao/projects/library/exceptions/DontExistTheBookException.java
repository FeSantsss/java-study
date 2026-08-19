package com.felipysantsss.javastudy.introducao.projects.library.exceptions;

public class DontExistTheBookException extends BooksException {
    public DontExistTheBookException(String message) {
        super(message);
    }
}
