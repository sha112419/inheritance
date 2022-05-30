package inheritance1;

class animal{
	public void sha() {
		System.out.println("i am ");
	}
}

class bird extends animal{
	public void shah() {
		System.out.println(" fine");
	}
}

class shark extends bird{
	public void shahid() {
		System.out.println(" how are");
	}
}

class fish extends shark{
	public void rahman() {
		System.out.println("you?");
	}
}

public class testmultiple {

	public static void main(String[] args) {
		fish one = new fish();
		one.sha();
		one.shah();
		one.shahid();
		one.rahman();

	}

}
