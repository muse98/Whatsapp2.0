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
public class Call {
    private CallType callType;
    private Date time;
    private int durationInSeconds;
    private CallCategory callCategory;
    private Contact withWhom;
	
    public Call(CallType callType, Date time, int durationInSeconds, Contact withWhom) {
	this.callType = callType;
	this.time = time;
	this.durationInSeconds = durationInSeconds;
        getCallCategory();
	this.withWhom = withWhom;
    }
	
    public CallType getCallType() {
	return callType;
    }
        
    public Date getTime() {
	return time;
    }
        
    public int getDurationInSeconds() {
	return durationInSeconds;
    }
    
    public CallCategory getCallCategory(){
        return callCategory;
    }
        
    public Contact getWithWhom() {
	return withWhom;
    }

}
