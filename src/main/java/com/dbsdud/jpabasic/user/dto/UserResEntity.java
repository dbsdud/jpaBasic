package com.dbsdud.jpabasic.user.dto;

import com.dbsdud.jpabasic.user.domain.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserResEntity {
    private Email email;
    private Password password;
    private Name name;
    private Address address;
    private Phone phone;
    private IdNumber idNumber;

    public UserResEntity(final User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.name = user.getName();
        this.address = user.getAddress();
        this.phone = user.getPhone();
        this.idNumber = user.getIdNumber();
    }
}
