package com.phonon.db;

public abstract class AppQueries {
	public static String CREATE_EMP_TABLE = "create table emp_info(\r\n" + 
			"		emp_name varchar(50),\r\n" + 
			"		emp_salary float,\r\n" + 
			" 		emp_id int,\r\n" +
			"	)";
	
	public static String INSERT_EMP ="insert into emp_info values(%d,'%s',%.2f)";
	
	public static String UPDATE_EMP = "update emp_info set emp_name='%s',emp_salary=%.2f,"+"where emp_id=%d";
	public static String DELETE_EMP = "delete from emp_info where emp_id=%d";
	public static String GET_EMP= "select * from emp_info where emp_id=%d";
	public static String GET_ALL_EMPS= "select * from emp_info";

	public static String getInsertQuery(EmpInfo emp) {
		return null;
	}
	
	public static String getUpdateQuery(EmpInfo emp) {
		return null;
	}
	
	public static String getDeleteQuery(EmpInfo emp) {
		return null;
	}
	
	public static String getGetSingleQuery(int empId) {
		return null;
	}
	
	public static String getGetAllQuery() {
		return null;
	}
	
	
}