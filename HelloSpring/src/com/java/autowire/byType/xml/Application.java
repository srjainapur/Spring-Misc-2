package com.java.autowire.byType.xml;

public class Application {
	private ApplicationUser appUser;
	
	public ApplicationUser getAppUser() {
		return appUser;
	}
	
	public void setAppUser(ApplicationUser appUser) {
		this.appUser = appUser;
	}
	
	public String toString() {
        return "Application [applicationUser=" + appUser + "]";
    }
}
