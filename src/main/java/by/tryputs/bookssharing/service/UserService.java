package by.tryputs.bookssharing.service;

import by.tryputs.bookssharing.converter.basic.user.UserRequestConverter;
import by.tryputs.bookssharing.dto.user.UserSignUpDto;
import by.tryputs.bookssharing.entity.Role;
import by.tryputs.bookssharing.entity.User;
import by.tryputs.bookssharing.repository.RoleRepository;
import by.tryputs.bookssharing.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
@Transactional
public class UserService implements UserDetailsService {

    private UserRepository userRepository;
    private UserRequestConverter userRequestConverter;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    private static final String USER_ROLE_NAME = "USER";

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        by.tryputs.bookssharing.entity.User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User doesn't exist!");
        }
        return new org.springframework.security.core.userdetails.User(email, user.getPassword(), generateAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> generateAuthorities(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.toString())).collect(Collectors.toList());
    }

    public Long signUp(UserSignUpDto userToSave) {
        final Role userRole = roleRepository.findByName(USER_ROLE_NAME);

        final User user = userRequestConverter.convertToDbo(userToSave);
        List<Role> roles = new ArrayList<>();
        roles.add(userRole);
        user.setRoles(roles);

        final String password = userToSave.getPassword();
        final String encodedPassword = passwordEncoder.encode(password);

        user.setPassword(encodedPassword);

        return userRepository.save(user).getId();
    }

    public Long getUserIdByUserName(String userName) {
        User user = userRepository.findByEmail(userName);
        if (user == null) {
            throw new UsernameNotFoundException("User doesn't exist!");
        }
        return user.getId();
    }
}