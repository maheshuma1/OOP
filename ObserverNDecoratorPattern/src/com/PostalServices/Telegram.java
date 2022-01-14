package com.PostalServices;

public class Telegram extends Decorator{

	public Telegram(Item item) {
		super(item);
	}
	
	@Override
	public void PostType() {
		super.PostType();
		System.out.println("Telegram, Post Available");
	}

}
