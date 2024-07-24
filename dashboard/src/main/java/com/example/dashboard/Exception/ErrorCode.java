package com.example.dashboard.Exception;


import lombok.Getter;

@Getter
public enum ErrorCode {

    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002, "User existed."),
    USER_INVALID(1003, "Username must be at least 10 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    USER_NOT_EXISTED(1005, "User not existed."),
    AUTHENTICATED(1006, "Unauthenticated"),


    ;

    private final int code;

    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
