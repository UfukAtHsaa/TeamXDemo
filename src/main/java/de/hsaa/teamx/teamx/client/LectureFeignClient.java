package de.hsaa.teamx.teamx.client;

import de.hsaa.teamx.teamx.domain.Lecture;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient(
        name = "lecture",
        url= "http://localhost:8081",
        configuration = LecturerFeignConfig.class
)
public interface LectureFeignClient {

    @RequestMapping(method = RequestMethod.GET, path = "/private/v1/lecture/{id}")
    Optional<Lecture> getLecture(@PathVariable String id);
}
