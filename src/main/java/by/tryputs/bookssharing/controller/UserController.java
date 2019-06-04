package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<Long> signUp(@RequestBody final UserSignUpDto userToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body( userService.signUp(userToSave));
    }
}