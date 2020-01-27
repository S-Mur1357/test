package com.internousdev.multipledisplay.action;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.multipledisplay.util.Person;
import com.opensymphony.xwork2.ActionSupport;

public class MultipleDisplayAction extends ActionSupport{

		List<Person> personList = new ArrayList<>();

		public String execute() {

			String result = SUCCESS;

			Person p1 = new Person("sato",28);
			Person p2 = new Person("monzen",22);
			Person p3 = new Person("suzuki",31);

			personList.add(p1);
			personList.add(p2);
			personList.add(p3);

			return result;
		}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList ) {
		this.personList = personList;
	}
}
