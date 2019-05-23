package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.UserDto;
import by.tryputs.bookssharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserController extends AbstractController<UserDto, UserService>{

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity signUp(@RequestBody final UserDto userToSave) {
        userService.signUp(userToSave);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}