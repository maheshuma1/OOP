package com.PostalServices;

public interface Item {

	void Attach(Observer o);
	void Dettach(Observer o);
	void Notify();
	public void PostType();
}
