package com.sda.lod;

public class Employee {

    private String name;
    private Email email;
    private ContactNumber contactNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ContactNumber contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isValidPrimaryEmailAddress() {
        if(email != null && email.getPrimaryEmailAddress() != null) {
            return true;
        }
        return false;
    }

    public boolean isValidMobile() {
        return contactNumber.getMobile() != 0;
    }
    
    public String getPrimaryEmailAddress() {
    	if(email != null) {
    		return email.getPrimaryEmailAddress();
    	}
		return null;
    }
}