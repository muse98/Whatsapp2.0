/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import java.sql.Date;

import Contact.Contact;
/**
 *
 * @author sony
 */
public class GroupConversation {
    private String name;
    private Date creationDate;
    private String[] phoneNumbers;
    private Contact admin;
	
    // TODO: phoneNumbers should be also initialized in the constructor.
    public GroupConversation(String name, Date creationDate, Contact admin) {
	this.name = name;
	this.creationDate = creationDate;
        this.admin = admin;
    }
	
    public String getName() {
	return name;
    }
	
    public void setName(String name) {
	this.name = name;
    }
	
    public Date getCreationDate() {
	return creationDate;
    }

    public String[] getPhoneNumbers() {
	return phoneNumbers;
    }
	
    public void setPhoneNumbers(String[] phoneNumbers) {
	this.phoneNumbers = phoneNumbers;
    }
	
    public Contact getAdmin() {
	return admin;
    }
	
    public void setAdmin(Contact admin) {
	this.admin = admin;
    }

}
