package com.example.realtime_chat_app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OutputMessage {

 private String sender;
 private String content;
 private String time;
}
