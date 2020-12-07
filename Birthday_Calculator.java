package birthday_Calculator;
import java.util.*;

public class Birthday_Calculator {
 public static void main(String[] args) {
	 System.out.println("Welcome to the 100% Scientifically Accurate Birthday Calculator!");
	 System.out.println("What's your birthday?");
	 Scanner in = new Scanner(System.in);
	 String birthday = in.nextLine();
	 
	 
	 
	 //break down string
	 String dayS =(String) birthday.subSequence(3, 5);
	 String monthS =(String) birthday.subSequence(0, 2);
	 String yearS =(String) birthday.subSequence(6, 10);
	 System.out.println(dayS);
	 System.out.println(monthS);
	 System.out.println(yearS);
	 
	 int day =Integer.parseInt(dayS);
	 int month =Integer.parseInt(monthS);
	 int year =Integer.parseInt(yearS);
	 
	 
	
	 
 }

public static String dayofweek(int day, int month, int year) {
	String dayofweek ="";
	int temp =0;
	int[] montharray = {6, 2, 3, 5 , 0 , 3 , 5 , 1 , 4 , 6 , 2 ,4};
	
	
	
	return dayofweek;
	
}


}
