package com.yang.springbootjdbc.repository;

import com.yang.springbootjdbc.domain.User;

public interface UserRepository extends BaseRepository<User, Integer> {

    User getUserById(Integer id);

}
