
/**
 * Date Classes
 *
 * Tom Paulo Sadaya
 */
public class Date
{
    private int year;
    private int month;
    private int day;
    
    
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    // accessor methods (functions)
    public int getDay()
    {
        return day;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
        }
        
    public String toString()
    {
        String monthString = "";
        
        if(month == 1){
            monthString = "January";
        }
        else if(month == 2){
            monthString = "February";
        }
        else if(month == 3){
            monthString = "March";
        }
        else if(month == 4){
            monthString = "April";
        }
        else if(month == 5){
            monthString = "May";
        }
        else if(month == 6){
            monthString = "June";
        }
        else if(month == 7){
            monthString = "July";
        }
        else if(month == 8){
            monthString = "August";
        }
        else if(month == 9){
            monthString = "September";
        }
        else if(month == 10){
            monthString = "October";
        }
        else if(month == 11){
            monthString = "November";
        }
        else if(month == 12){
            monthString = "December";
        }
        
        return monthString + " " + getDay() + ", " + getYear();
    }
        
    // returns a String in the form January 12, 2026 
    // this will require some if statements to convert the month from an int to a String   
    public boolean isLeapYear()
    {
        if(getYear() % 400 == 0){
            return true;
        }
        else if(getYear() % 4 == 0){
            if(getYear() % 100 == 0){
                return false;
            }
            return true;
        }
        
        return false;
    }
    // returns true if the year is a leap year; otherwise false. 
    // A year is a leap year if it is divisible by 400 (e.g. 2000 was a leap year) 
    // A year is not a leap year if it is divisible by 100 (e.g. 2100 will not be a leap year) 
    // A year is a leap year if it is divisible by 4 (e.g. 2004 is a leap year) 
    public int numDaysInMonth()
    {
        int maxDays = 0;
        
        if(month == 1){
            maxDays = 31;
        }
        else if(isLeapYear() == true && month == 2){
            maxDays = 29;
        }
        else if(month == 2){
            maxDays = 28;
        }
        else if(month == 3){
            maxDays = 31;
        }
        else if(month == 4){
            maxDays = 30;
        }
        else if(month == 5){
            maxDays = 31;
        }
        else if(month == 6){
            maxDays = 30;
        }
        else if(month == 7){
            maxDays = 31;
        }
        else if(month == 8){
            maxDays = 31;
        }
        else if(month == 9){
            maxDays = 30;
        }
        else if(month == 10){
            maxDays = 31;
        }
        else if(month == 11){
            maxDays = 30;
        }
        else if(month == 12){
            maxDays = 31;
        }
        
        return maxDays;
    }
    // return number of days that occur in the month 
    // use the isLeapYear function for February. Do not repeat code 
    // This will require some if statements. 
    public boolean isValid()
    {
        if(day < 1 || day > numDaysInMonth()){
            return false;
        }
        
        if(month < 1 || month > 12){
            return false;
        }
        
        return true;
    }
    // returns true if the date is valid, otherwise false. 
    // if day less than 1 or greater than last day in month then false. 
    // if month is less than 1 or greater than 12, then false. 
    // Assume all years are valid. 
    // Do not rewrite code, be sure to use existing functions to help. 
    public Date tomorrowsDate()
    {
        int newDay = day;
        int newMonth = month;
        int newYear = year;
        
        if(month == 12 && day == 31)
        {
            newDay = 1;
            newMonth = 1;
            newYear += 1;
        }
        else if(day == numDaysInMonth())
        {
            newDay = 1;
            newMonth += 1;
        }
        else
        {
            newDay += 1;
        }
        
        return new Date(newDay, newMonth, newYear);
    }
    // returns the correct date of tommorrow 
    // Example if Dec 31, 2023 ? Jan 1, 2024 
    // Example if Feb 28, 2024 ? Feb 29, 2024 
    // Example if Feb 28, 2023 ? Mar 1, 2023 
    // Do not rewrite code, be sure to use existing functions. 
    // Hint: There are only 3 scenarios to account for:
    // last day of the year
    // last day of the month (use numDaysinMonth)
    // all other days > js add 1 day
    
    public Date easter(){
        int a = year % 19;
        int b = year % 4;
        int c = year % 7; 
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        
        int num = 22 + d + e;
        
        int februaryDays;
        int dayofEaster;
        int monthofEaster;
        
        // leap year
        if(isLeapYear() == true){
            februaryDays = 29;
        }
        // not a leap year
        else{
            februaryDays = 28;
        }
        
        // goes to march
        if (num <= 31) {
            monthofEaster = 3;
            dayofEaster = num;
        }
        // passes march days, enter april
        else {
            monthofEaster = 4;
            dayofEaster = num - 31;
        }
        
        return new Date(dayofEaster, monthofEaster, year);
    }
    // returns the correct date of Easter given the year of Date d 
    // Assume the year in Date d falls between 1982 and 2048
        
}