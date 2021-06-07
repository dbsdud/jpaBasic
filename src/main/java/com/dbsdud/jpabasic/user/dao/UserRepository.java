package com.dbsdud.jpabasic.user.dao;

import com.dbsdud.jpabasic.user.domain.User;
import com.dbsdud.jpabasic.user.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByPhone(Phone phone);

    boolean existsByPhone(Phone phone);
}
