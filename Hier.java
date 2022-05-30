package inheritance1;

class car{
	public void bugati() {
		System.out.println("super");
	}
}

class bus extends car{
	public void volvo() {
		System.out.println("best");
	}
}

class lory extends car{
	public void maruti() {
		System.out.println("ok");
	}
}
public class Hier {
	public static void main(String[] args) {
		lory a = new lory();
		a.bugati();
		a.maruti();
	}

}
