package main;

import java.util.ArrayList;
import java.util.List;

import objects.Items;
import objects.Users;

public class Main {

	public static void main(String[] args) {
	System.out.println("Boo!!");

	Items item1=new Items(1,"toy","plaything");
	Items item2=new Items(2,"food","eat");
	Users user=new Users("Jim","Doyle");

	user.addItem(item1);
	user.addItem(item2);

	System.out.println(user.getFirst()+" "+ user.getLast());
	System.out.println(item1.getId()+". "+item1.getName()+": "+item1.getDecription());
	System.out.println("---------------------------------");
	System.out.println();
	System.out.println("---------------------------------");
	user.getItems().forEach(item -> System.out.println(item.getId()+". "+item.getName()+": "+item.getDecription()));
	}
}
