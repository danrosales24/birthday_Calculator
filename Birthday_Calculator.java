package birthday_Calculator;
import java.util.*;

public class Birthday_Calculator {
 public static void main(String[] args) {
	 System.out.println("Welcome to the 100% Scientifically Accurate Birthday Calculator!");
	 System.out.println("What's your birthday?   (##/##/#### format) ");
	 Scanner in = new Scanner(System.in);
	 String birthday = in.nextLine();
	 
	 
	 
	 //break down string
	 String dayS = birthday.substring(3, 5);
	 String monthS =birthday.substring(0,2);
	 String yearS = birthday.substring(6, 10);
	 
	 
	 monthS.replaceFirst("^0+(?!$)", "");
	 dayS.replaceFirst("^0+(?!$)", "");
	 
	 int day =Integer.parseInt(dayS);
	 int month =Integer.parseInt(monthS);
	 int year =Integer.parseInt(yearS);
	 
	 System.out.println(day);
	 System.out.println(month);
	 System.out.println(year);
	 
	 
	
	 String answer = dayofweek(day,month,year);
	 
	 System.out.println(answer);
	
	 
 }

public static String dayofweek(int day, int month, int year) {

	
	String dayofweek ="";
	
	int temp =0;
	
	int[] montharray = {6, 2, 2, 5 , 0 , 3 , 5 , 1 , 4 , 6 , 2 ,4};
	int[] yeararray = {1, 6 ,5 ,3 ,2 ,0 ,6 ,4 ,3 ,1 ,0 ,5};
	
	int[] evennumbers = {0, 0 ,0 ,0 ,1 ,1 ,1 ,1 ,2 ,2};
	int[] oddnumbers = {0, 0 ,1 ,1 ,1 ,1 ,2 ,2 ,2 ,2 };
	
	temp = day + montharray[month] + yeararray[(year/100) % 10] + year%10 ;
	
	
	//System.out.println("-------------------------");
	//System.out.println(montharray[month]);
	//System.out.println(day);
	//System.out.println(yeararray[(year/100) % 10]);
	//System.out.println(year%10);
	//System.out.println(temp);
	
	if((year%10)%2 ==0) {
		
		temp = temp+evennumbers[year%10];
	}else {
		
		temp = temp+oddnumbers[year%10];
		
	}
	
	int x = temp%7;
	System.out.println(x);
	
	if(x==1) {
		dayofweek ="Monday";
		
	}
	if(x==2) {
		dayofweek ="Tuesday";
		
	}
	if(x==3) {
		dayofweek ="Wednesday";
		
	}
	if(x==4) {
		dayofweek ="Thursday";
		
	}
	if(x==5) {
		dayofweek ="Friday";
		
	}
	if(x==6) {
		dayofweek ="Saturday";
		
	}
	if(x==0) {
		dayofweek ="Sunday";
		
	}
	
	
	return dayofweek;
	
}


}
