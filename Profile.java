/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.sql.Date;
/**
 *
 * @author sony
 */
public class Profile {
    private String phoneNumber;
    private String name;
    private String about;
    private String picturePath;
    private String status;
    private Date lastSeen;
    private Boolean isConnected;
    private String location;
	
    public Profile(String phoneNumber, String name, String about,String status) {
	this.phoneNumber = phoneNumber;
	this.about = about;
	this.name = name;
        this.status = status;
    }
	
    public String getPhoneNumber() {
	return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
    public String getAbout() {
	return about;
    }
    
    public void setAbout(String about) {
        this.about = about;
    }
    
    public String getPicturePath() {
	return picturePath;
    }
    
    public void setPicturePath(String picturePath) {
	this.picturePath = picturePath;
    }
    
    public String getStatus() {
	return status;
    }
    
    public void setStatus(String status) {
	this.status = status;
    }
    
    public Date getLastSeen() {
	return lastSeen;
    }
    
    public void setLastSeen(Date lastSeen) {
	this.lastSeen = lastSeen;
    }
    
    public Boolean getIsConnected() {
        return isConnected;
    }
    
    public void setIsConnected(Boolean isConnected) {
	this.isConnected = isConnected;
    }
    
    public String getLocation() {
	return location;
    }
        
    public void setLocation(String location) {
	this.location = location;
    }
	
    @Override
    public String toString() {
	return String.format("Profile: <name: %s> <about: %s> <number: %s> <status: %s>",
        this.name, this.about, this.phoneNumber,this.status);
    }
}
