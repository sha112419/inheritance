package inheritance1;

public class bank {
           int rateofinterest() {
        	   return 2;
           }
           public static void main(String[] args) {
       		// TODO Auto-generated method stub
       	bank s ;
       	s=new indian();
       	System.out.println(s.rateofinterest());
       	s=new hdfc();
       	System.out.println(s.rateofinterest());
       	s=new sbi();
           System.out.println("SBI INTERSET IS:"+s.rateofinterest());
          
         }

}
