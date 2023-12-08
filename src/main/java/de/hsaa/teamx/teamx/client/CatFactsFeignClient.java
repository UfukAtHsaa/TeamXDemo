package de.hsaa.teamx.teamx.client;

import de.hsaa.teamx.teamx.domain.CatFact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value= "CatFacts", url = "https://catfact.ninja")
public interface CatFactsFeignClient {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/fact",
            consumes = "application/json"
    )
    CatFact getCatFact();
}
