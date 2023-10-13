package de.hsaa.teamx.teamx.service;

import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.persistence.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

}
