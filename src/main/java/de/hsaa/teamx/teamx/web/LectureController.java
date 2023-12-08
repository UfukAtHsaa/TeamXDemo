package de.hsaa.teamx.teamx.web;

import de.hsaa.teamx.teamx.domain.Lecture;
import de.hsaa.teamx.teamx.domain.Message;
import de.hsaa.teamx.teamx.service.LectureService;
import de.hsaa.teamx.teamx.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class LectureController {

    private final LectureService lectureService;

    public LectureController(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    @GetMapping("/lecture/{id}")
    public ResponseEntity<Lecture> getMessage(@PathVariable String id) {
        Optional<Lecture> message = lectureService.loadById(id);
        if (message.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(message.get(), HttpStatus.OK);
        }
    }
}
