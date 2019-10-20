package com.app.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.blog.model.User;
@Repository
public interface UserRepository extends  CrudRepository<User,Long>{

}