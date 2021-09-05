package com.gl.pack;

//import com.gl.pack.SuperDepartment;

class Admin extends SuperDepartment{
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your Documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}
