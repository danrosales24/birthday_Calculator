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

	
	String dayofweek ="";
	int yearV=0;
	int temp =0;
	month=month-1;
	year=year-1;
	
	int[] montharray = {6, 2, 2, 5 , 0 , 3 , 5 , 1 , 4 , 6 , 2 ,4};
	int[] evennumbers = {0, 0 ,0 ,0 ,1 ,1 ,1 ,1 ,2 ,2};
	int[] oddnumbers = {0, 0 ,1 ,1 ,1 ,1 ,2 ,2 ,2 ,2 };
	
	if(year<1910 &&year>=1900) {
		yearV=1;
	}
	if(year<1920 &&year>=1910) {
		yearV=6;
	}
	
	if(year<1930 &&year>=1920) {
		yearV=5;
	}
	if(year<1940 &&year>=1930) {
		yearV=3;
	}
	if(year<1950 &&year>=1940) {
		yearV=2;
	}
	if(year<1960 &&year>=1950) {
		yearV=0;
	}
	if(year<1970 &&year>=1960) {
		yearV=6;
	}
	if(year<1980 &&year>=1970) {
		yearV=4;
	}
	if(year<1990 &&year>=1980) {
		yearV=3;
	}
	if(year<2000 &&year>=1990) {
		yearV=1;
	}
	if(year<2010 &&year>=2000) {
		yearV=0;
	}
	if(year<2020 &&year>=2010) {
		yearV=5;
	}
	if(year == 2020) {
		yearV=2;
	}
	
	
	
	temp = day + montharray[month] + year%10+1+yearV ;
	
	
	System.out.println("-------------------------");
	System.out.println(montharray[month]);
	System.out.println(day);
	System.out.println(yearV);
	System.out.println(year%10);
	System.out.println(temp);
	

	
	if((year%10)%2 ==0) {
		
		temp = temp+evennumbers[(year%10)];
	}else {
		
		temp = temp+oddnumbers[(year%10)];
		
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
