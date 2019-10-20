package com.app.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.blog.model.Interest;
@Repository
public interface InterestRepository extends  CrudRepository<Interest,Integer>{

}