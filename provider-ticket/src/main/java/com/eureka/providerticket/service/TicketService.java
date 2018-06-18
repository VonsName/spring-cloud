package com.eureka.providerticket.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ASUS
 */
@Service
public class TicketService {

    @Value("${server.port}")
    private String port;
    public String getTicket(){
        return "天天向上"+port;
    }
}
