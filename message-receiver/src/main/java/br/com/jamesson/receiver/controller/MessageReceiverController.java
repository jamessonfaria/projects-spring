package br.com.jamesson.receiver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.receiver.MessageReceiver;
import br.com.jamesson.receiver.message.MessageDTO;

@RestController
@RequestMapping("/messages")
public class MessageReceiverController {

    @Autowired
    private MessageReceiver receiver;

    @GetMapping
    public List<MessageDTO> getMessages() {
        return receiver.getMessages();
    }
}
