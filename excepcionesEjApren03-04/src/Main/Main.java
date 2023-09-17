package Main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		String n1 = sc.next();
		String n2 = sc.next();
		
		try { 
			int intN1 = Integer.parseInt(n1);
			int intN2 = Integer.parseInt(n2);
		
			System.out.println(intN1/intN2);
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(InputMismatchException ime) {
			System.out.println(ime);
		} finally {
			System.out.println("Dale boca");
		}

	}

}
