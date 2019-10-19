package com.app.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.blog.model.Post;
@Repository
public interface BlogRepository extends  CrudRepository<Post,Long>{

}
