package com.greenfox.pkrisz0.chatapp;

import com.greenfox.pkrisz0.chatapp.repository.ChatUserRepo;
import com.greenfox.pkrisz0.chatapp.repository.MessageRepo;
import com.greenfox.pkrisz0.chatapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatappApplication implements CommandLineRunner {

	@Autowired
	ChatUserRepo chatUserRepo;

	@Autowired
	ChatService chatService;

	@Autowired
	MessageRepo messageRepo;

	public static void main(String[] args) {
		SpringApplication.run(ChatappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
