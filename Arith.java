import java.util.Scanner;
class Arith{
	public static void main(String[] args){
		int a,b;
	System.out.println("Enter a value");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("Addition of a and b"+(a+b));
	System.out.println("Substraction of a nad b"+(a-b));
	System.out.println("Multiplication of a and b"+(a*b));
	System.out.println("Division of a and b"+(a/b));
	}
}