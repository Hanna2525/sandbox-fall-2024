package com.sandbox.exception;

public class DivideByZeroExcdeption extends Exception {
    public DivideByZeroExcdeption() {
    }

    public DivideByZeroExcdeption(String message) {
        super(message);
    }

    public DivideByZeroExcdeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroExcdeption(Throwable cause) {
        super(cause);
    }
}
