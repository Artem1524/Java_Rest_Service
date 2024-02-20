package project.rest.service;

public class BaseResponse {

    private final String statusName;
    private final int statusCode;

    public BaseResponse(String statusName, int statusCode) {
        this.statusName = statusName;
        this.statusCode = statusCode;
    }

    public String getStatusName() {
        return statusName;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
