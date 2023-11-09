package de.hsaa.teamx.teamx.web;

import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/message/{id}")
    public ResponseEntity<Message> getMessage(@PathVariable Long id) {
        Optional<Message> message = messageService.loadById(id);
        if (message.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(message.get(), HttpStatus.OK);
        }
    }

    @GetMapping("/message")
    public ResponseEntity<List<Message>> getMessages() {
        return new ResponseEntity<>(messageService.getMessages(), HttpStatus.OK);
    }

    @PostMapping("/message")
    public ResponseEntity<Message> postMessage(@RequestBody Message message) {

        return new ResponseEntity<>(messageService.saveMessage(message), HttpStatus.OK);
    }
}
