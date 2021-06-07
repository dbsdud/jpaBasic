package com.dbsdud.jpabasic.user.dto;

import com.dbsdud.jpabasic.user.domain.User;
import com.dbsdud.jpabasic.user.model.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResponse {
    private Email email;
    private Name name;
    private Address address;
    private Phone phone;
    private IdNumber idNumber;

    public UserResponse(final User user) {
        this.email = user.getEmail();
        this.name = user.getName();
        this.address = user.getAddress();
        this.phone = user.getPhone();
        this.idNumber = user.getIdNumber();
    }
}
