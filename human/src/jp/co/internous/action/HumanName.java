package jp.co.internous.action;

public class HumanName {
	public String lastName;
	private String firstName;
	public String getName() {
		firstName = "太郎";
		lastName= "山田";
		String myname = lastName + firstName;

		return myname;
	}
}
