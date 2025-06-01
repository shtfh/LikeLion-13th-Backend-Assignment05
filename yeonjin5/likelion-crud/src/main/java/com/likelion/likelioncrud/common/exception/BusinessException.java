package com.likelion.likelioncrud.common.exception;

import com.likelion.likelioncrud.common.error.ErrorCode;
import lombok.Getter;


@Getter
public class BusinessException extends RuntimeException {
    private  final ErrorCode errorCode;
    private  final String customMessage;

    public BusinessException(ErrorCode errorCode, String customMessage) {
        super(customMessage);
        this.errorCode = errorCode;
        this.customMessage = customMessage;
    }
}
