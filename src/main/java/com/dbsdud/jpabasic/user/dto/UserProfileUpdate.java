package com.dbsdud.jpabasic.user.dto;

import com.dbsdud.jpabasic.user.model.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class UserProfileUpdate {

    @Valid
    private Name name;

    public UserProfileUpdate(@Valid Name name) {
        this.name = name;
    }

}
