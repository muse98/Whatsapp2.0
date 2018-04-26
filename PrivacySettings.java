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
public class PrivacySettings {
    private Visibility whoCanSeeProfilePhoto;
    private Visibility whoCanSeeStatusUpdate;
    private Visibility whoCanSeeLocalization;
    private Visibility whoCanSeeLastSeen;
	
    public Visibility getWhoCanSeeProfilePhoto() {
	return whoCanSeeProfilePhoto;
    }
    
    public void setWhoCanSeeProfilePhoto(Visibility whoCanSeeProfilePhoto) {
	this.whoCanSeeProfilePhoto = whoCanSeeProfilePhoto;
    }

    public Visibility getWhoCanSeeStatusUpdate() {
	return whoCanSeeStatusUpdate;
    }
    
    public void setWhoCanSeeStatusUpdate(Visibility whoCanSeeStatusUpdate) {
	this.whoCanSeeStatusUpdate = whoCanSeeStatusUpdate;
    }
    
    public Visibility getWhoCanSeeLocalization() {
	return whoCanSeeLocalization;
    }
    
    public void setWhoCanSeeLocalization(Visibility whoCanSeeLocalization) {
	this.whoCanSeeLocalization = whoCanSeeLocalization;
    }
    
    public Visibility getWhoCanSeeLastSeen() {
	return whoCanSeeLastSeen;
    }
    
    public void setWhoCanSeeLastSeen(Visibility whoCanSeeLastSeen) {
	this.whoCanSeeLastSeen = whoCanSeeLastSeen;
    }

}
