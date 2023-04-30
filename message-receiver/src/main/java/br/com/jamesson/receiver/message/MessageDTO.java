package br.com.jamesson.receiver.message;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
    private LocalDateTime timestamp;
    private String message;

    public MessageDTO(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }
}