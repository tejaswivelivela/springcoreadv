package com.teju.spring.springcoreadv;

public class Employee {


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
