package com.mansi.test.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.mansi.test.entities.UserType;

@Service
public interface UserTypeRepository extends CrudRepository<UserType, Integer>{

}
