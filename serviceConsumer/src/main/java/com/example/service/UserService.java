package com.example.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //要去注册中心拿服务
    @Reference
    TicketService ticketService;

    public void buyTicket() {
        System.out.println(ticketService.getTicket());
    }

}
