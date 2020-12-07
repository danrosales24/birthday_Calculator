package birthday_Calculator;
import java.util.*;
import java.util.Date;

public class Birthday_Calculator {
 public static void main(String[] args) {
	 System.out.println("Welcome to the 100% Scientifically Accurate Birthday Calculator!");
	 System.out.println("What's your birthday?   (##/##/#### format) ");
	 Date d=new Date();  
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
	 
	 //System.out.println(day);
	 //System.out.println(month);
	 //System.out.println(year);
	 
	int currYear = d.getYear();
	System.out.println(currYear +1900);
	
	 String answer1 = dayofweek(day,month,year);
	 String answer2 =dayofweek(day,month,currYear);
	 
	 System.out.println("That means you were born on a " + answer1 +"!");
	 System.out.println("This year it falls on a " + answer2 +"...");
	
	 
 }

public static String dayofweek(int day, int month, int year) {

	
	
	if (month == 1) 
    { 
        month = 13; 
        year--; 
    } 
    if (month == 2) 
    { 
        month = 14; 
        year--; 
    } 
    int q = day; 
    int m = month; 
    int k = year % 100; 
    int j = year / 100; 
    int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j; 
    h = h % 7; 
    switch (h) 
    { 
        case 0 : return "Saturday"; 
        case 1 :  return "Sunday";  
        case 2 :  return "Monday"; 
        case 3 :  return "Tuesday";  
        case 4 :  return "Wednesday";  
        case 5 :  return "Thursday";  
        case 6 :  return "Friday" ; 
    } 
    return "";

}


}
