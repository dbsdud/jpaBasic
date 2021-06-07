package com.dbsdud.jpabasic.common.error.exception;

import com.dbsdud.jpabasic.common.error.ErrorCode;

public class EntityNotFoundException extends BusinessException {

    public EntityNotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }
}
