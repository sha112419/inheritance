package inheritance1;


public class Encapsu {
	int Sid;
	String Sname;
	String Cname;
	String Cplace;
	int Ccode;
	

	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getSname() {
		return Sname;
	}


	public void setSname(String sname) {
		Sname = sname;
	}


	public String getCname() {
		return Cname;
	}


	public void setCname(String cname) {
		Cname = cname;
	}


	public String getCplace() {
		return Cplace;
	}


	public void setCplace(String cplace) {
		Cplace = cplace;
	}


	public int getCcode() {
		return Ccode;
	}


	public void setCcode(int ccode) {
		Ccode = ccode;
	}


	public static void main(String[] args) {
		Encapsu sha = new Encapsu();
		sha.setSid(11);
		sha.setSname("sha");
		sha.setCname("crescent");
		sha.setCplace("chennai");
		sha.setCcode(234455);
		
		System.out.println(sha.getSid());
		System.out.println(sha.getSname());
		System.out.println(sha.getCname());
		System.out.println(sha.getCplace());
		System.out.println(sha.getCcode());

	}

}
