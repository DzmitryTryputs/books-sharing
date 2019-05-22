package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.UserToSave;
import by.tryputs.bookssharing.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity signUp(@RequestBody final UserToSave userToSave) {
        userService.signUp(userToSave);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
