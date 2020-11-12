package com.gzl.exception;

public class SysException extends Exception {
    private String message;

    public SysException(String msg) {
        this.message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
