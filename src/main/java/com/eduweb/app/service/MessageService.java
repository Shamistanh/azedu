package com.eduweb.app.service;

import com.eduweb.app.entity.Message;
import com.eduweb.app.repo.MessageRepo;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepo messageRepo;


    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public void sendMessage(Message message){
        messageRepo.save(message);
    }
}
