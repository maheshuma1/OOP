package com.PostalServices;

public class Main {

	public static void main(String[] args) {
		PostOffice po = new PostOffice();
		Person jack = new Person("Jack");
		Person lenin = new Person("lenin");
		Person jenifer = new Person("jenifer");
		Post p = new Post("Jack","jenifer","Hello..You got a Post");
		
		po.Attach(jack);
		po.Attach(lenin);
		po.Attach(jenifer);
		
		po.AddPost(p);
//		Item SpeedPost = new SpeedPost(po);
//		SpeedPost.PostType();
		
 		
		Item Telegram = new Telegram(po);
		Telegram.PostType();
	}
}
