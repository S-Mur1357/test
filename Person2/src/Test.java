
public class Test {

	public static void main(String[] args) {

		//演習３
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		//演習５
		//コンストラクタ③を使う
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		//コンストラクタ④を使う
		Person siro = new Person(25);
		System.out.println(siro.name);
		System.out.println(siro.age);

		//コンストラクタ⑤を使う
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}

}
