
public class Person {

	//演習４
	//public String name = null;
	//public int age = 0;

	private String name = null;
	private int age = 0;

		public Person(String name, int age){
			this.name = name;
			this.age = age;
		}

		public String getName(){
			return this.name;
		}

		public void setName(String name){
			this.name = name;
		}

		//演習５
		public int getAge(){
			return this.age;
		}

		public void setAge(int age){
			this.age = age;
		}
}
