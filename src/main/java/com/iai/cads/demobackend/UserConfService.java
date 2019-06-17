package com.iai.cads.demobackend;

import com.github.javafaker.Faker;
import com.iai.cads.demobackend.model.UserConf;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class UserConfService {


    private int counter=1;
    private Faker faker = new Faker();

    public UserConf createUserConf() {
        return UserConf.builder()
                .id(counter++).sessionId(counter+1000)
                .command(faker.chuckNorris().fact())
                .build();
    }
}
