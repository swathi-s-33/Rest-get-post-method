package com.cognizant.response.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	private String ticketstatus;
	private float ticketprice;
	private long ticketnumber;
	private String name;
	private String fromstation;
	private String tostation;
	private String doj;
	private Integer trainnumber;
	private String bookeddate;
}
