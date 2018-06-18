package com.eureka.providerticket.controller;


import com.eureka.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ASUS
 */
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping(value = "ticket")
    public String getTicket(){
        System.out.println("8762");
        return ticketService.getTicket();
    }
}
