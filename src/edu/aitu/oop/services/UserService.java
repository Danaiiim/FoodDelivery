package edu.aitu.oop.services;

import edu.aitu.oop.entities.User;
import edu.aitu.oop.exceptions.InvalidInputException;
import edu.aitu.oop.repositories.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User createUser(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new InvalidInputException("Name cannot be empty");
        }
        if (email == null || email.isEmpty()) {
            throw new InvalidInputException("Email cannot be empty");
        }
        return repo.create(new User(name, email));
    }

    public User getUserById(int id) {
        return repo.findById(id);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
