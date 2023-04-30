package com.jamesson.codeblog.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamesson.codeblog.model.Post;
import com.jamesson.codeblog.repository.CodeBlogRepository;
import com.jamesson.codeblog.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

	@Autowired
	private CodeBlogRepository pr;

	@Override
	public List<Post> findAll() {
		return pr.findAll();
	}

	@Override
	public Post findById(Long id) {
		return pr.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return pr.save(post);
	}

}
