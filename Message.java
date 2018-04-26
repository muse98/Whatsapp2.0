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
public class Message {
    private String message;
    private Date receivedDateAndTime;
    private Contact who;
	
    public Message(String message, Date receivedDateAndTime, Contact who) {
	this.message = message;
	this.receivedDateAndTime = receivedDateAndTime;
	this.who = who;
    }

    public String getMessage() {
	return message;
    }

    public Date getReceivedDateAndTime() {
	return receivedDateAndTime;
    }

    public Contact getWho() {
	return who;
    }

}
