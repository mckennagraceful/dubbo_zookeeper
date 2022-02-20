package com.example.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class TicketServiceImpl implements TicketService{

    @Override
    public String getTicket() {
        return "your ticket here";
    }

}
