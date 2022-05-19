package com.talerico.dndCreate;

import com.talerico.dndCreate.dao.CharacterRepository;
import com.talerico.dndCreate.dao.UserRepository;
import com.talerico.dndCreate.model.Alignment;
import com.talerico.dndCreate.model.Character;
import com.talerico.dndCreate.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


@SpringBootApplication
public class DndCreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndCreateApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepo, CharacterRepository characterRepo) {
		return args -> {
			User user = new User("dungeonMaster", "password", "email@email.com");
			Character character = new Character("Moonbreeze Shadowalker", Alignment.LAWFULGOOD);
			user.setCharacters(Arrays.asList(character));
			if(userRepo.findUserByEmailEquals(user.getEmail()).isPresent()) {
				System.out.println("A user with that email already exists.");
			} else {
				character = characterRepo.insert(character);
				user = userRepo.insert(user);
				System.out.println("User: " + user + " successfully saved.");
				System.out.println("Character: " + character + " successfully saved.");
			}
			Character character2 = new Character("Billy BlueJeans", Alignment.CHAOTICGOOD);
			character2 = characterRepo.insert(character2);
			user.setCharacters(Arrays.asList(character, character2));
			userRepo.save(user);
		};
	}

}
