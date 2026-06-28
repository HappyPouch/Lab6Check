/**
 * this is the test class for the Date class
 * Comment out the parts you haven't completed to test the parts that you have completed.
 * Easter is a bonus.  Those lines of code have been commented out. If you do the bonus, you need to uncomment them.
 * 
 * DO NOT change any code in this class.  Make the Date class work with this class.
 * 
 * January 2026

 */
public class TestDate
{
       
    
   public static void main()
   {
       
       //Creating Date objects using the constructor
       Date d1 = new Date(1, 1, 2023);
       Date d2 = new Date(29, 2, 2016); // leap year day
       Date d3invalid = new Date(29, 2, 2019);  // invalid
       Date d4 = new Date(31, 12, 2020);    // last day in year
       Date d5 = new Date(30, 6, 2012);     //last day in June
       Date d6invalid = new Date(29, 2, 2100); // not a valid leap year
       Date d7invalid = new Date(31, 6, 2020); // June only has 30 days
       
       
       System.out.println("Testing toString and isLeapyear");
       System.out.println("The dates are: ");
       System.out.println(d1.toString());
       
       if (d1.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d2.toString());
       if (d2.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d3invalid.toString());
       if (d3invalid.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d4.toString());
       if (d4.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d5.toString());
       if (d5.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d6invalid.toString());
       if (d6invalid.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println(d7invalid.toString());
       if (d7invalid.isLeapYear())
            System.out.println("This is a leap year");
            
       System.out.println();
       
       // Testing numDaysInMonth
       System.out.println("Testing numDaysInMonth");
       System.out.println(d2.toString());
       System.out.println("There are " + d2.numDaysInMonth() + " days in this month.");
       
       System.out.println(d5.toString());
       System.out.println("There are " + d5.numDaysInMonth() + " days in this month.");
       
       System.out.println(d1.toString());
       System.out.println("There are " + d1.numDaysInMonth() + " days in this month.");
              
       System.out.println();
       
       // Testing isValid
       System.out.println(d6invalid.toString());
       if (!d6invalid.isValid())
            System.out.println("This date is not valid");
            
       Date d8 = new Date(0, 1, 2020);
       System.out.println(d8.toString());
       
       if (!d8.isValid())
            System.out.println("This date is not valid");
            
       Date d9 = new Date(4, 31, 2020);
       System.out.println(d9.toString());
       if (!d9.isValid())
            System.out.println("This date is not valid");
            
       System.out.println();      
       
       //Testing tomorrowsDate
       System.out.println("Testing tomorrowsDate");
       System.out.println(d1.toString());
       Date d11 = d1.tomorrowsDate();
       System.out.print("Tomorrows date is ");
       System.out.println(d11.toString());
       
       System.out.println(d4.toString());
       Date d41 = d4.tomorrowsDate();
       System.out.print("Tomorrows date is ");
       System.out.println(d41.toString());
       
       System.out.println(d2.toString());
       Date d21 = d2.tomorrowsDate();
       System.out.print("Tomorrows date is ");
       System.out.println(d21.toString());     
    
       Date d95 = new Date(28,2,2020);
       System.out.println(d95.toString());
       Date d951 = d95.tomorrowsDate();
       System.out.print("Tomorrows date is ");
       System.out.println(d951.toString());    
       
       System.out.println();
       // If you complete the bonus, then uncomment the following lines
       
       //Testing easter
       System.out.println("Testing easter");
       System.out.println(d1.toString());
       System.out.print("In this year, Easter occurs on ");
       Date d12 = d1.easter();
       System.out.println(d12.toString());
       
       System.out.println(d2.toString());
       System.out.print("In this year, Easter occurs on ");
       Date d22 = d2.easter();
       System.out.println(d22.toString());
       
       Date d99 = new Date(1,1,2008);
       System.out.println(d99.toString());
       System.out.print("In this year, Easter occurs on ");
       Date d92 = d99.easter();
       System.out.println(d92.toString());
    }
    
    
    
    
    
}