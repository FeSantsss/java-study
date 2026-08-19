package com.felipysantsss.javastudy.introducao.projects.library.exceptions;

public class DontExistAvailableBooksException extends BooksException {
    public DontExistAvailableBooksException(String message) {
        super(message);
    }
}
