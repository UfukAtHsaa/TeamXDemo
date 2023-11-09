package de.hsaa.teamx.teamx.service;

import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.persistence.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Optional<Message> loadById(Long id) {
        return messageRepository.findById(id);
    }

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }
}
