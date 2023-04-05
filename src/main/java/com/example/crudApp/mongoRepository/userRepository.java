package com.example.crudApp.mongoRepository;

import com.example.crudApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User,Integer> {
}
