package assign4;

public class Students {
	
	public void getStudentInfo(int idnumber) {
System.out.println("student id number");	
}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("student id and name :");
	}
	public void getStudentInfo(String email) {
		System.out.println("student email is :");
	}
	public void getStudentInfo(long mobilenumber) {
		System.out.println("mobile number is :");
	}


	public static void main(String[] args) {
		
		Students work=new Students();
		work.getStudentInfo("123");
		work.getStudentInfo("123, shalini");
		work.getStudentInfo("abc@xygmail.com");
		work.getStudentInfo("9999999999");		
		
		
	}

}

