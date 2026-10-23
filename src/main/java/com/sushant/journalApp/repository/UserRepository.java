package com.sushant.journalApp.repository;

import com.sushant.journalApp.entity.JournalEntry;
import com.sushant.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

}
