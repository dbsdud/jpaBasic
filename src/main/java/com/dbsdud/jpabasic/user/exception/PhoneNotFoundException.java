package com.dbsdud.jpabasic.user.exception;

import com.dbsdud.jpabasic.common.error.exception.EntityNotFoundException;

public class PhoneNotFoundException extends EntityNotFoundException {

    public PhoneNotFoundException(String target) {
        super(target + " is not found");
    }
}
