package com.PostalServices;

public class SpeedPost extends Decorator{

	public SpeedPost(Item item) {
		super(item);
	}
	
	@Override
	public void PostType() {
		super.PostType();
		System.out.println("Speed Post, Available");
	}
}