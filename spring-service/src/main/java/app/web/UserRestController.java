package app.web;

import app.model.AuthenticatedUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping(path = "/authenticate", produces = MediaType.APPLICATION_XML_VALUE)
    public AuthenticatedUser authenticateUser() {
        return new AuthenticatedUser("Kofi",
                "232343", true);
    }
}
