/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import Settings.*;
/**
 *
 * @author sony
 */
public class Account {
    private Profile profile;
    private PrivacySettings privacySettings;
    private NotificationSettings notificationSettings;
    private DataStorageSettings dataStorageSettings;
	
    public Profile getProfile() {
        return profile;
    }
    
    public void setProfile(Profile profile) {
	this.profile = profile;
    }
    
    public PrivacySettings getPrivacySettings() {
	return privacySettings;
    }
    
    public void setPrivacySettings(String ps) {
	this.privacySettings = privacySettings;
    }
    
    public NotificationSettings getNotificationSettings() {
        return notificationSettings;
    }
    
    public void setNotificationSettings(NotificationSettings notificationSettings) {
	this.notificationSettings = notificationSettings;
    }
    
    public DataStorageSettings getDataStorageSettings() {
	return dataStorageSettings;
    }
    
    public void setDataStorageSettings(DataStorageSettings dataStorageSettings) {
	this.dataStorageSettings = dataStorageSettings;
    }	
}