package inheritance1;

class mech{
	public void rah(){
		System.out.println("yes");
	}
}

public class Testsingle extends mech {
	public static void main(String[] args) {
		Testsingle one = new Testsingle();
		one.rah();

	}

}
