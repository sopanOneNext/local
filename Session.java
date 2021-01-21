package com.phenon.session;

import java.util.ArrayList;
import java.util.List;

import com.phenon.peson.Person;

public class Session 
{
	ArrayList<Person> pList =new ArrayList<Person>();
	
	public List<Person> savePerson(Person p) {
		
		pList.add(p);
		return pList;
	}
	
	
	
}
