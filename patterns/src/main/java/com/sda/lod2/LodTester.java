package com.sda.lod2;

public class LodTester {
	
	public static void main(String[] args) {
		User user = new User("Mario" , new Profile("User", new Photo("My first photo.jpg")));
		
		String username = null;
		String path = null;
		
		//why this is not good?
		//We need to make sure that the profile exists first, then use the name if it does.
		//Also we are showing out guts to the outside world - showing that user has a getProfile method etc.
		//So it is better to create a new method in user class called get name and check there if the
		//profile exists. RULE 1 - Methods can interact with other methods in the class.
		if(user.getProfile() != null) {
			username = user.getProfile().getName();
		}
		
		//so instead this method above we can now use
		username = user.getName();
			
		//we have nested method here. Like 3 arrows. LOD states you need to have ONE.
		//instead of A.B.C.D, you must have A.B
		//YOU CAN CHAIN SIMILAR METHODS FROM THE SAME CLASS, but not from different classes
		//DONT ASK USER object what he knows! doo you know/have profile etc?
		
		if(user.getProfile() != null && user.getProfile().getPhoto() != null) {
			path = user.getProfile().getPhoto().getPath();
		}
		
		//so instead this method and checking above we simply use
		//looks lots cleaner, right?
		//rather tell thim what to do. Get me the photo path!
		path = user.getPhotoPath();
		
		//or when fixed USE lod we can do
		path = user.getPhotoPathNew();
		
		System.out.println("The path to " + username + "'s photo is " + path);
		
	}

}

class User {
	
	private String username;
	private Profile profile;
	
	public User(String username, Profile profile) {
		this.username = username;
		this.profile = profile;
	}

	public String getUsername() {
		return username;
	}

	public Profile getProfile() {
		return profile;
	}
	
	public String getName() {
		if(profile != null) {
			return profile.getName();
		} else {
			return null;
		}
	}
	//NOW the USER object violated the law of demeter, because it is chaining method here.
	public String getPhotoPath() {
		if(profile != null && profile.getPhoto() != null) {
			return profile.getPhoto().getPath();
		} else {
			return null;
		}
	}
	
	//so finally after adding the getPhotoPath in Profile class
	//we can refactor this above method to
	public String getPhotoPathNew() {
		if(profile != null) {
			return profile.getPhotoPath();
		} else {
			return null;
		}
	}
	
	
}

class Profile {
	
	private String name;
	private Photo photo;
	
	public Profile(String name, Photo photo) {
		this.name = name;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public Photo getPhoto() {
		return photo;
	}
	
	public String getPhotoPath() {
		if(photo != null) {
			return photo.getPath();
		} else {
			return null;
		}
	}
	
}

class Photo {
	
	private String path;

	public Photo(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	
	
}
