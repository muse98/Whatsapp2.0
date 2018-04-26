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
public class DataStorageSettings {
    private MediaType mediaType;
    private NetworkType networkType;
    private Boolean autoDownload;
	
    public MediaType getMediaType() {
	return mediaType;
    }
        
    public void setMediaType(MediaType mediaType) {
	this.mediaType = mediaType;
    }
        
    public NetworkType getNetworkType() {
	return networkType;
    }
        
    public void setNetworkType(NetworkType networkType) {
	this.networkType = networkType;
    }
        
    public Boolean getAutoDownload() {
	return autoDownload;
    }
        
    public void setAutoDownload(Boolean autoDownload) {
	this.autoDownload = autoDownload;
    }

}
