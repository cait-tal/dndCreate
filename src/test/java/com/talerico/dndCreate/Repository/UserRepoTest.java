package com.talerico.dndCreate.Repository;

import com.talerico.dndCreate.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepoTest {

    @Autowired
    UserRepository userRepo;


}
