package com.app.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.blog.model.Comment;
@Repository
public interface CommentRepository extends  CrudRepository<Comment,Long>{

}