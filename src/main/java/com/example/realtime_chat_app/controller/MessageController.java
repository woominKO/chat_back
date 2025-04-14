package com.example.realtime_chat_app.controller;

import com.example.realtime_chat_app.domain.Message;
import com.example.realtime_chat_app.dto.OutputMessage;
import com.example.realtime_chat_app.service.chatService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    private final chatService chatService;

    public MessageController(chatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage greeting(Message message) throws Exception {
        return chatService.processMessage(message);
    }
}

