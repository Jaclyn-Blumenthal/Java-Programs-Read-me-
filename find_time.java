// CISS 111 
//Jaclyn Blumenthal
//exercise 7-1


//THIS PROGRAM WILL CALCULATE DAYS AND MILLISECONDS UNTIL 
//NEXT SUMMER USING DATE OBJECTS
import java.util.Calendar; // import a calendar package
import java.util.Date; //insert the package
public class find_time
{
  public static void main(String[] args)
  {
    Date today = new Date();  //Date is a class with different properties for each
    Date summer = new Date(today.getYear(), 5, 21); // 5  = june because 0 = january, in day for 21 = 21 bc day starts at 1
    Date new_year = new Date(today.getYear()+1, 5, 21); //+1 indicates 1 year more
    Date new_years = new Date(today.getYear()+1, 0, 1); //+1 is 1 year more and 0 = january, 1= 1st of january
    long ms;  //long integer ms = milliseconds
    long ms2; //long integer for milliseconds when referencing the next yr
    int days;
    
    Calendar todaycal = Calendar.getInstance();
    System.out.println("Today's year is " +todaycal.get(Calendar.YEAR));
    System.out.println("Today's month is " +todaycal.get(Calendar.MONTH));
                       
    System.out.println("Today is " + today);  
    System.out.println("Summer begins on " + summer);
    System.out.println("Next year begins on " + new_years);
    
    ms = summer.getTime() - today.getTime();
    
    days = (int)(ms/1000.0/60/60/24); //put only .0 for the 1000 so we can divide w decimal note 1000 milliseconds in 1 sec 60 min in an hr 60 sec in n hr 24 hrs in a day
    System.out.println("Number of milliseconds until summer is " +ms);
    System.out.println("Number of days until summer is " + days);
    
    //Ask how to get number of milliseconds until next yr
    
     ms2 = new_years.getTime() - today.getTime();
    
    days = (int)(ms/1000.0/60/60/24); //put only .0 for the 1000 so we can divide w decimal note 1000 milliseconds in 1 sec 60 min in an hr 60 sec in n hr 24 hrs in a day
    System.out.println("Number of milliseconds until next year is " +ms2);
    System.out.println("Number of days until next year is " + days);
    
 
    //how many days and millisecond until next yr
    
  }
 
}
    
