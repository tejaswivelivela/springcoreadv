package com.teju.spring.springcoreadv;

public class Address {
public int Hno;

@Override
public String toString() {
	return "Address [Hno=" + Hno + ", Street=" + Street + ", City=" + City + "]";
}
public int getHno() {
	return Hno;
}
public void setHno(int hno) {
	Hno = hno;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String Street;
public String City;


}
