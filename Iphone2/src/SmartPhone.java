//演習２　Mp3インターフェイスを実装してSmartPhoneクラスを作る。
//演習６　SmartPhoneクラスの継承と実装を変更
public class SmartPhone extends Phone implements Mp3Player,NewFunction {
	public void play(){
		System.out.println("再生");
	}

	public void stop(){
		System.out.println("停止");
	}

	public void next(){
		System.out.println("次へ");
	}

	public void back(){
		System.out.println("戻る");
	}
}
