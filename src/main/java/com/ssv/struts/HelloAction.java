package com.ssv.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/hello")
@Result(name="success" , location="/results.jsp")
public class HelloAction {

	
	public String firstName;
	
	public String execute() {
		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
