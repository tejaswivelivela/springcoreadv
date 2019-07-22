package com.teju.spring.springcoreadv.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	

@Autowired
@Qualifier("hai1")
private Address address;

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}



}
