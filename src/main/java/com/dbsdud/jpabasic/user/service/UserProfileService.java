package com.dbsdud.jpabasic.user.service;

import com.dbsdud.jpabasic.user.dao.UserFindDao;
import com.dbsdud.jpabasic.user.domain.User;
import com.dbsdud.jpabasic.user.dto.UserProfileUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserProfileService {
    private final UserFindDao userFindDao;

    public User update(final long userId, final UserProfileUpdate dto) {
        final User user = userFindDao.findById(userId);
        user.updateProfile(dto.getName());
        return user;
    }
}
