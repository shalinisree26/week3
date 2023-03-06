package week3.day1;

public class Androidphone extends Mobileactivity {
	public void Takevideo() {
		System.out.println("taking a video");
	}
	public static void main(String[] args)
	{
		Androidphone phone= new Androidphone();
		phone.sendMsg();
		phone.makeCall();
		phone.savecontact();
		phone.Takevideo();
	}
	
	

}
	

