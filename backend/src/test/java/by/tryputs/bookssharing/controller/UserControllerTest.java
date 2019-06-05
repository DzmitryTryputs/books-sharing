package by.tryputs.bookssharing.controller;

import by.tryputs.bookssharing.AbstractSpringMvcTest;
import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.mock.UserMock;
import by.tryputs.bookssharing.service.UserService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class UserControllerTest extends AbstractSpringMvcTest {

    @Mock
    private UserService userService;

    @Autowired
    @InjectMocks
    private UserController userController;

    @Test
    public void signUp() throws Exception {
        UserSignUpDto userSignUpDtoMock = UserMock.getUserSignUpDtoMock();
        Mockito.when(userService.signUp(userSignUpDtoMock)).thenReturn(1L);

        getMockMvc().perform(MockMvcRequestBuilders.post("/users/signup")
                .contentType(MediaType.APPLICATION_JSON).content(toJson(userSignUpDtoMock)))
                .andExpect(MockMvcResultMatchers.content().json("1"));
    }
}
