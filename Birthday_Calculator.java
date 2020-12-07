package birthday_Calculator;
import java.util.*;

public class Birthday_Calculator {
 public static void main(String[] args) {
	 System.out.println("Welcome to the 100% Scientifically Accurate Birthday Calculator!");
	 System.out.println("What's your birthday?");
	 Scanner in = new Scanner(System.in);
	 String birthday = in.nextLine();
	 
	 
	 
	 //break down string
	 String day =(String) birthday.subSequence(3, 5);
	 String month =(String) birthday.subSequence(0, 2);
	 String year =(String) birthday.subSequence(6, 10);
	 System.out.println(day);
	 System.out.println(month);
	 System.out.println(year);
 }
}
