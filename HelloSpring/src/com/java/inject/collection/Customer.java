package com.java.inject.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private List<Object> listOfObj;
	private Set<Object> setOfObj;
	private Map<Object, Object> mapOfObj;
	private Properties props;
	
	public void setListOfObj(List<Object> listOfObj) {
		this.listOfObj = listOfObj;
	}
	
	public void setSetOfObj(Set<Object> setOfObj) {
		this.setOfObj = setOfObj;
	}
	
	public void setMapOfObj(Map<Object, Object> mapOfObj) {
		this.mapOfObj = mapOfObj;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public List<Object> getListOfObj() {
		return listOfObj;
	}
	
	public Set<Object> getSetOfObj() {
		return setOfObj;
	}
	
	public Map<Object, Object> getMapOfObj() {
		return mapOfObj;
	}
	
	public Properties getProps() {
		return props;
	}
}
