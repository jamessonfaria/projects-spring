package com.jamesson.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesson.codeblog.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long>{

}
