package com.dbsdud.jpabasic.user.exception;

import com.dbsdud.jpabasic.common.error.exception.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {

    public UserNotFoundException(Long target) {
        super(target + " is not found");
    }
}
