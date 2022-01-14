package com.PostalServices;

import java.util.ArrayList;

public class PostOffice implements Item{

	private ArrayList<Post> post;
	private ArrayList<Observer> Obs;
	
	public PostOffice() {
		post = new ArrayList();
		Obs = new ArrayList();
	}
	
	public void AddPost(Post p) {
		post.add(p);
		Notify();
	}
	
	public ArrayList<Post> getStatus(){
		return post;
	}
	
	public void Attach(Observer o) {
		Obs.add(o);
	}
	
	public void Dettach(Observer o) {
		Obs.remove(o);
	}
	
	public void Notify() {
		for(int i=0; i<Obs.size();i++) {
			Obs.get(i).update(this);
		}
	}

	@Override
	public void PostType() {
		System.out.print("Postal Services ---> ");
	}
}