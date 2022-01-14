package com.PostalServices;

public class RegisteredPost extends Decorator{

	public RegisteredPost(Item item) {
		super(item);
	}
	
	@Override
	public void PostType() {
		super.PostType();
		System.out.println("Registered Post, Available");
	}
}