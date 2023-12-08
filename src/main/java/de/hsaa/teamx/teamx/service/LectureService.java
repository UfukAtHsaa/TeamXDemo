package de.hsaa.teamx.teamx.service;

import de.hsaa.teamx.teamx.client.LectureFeignClient;
import de.hsaa.teamx.teamx.domain.Lecture;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LectureService {

    private final LectureFeignClient lectureFeignClient;

    public LectureService(LectureFeignClient lectureFeignClient) {
        this.lectureFeignClient = lectureFeignClient;
    }

    public Optional<Lecture> loadById(String id) {
        return lectureFeignClient.getLecture(id);
    }
}
