package com.springcore.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//	@Autowired  //Properties annotation
//	@Qualifier("temp")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired    //Setter injection call
	@Qualifier("temp2")
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
