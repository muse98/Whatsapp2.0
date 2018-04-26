/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Settings;

/**
 *
 * @author sony
 */
public class NotificationSettings {
    private NotificationType messageNotification;
    private NotificationType groupMessageNotification;
    private NotificationType callNotification;
	
    public NotificationType getMessageNotification() {
	return messageNotification;
    }
        
    public void setMessageNotification(NotificationType messageNotification) {
	this.messageNotification = messageNotification;
    }
        
    public NotificationType getGroupMessageNotification() {
	return groupMessageNotification;
    }
        
    public void setGroupMessageNotification(NotificationType groupMessageNotification) {
	this.groupMessageNotification = groupMessageNotification;
    }
        
    public NotificationType getCallNotification() {
	return callNotification;
    }
        
    public void setCallNotification(NotificationType callNotification) {
	this.callNotification = callNotification;
    }
}
