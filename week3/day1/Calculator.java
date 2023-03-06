package week3.day1;

public class Calculator {
	public void add(int a,int b) {
		//a=6;b=6;
		System.out.println( a+b);
		}
	public void add(int a,int b,int c) {
		//a=3;b=4;c=7;

		System.out.println(a+b+c);
		}
	
	public void sub(double a ,double b) {
		//a =1999.99; b=999.00;
	System.out.println(a-b);
	}
	
	public void sub(int a,int b) {
		//a=9;b=4;
		System.out.println(a-b);
		}
	public void mul(int a,double b) {
		//a=1;b=1.5;
		System.out.println( a*b);
		}
	public void mul(double a,double b) {
		//a=111.111;b=111.9;
		System.out.println(a*b);
		}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(3,4);
		cal.add(2,5,6);
		cal.sub(11999.999, 789.99);
		cal.sub(9, 99);
		cal.mul(199.5,50.8);
		cal.mul(8, 12.7);
		
	}
}
