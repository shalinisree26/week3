package assignment3;

public class Axisbank extends Bankinfo {
	
	public void deposit() {
		System.out.println("its a huge and i cant deposit from axix bank");
	}

	public static void main(String[] args) {
		
		Axisbank send=new Axisbank();
		send.deposit();
		send.savings();
		send.fixed();
	
	}

}
