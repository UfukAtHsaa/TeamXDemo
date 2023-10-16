package de.hsaa.teamx.teamx.web;

import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello world!", HttpStatus.OK);
    }

    @PostMapping("/message")
    public ResponseEntity<Message> postMessage(@RequestBody String messageContent) {
        Message message = new Message();
        message.setMessage(messageContent);
        return new ResponseEntity<>(messageService.saveMessage(message), HttpStatus.OK);
    }
}