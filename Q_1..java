/*1. Date and Time Converter
Accept date and time from user. You are required to write a Java program to convert 
dates and times between different formats.
The program should be able to convert dates between the following formats:
a. dd/mm/yyyy (e.g., 31/12/2022)
b. mm/dd/yyyy (e.g., 12/31/2022)
c. yyyy/mm/dd (e.g., 2022/12/31)
The program should be able to convert times between the following formats:
a. hh:mm:ss (e.g., 23:59:59)
b. hh:mm:ss a (e.g., 11:59:59 PM)
c. hh:mm (e.g., 23:59)
The program should be able to convert dates and times between the following 
formats:
a. dd/mm/yyyy hh:mm:ss (e.g., 31/12/2022 23:59:59)
b. mm/dd/yyyy hh:mm:ss a (e.g., 12/31/2022 11:59:59 PM)
c. yyyy/mm/dd hh:mm (e.g., 2022/12/31 23:59)*/

class Date{
    int day;
    int month; 
    int year;

    void acceptDate()
    {

    }
    void printdate()
    {

    }
    public static void main(String[] args) {
        Date d = new Date();
        d.getDayofWeek();
    }
}