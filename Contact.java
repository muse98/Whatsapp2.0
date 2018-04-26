/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

/**
 *
 * @author sony
 */
public class Contact {
    private Boolean isBlocked;
    private String info;
	
    public Boolean isBlocked() {
	return this.isBlocked;
    }
	
    public Contact(String info) {
	this.isBlocked = false;
        this.info = info;
    }
	
    public String viewInfo() {
        return this.info;
    }
	
    public void setInfo(String newInfo) {
        this.info = newInfo;
    }
	
    public void block() {
	this.isBlocked = true;
    }
	
    public void unblock() {
	this.isBlocked = false;
    }

}
