package br.com.jamesson.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.sender.MessageSender;

@RestController
@RequestMapping("/send")
public class SenderMessageController {

	@Autowired
	private MessageSender sender;

	@PostMapping()
	public void send(@RequestParam String message) {
		sender.send(message);
	}

}
