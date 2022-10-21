package com.bootcamp.storage01.repository;

import com.bootcamp.storage01.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

}
