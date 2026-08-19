package com.felipysantsss.javastudy.introducao.projects.library.exceptions;

public class DontExistAReaderException extends RuntimeException {
    public DontExistAReaderException(String message) {
        super(message);
    }
}
