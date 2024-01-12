package com.example.remoteworker.service;

import com.example.remoteinterface.model.User;
import com.example.remoteinterface.service.RemoteServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RemoteService implements RemoteServiceInterface {
    @Override
    public User sayHello(User user) {
        log.info("run sayHello: " + user);
        return user;
    }
}
