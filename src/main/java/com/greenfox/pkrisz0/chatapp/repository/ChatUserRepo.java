package com.greenfox.pkrisz0.chatapp.repository;

import com.greenfox.pkrisz0.chatapp.model.ChatUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChatUserRepo extends CrudRepository<ChatUser, Integer> {
            List<ChatUser> findChatUserByUserName(String name);
}
