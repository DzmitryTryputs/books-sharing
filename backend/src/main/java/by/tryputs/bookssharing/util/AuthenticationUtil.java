package by.tryputs.bookssharing.util;

import by.tryputs.bookssharing.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthenticationUtil {

    private UserService userService;

    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public Long getUserId() {
        return userService.getUserIdByUserName(getAuthentication().getName());
    }
}