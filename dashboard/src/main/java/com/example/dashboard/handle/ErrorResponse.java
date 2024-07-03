package com.example.dashboard.handle;

import lombok.Data;

@Data
public class ErrorResponse {
    private int status;
    private String message;
    private Long timespan;

    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
        this.timespan = System.currentTimeMillis();
    }
}
