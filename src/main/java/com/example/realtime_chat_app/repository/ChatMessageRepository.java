package com.example.realtime_chat_app.repository;

import com.example.realtime_chat_app.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatMessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByRoomId(String roomId);
}

