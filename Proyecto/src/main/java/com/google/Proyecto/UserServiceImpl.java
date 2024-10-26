package com.google.Proyecto;

import com.google.Proyecto.User;
import com.google.Proyecto.UserService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    private final Map<Long, User> userDatabase = new HashMap<>();
    private Long userIdCounter = 1L;

    @Override
    public User createUser(User user) {
        user.setId(userIdCounter++);
        userDatabase.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userDatabase.get(id));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userDatabase.values());
    }

    @Override
    public User updateUser(Long id, User user) {
        user.setId(id);
        userDatabase.put(id, user);
        return user;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDatabase.remove(id) != null;
    }
}