package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static by.tryputs.bookssharing.service.TokenAuthenticationService.HEADER_STRING;

@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<Long> signUp(@RequestBody final UserSignUpDto userToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.signUp(userToSave));
    }

    @PostMapping(value = "/logout")
    @ApiOperation(value = "Search users")
    public void logoutUser(@RequestHeader(HEADER_STRING) final String token) {
        userService.logout(token);
    }
}