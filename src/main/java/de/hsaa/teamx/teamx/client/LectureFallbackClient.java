package de.hsaa.teamx.teamx.client;

import de.hsaa.teamx.teamx.domain.Lecture;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LectureFallbackClient implements LectureFeignClient {

    @Override
    public Optional<Lecture> getLecture(String id) {
        System.err.println("Service unavailable: RETURN EMPTY");
        return Optional.empty();
    }
}
