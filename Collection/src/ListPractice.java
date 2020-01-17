import java.util.ArrayList;

public class ListPractice {

	public static void main(String[] args) {

		Person person1 = new Person("sato",28);
		Person person2 = new Person("monzen",22);
		Person person3 = new Person("suzuki",31);

		ArrayList<Person> personList = new ArrayList<>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);

		for (Person p : personList) {
			System.out.println(p.getName() + "は" + p.getAge()+"才");
		}

		System.out.println("1件目は"+personList.get(0).getName()+"さんです");
	}

}
