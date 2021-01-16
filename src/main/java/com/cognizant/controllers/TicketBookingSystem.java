package com.cognizant.controllers;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.request.bindings.PassengerInfo;
import com.cognizant.response.bindings.TicketInfo;

@RestController
@RequestMapping("/ticket")
public class TicketBookingSystem {
	@PostMapping(path="/booking",
			     consumes= {"application/json","application/xml"},
				produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<TicketInfo> bookticket(@RequestBody PassengerInfo passenger){
		TicketInfo ticket=new TicketInfo();
		ticket.setTicketnumber(422154589l);
		ticket.setTicketstatus("confirmed");
		ticket.setTicketprice(1250.5f);
		ticket.setTrainnumber(passenger.getTrainnumber());
		ticket.setFromstation(passenger.getFromstation());
		ticket.setTostation(passenger.getTostation());
		ticket.setName(passenger.getName());
		Calendar cal=Calendar.getInstance();
		ticket.setBookeddate(cal.get(Calendar.DATE)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+(cal.get(Calendar.YEAR)+1));
		ticket.setDoj(passenger.getDoj());
		System.out.println(passenger);
	    return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
		
	}

}
