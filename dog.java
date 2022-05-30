package inheritance1;

public class dog  extends Cat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.meo();
		d.meow();

	}

	@Override
	void meow() {
		// TODO Auto-generated method stub
		System.out.println("Meow the catttttttttttttt");
	}

}
