package edu.aitu.oop;

import edu.aitu.oop.data.IDB;
import edu.aitu.oop.data.PostgresDB;
import edu.aitu.oop.entities.User;
import edu.aitu.oop.repositories.UserRepository;
import edu.aitu.oop.repositories.UserRepositoryImpl;
import edu.aitu.oop.services.UserService;

public class Main {
    public static void main(String[] args) {

        IDB db = new PostgresDB();
        UserRepository repo = new UserRepositoryImpl(db);
        UserService service = new UserService(repo);

        User user = service.createUser("Dana", "dana@mail.com");
        System.out.println(service.getUserById(user.getId()));
        System.out.println(service.getAllUsers());
    }
}

