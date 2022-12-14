package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import ru.kata.spring.boot_security.demo.entities.Role;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    void deleteUserById(Long id);

    String saveUser(User user, BindingResult bindingResult);

    String updateUser(User user, BindingResult bindingResult);

    User getUserById(Long id);

    User findUserByEmail(String email);

    List<Role> getListRoles ();

    PasswordEncoder getPasswordEncoder();

    User passwordCoder (User user);
}
