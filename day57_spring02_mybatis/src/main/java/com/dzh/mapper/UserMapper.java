package com.dzh.mapper;

import com.dzh.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<Users> findAll();
}
