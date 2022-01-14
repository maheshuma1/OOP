package com.PostalServices;

import java.util.ArrayList;

public class Person implements Observer{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void checkPost(ArrayList<Post> Post) {
		for(int i=0; i<Post.size();i++) {
			if(name.compareTo(Post.get(i).receiverName) == 0) {
				System.out.println(name+","+Post.get(i).info);
			}
		}
	} 
	
	public void update(Object o) {
		if(o instanceof PostOffice) {
			PostOffice p = (PostOffice) o;
			checkPost(p.getStatus());
		}
	}
}