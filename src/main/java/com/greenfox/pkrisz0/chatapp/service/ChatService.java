package com.greenfox.pkrisz0.chatapp.service;

import com.greenfox.pkrisz0.chatapp.model.Log;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ChatService {

    public void checkEnvironment(HttpServletRequest request){
        if (System.getenv("CHAT_APP_LOGLEVEL").equals("INFO")){
            System.out.println(new Log(request));
        } else if (System.getenv("CHAT_APP_LOGLEVEL").equals("ERROR")){
            System.err.println(new Log(request));
        }
    }
}
