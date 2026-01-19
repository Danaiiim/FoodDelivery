package edu.aitu.oop.repositories;

import edu.aitu.oop.entities.User;
import java.util.List;

public interface UserRepository {
    User create(User user);
    User findById(int id);
    List<User> findAll();
}
