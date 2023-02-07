package Vivek_sir;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo3 {
	ArrayList<ArrayList<String>> a1=new ArrayList<ArrayList<String>>();
	ArrayList<String> a2=new ArrayList<String>();
	Scanner Sc = new Scanner(System.in);
	public void Add() {
		String name,price;
		int n;
		System.out.println("enter the limit");
		n=Sc.nextInt();
		for(int i = 1;i<=n;i++) {
	ArrayList<String> a2=new ArrayList<String>();
		System.out.println("Enter the name of item");
		name=Sc.next();
		System.out.println("Enter the name of price");
		price=Sc.next();
		a2.add(name);
		a2.add(price);
		a1.add(a2);
		}
		
	}
	public void view() {
		System.out.println("List is "+a1);
	}
	public void update() {
		String outerindex,innerindex,updateprice;
		System.out.println("enter the outer indexof item");
		outerindex=Sc.next();
		System.out.println("enter the inner indexof item");
		innerindex=Sc.next();
		System.out.println("enter the price of item");
		updateprice=Sc.next();
		a1.get(Integer.parseInt(outerindex)).set(Integer.parseInt(innerindex), updateprice);
	}

	public static void main(String[] args) {
	ArrayDemo3 d3=new ArrayDemo3();
	d3.Add();
	d3.view();
	d3.update();
	d3.view();
	}

}
