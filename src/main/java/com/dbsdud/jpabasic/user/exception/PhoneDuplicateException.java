package com.dbsdud.jpabasic.user.exception;

import com.dbsdud.jpabasic.common.error.ErrorCode;
import com.dbsdud.jpabasic.common.error.exception.InvalidValueException;
import com.dbsdud.jpabasic.user.model.Phone;

public class PhoneDuplicateException extends InvalidValueException {

    public PhoneDuplicateException(final Phone phone) {
        super(phone.getValue(), ErrorCode.PHONE_DUPLICATION);
    }
}
