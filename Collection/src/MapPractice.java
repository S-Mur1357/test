import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {

		Person person1 = new Person("sato",28);
		Person person2 = new Person("monzen",22);
		Person person3 = new Person("suzuki",31);

		HashMap<String,Person> personMap = new HashMap<>();
		personMap.put("佐藤", person1);
		personMap.put("門前", person2);
		personMap.put("鈴木", person3);

		if(personMap.containsKey("門前")) {
			System.out.println("門前さんはいます");
		}else{
			System.out.println("門前さんはいません");
		}


		for(Map.Entry<String, Person> e : personMap.entrySet()) {
				System.out.println(e.getKey()+"は"+ e.getValue().getAge()+"才");
		}
		int maxAge = 0;
		for(Map.Entry<String, Person> e : personMap.entrySet()) {

			maxAge = Math.max(maxAge,e.getValue().getAge());
		}
		System.out.println(maxAge+"才が最年長です");
	}
}
