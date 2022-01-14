package com.PostalServices;

public abstract class Decorator implements Item {

	private Item item;
	
	public Decorator(Item item) {
		this.item = item;
	}
	
	@Override
	public void PostType() {
		this.item.PostType();
	}

	
	  @Override
	  public void Attach(Observer o) { // TODO Auto-generated method stub
	  
	  }
	 

	@Override
	public void Dettach(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		
	}
}