package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.UserDto;
import by.tryputs.bookssharing.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity signUp(@RequestBody final UserDto userToSave) {
        userService.signUp(userToSave);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}