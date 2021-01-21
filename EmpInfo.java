package com.phonon.db;

public class EmpInfo {
private int empId;
private String empName;
private Double empSal;
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Double getEmpSal() {
	return empSal;
}
public void setEmpSal(Double empSal) {
	this.empSal = empSal;
}
public EmpInfo() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "EmpInfo [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}


public EmpInfo(int empId, String empName, Double empSal) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}


}
