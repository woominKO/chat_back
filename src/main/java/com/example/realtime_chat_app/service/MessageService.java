package com.example.realtime_chat_app.service;

import com.example.realtime_chat_app.domain.Message;
import com.example.realtime_chat_app.dto.MessageDto;
import com.example.realtime_chat_app.repository.ChatMessageRepository;

import java.time.LocalDateTime;

public class MessageService {
    private final ChatMessageRepository chatMessageRepository;

    public Message save(MessageDto dto) {
        Message message = Message.builder()
                .roomId(dto.getRoomId())
                .sender(dto.getSender())
                .message(dto.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return chatMessageRepository.save(message);
    }
}
