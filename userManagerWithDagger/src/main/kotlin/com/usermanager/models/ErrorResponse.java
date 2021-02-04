package com.usermanager.models;

public class ErrorResponse {

    private String errorCode;
    private String errorMessage;
    private String timeStamp;
    private String exception;


    public ErrorResponse() {

    }

    public ErrorResponse(String errorCode, String errorMessage, String timeStamp, String exception) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.timeStamp = timeStamp;
        this.exception = exception;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", exception='" + exception + '\'' +
                '}';
    }
}
