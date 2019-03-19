package com.java.inject.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;
	private Properties addressProp;
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
	public List<String> getAddressList() {
		return addressList;
	}
	
	public Set<String> getAddressSet() {
		return addressSet;
	}
	
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
	
	public Properties getAddressProp() {
		return addressProp;
	}
}
