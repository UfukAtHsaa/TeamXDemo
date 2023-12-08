package de.hsaa.teamx.teamx.service;

import de.hsaa.teamx.teamx.client.CatFactsFeignClient;
import de.hsaa.teamx.teamx.domain.CatFact;
import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.persistence.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    private final CatFactsFeignClient catFactsFeignClient;

    public MessageService(MessageRepository messageRepository, CatFactsFeignClient catFactsFeignClient) {
        this.messageRepository = messageRepository;
        this.catFactsFeignClient = catFactsFeignClient;
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Optional<Message> loadById(Long id) {
        Optional<Message> message = messageRepository.findById(id);
        CatFact catFact = catFactsFeignClient.getCatFact();
        message.ifPresent(value -> value.setFunFact(
                catFact.getFact()
        ));
        return message;
    }

    public List<Message> getMessages() {
        return messageRepository.findAll();
    }
}
