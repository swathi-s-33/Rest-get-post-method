package com.cognizant.request.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {
	private String name;
	private String fromstation;
	private String tostation;
	private String doj;
	private Integer trainnumber;

}
