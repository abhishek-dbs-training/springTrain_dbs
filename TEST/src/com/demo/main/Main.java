package com.demo.main;

import com.demo.entity.Product;
public class Main {
	public static void main(String args[]) {
	Product p = new Product();
	p.setId(10);
	p.setName("kite");
	p.setColor("red");
	System.out.println(p.getId());
}
}