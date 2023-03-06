package week3.day1;

public class Smartphone extends Androidphone{
	public void connectwhatsapp() {
		System.out.println("connecting a whatsappcall");
	}

	public void Takevideo() {
		System.out.println("making video call under smart phone");
	}
	
	public static void main(String[] args) {
		
		
		Smartphone call=new Smartphone();
		//call.makeCall();
		//call.savecontact();
		//call.sendMsg();
		call.Takevideo();
		//call.connectwhatsapp();
	}

}
