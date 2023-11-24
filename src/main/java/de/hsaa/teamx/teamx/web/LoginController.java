package de.hsaa.teamx.teamx.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class LoginController {

    @GetMapping("/login")
    public ResponseEntity<Void> postMessage() {

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
