package com.talerico.dndCreate.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.talerico.dndCreate.model.Character;
import org.springframework.stereotype.Repository;


@Repository
public interface CharacterRepository extends MongoRepository<Character, Integer> {
}
