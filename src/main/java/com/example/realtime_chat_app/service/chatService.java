package com.example.realtime_chat_app.service;

import com.example.realtime_chat_app.domain.Message;
import com.example.realtime_chat_app.dto.OutputMessage;
import com.example.realtime_chat_app.repository.ChatMessageRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class chatService {
    private final ChatMessageRepository chatMessageRepository;

    public chatService(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    public OutputMessage processMessage(Message message) {
        String time = new SimpleDateFormat("HH:mm").format(new Date());

        Message entity = new Message();
        entity.setSender(message.getSender());
        entity.setContent(message.getContent());
        entity.setTime(time);
        chatMessageRepository.save(entity);

        return new OutputMessage(message.getSender(), message.getContent(),time);
    }
}
