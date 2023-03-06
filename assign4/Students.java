package assign4;

public class Students {
	
	public void getStudentInfo(int idnumber) {
System.out.println("student idcard number: " +idnumber);	
}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("student id and name :" +id +" " +name  );
	}
	public void getStudentInfo(String email) {
		System.out.println("student email is :" + email);
	}
	public void getStudentInfo(double attendance) {
		System.out.println("attendance :" + attendance);
	}


	public static void main(String[] args) {
		
		Students work=new Students();
		work.getStudentInfo(123);
		work.getStudentInfo(123, "shalini");
		work.getStudentInfo("abcxy@gmail.com");
		work.getStudentInfo(85.9);		
		
		
	}

}

