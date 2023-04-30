package com.jamesson.codeblog.service;

import java.util.List;

import com.jamesson.codeblog.model.Post;

public interface CodeBlogService {

	public List<Post> findAll();
	public Post findById(Long id);
	public Post save(Post post);
	
}
