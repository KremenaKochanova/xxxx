import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            chooseFormat();
        }
//+++++++++++++++++++++++++++ chooseFormat()  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            static int chooseFormat() {
                Scanner scan = new Scanner (System.in);
                int dd =0;
                int mm=0;
                int yyyy=0;
                String mmm = null;
                int chooseformat = 0;

                System.out.println("Choose 1 for date format: dd/MM/yyyy");
                System.out.println("Choose 2 for date format: MM/dd/yyyy");
                System.out.println("Choose 3 for date format: dd/MMM/yyyy");

                int choise = scan.nextInt();

                if (choise==1){
                    chooseformat = 1;
                }else
                    if (choise==2){
                    chooseformat = 2;
                }else
                    if (choise==3){
                    chooseformat = 3;
                }
                else
                    System.out.println("Wrong input!");

                switch (chooseformat) {
                    case 1: check_datFormat1(dd, mm, yyyy); break;
                    case 2: check_datFormat2(mm, dd, yyyy); break;
                    case 3: check_datFormat3(dd, mmm, yyyy); break;
                    default: System.out.print("Invalid day") ; break;
                }
                return chooseformat;
            }
            //++++++++++++++++++++++++++++  check_datFormat1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            static void check_datFormat1(int dd, int mm, int yyyy) {
                int day =0;
                int  month=0;
                int year=0;
                Scanner scan = new Scanner (System.in);
                System.out.print("Enter day  between 01 and 31: ");
                day = scan.nextInt();
                dd = day;
                System.out.print("Enter month in number between 1 and 12: ");
                month = scan.nextInt();
                mm = month;
                System.out.print("Enter year: ");
                year = scan.nextInt();
                yyyy =  year;

                if (dd > 0 || dd < 32){
                    day=dd;
                    if (mm > 0 || mm < 13)
                        month=mm;
                    if (yyyy > 1800)
                        year=yyyy;
                    System.out.println("The input is true!");
                }
                else
                    System.out.println("Wrong input!");
                printMonth(year, month, day);
                return;
            }

//++++++++++++++++++++++++++++  check_datFormat2 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            static void check_datFormat2(int mm, int dd, int yyyy) {
                int day =0;
                int  month=0;
                int year=0;
                Scanner scan = new Scanner (System.in);
                System.out.print("Enter day  between 01 and 31: ");
                day = scan.nextInt();
                dd = day;
                System.out.print("Enter month in number between 1 and 12: ");
                month = scan.nextInt();
                mm = month;
                System.out.print("Enter year: ");
                year = scan.nextInt();
                yyyy =  year;

                if (dd > 0 || dd < 32){
                    day=dd;
                    if (mm > 0 || mm < 13)
                        month=mm;
                    if (yyyy > 1800)
                        year=yyyy;
                    System.out.println("The input is true!");
                }
                else
                    System.out.println("Wrong input!");
                printMonth(year, month, day);
                return;
            }

//++++++++++++++++++++++++++++  check_datFormat3 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            static void check_datFormat3(int dd, String mmm, int yyyy) {
                int day =0;
                String newmonth;
                String mm;
                int month=0;
                int year=0;

                Scanner scan = new Scanner (System.in);
                String MMM[] = {"Jan", "Feb", "Marh", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

                System.out.print("Enter day  between 01 and 31: ");
                day = scan.nextInt();
                dd = day;
                System.out.print("Enter the name of month with words: ");
                newmonth = scan.next();
                mmm = newmonth;

                System.out.print("Enter year: ");
                year = scan.nextInt();
                yyyy =  year;

                if (dd > 0 || dd < 32){
                    day=dd;
                }
                for(int i =0; i<MMM.length; i++){
                    if (newmonth != MMM[i]){
                        month = changeMonthName(newmonth);
                    }
                }
                if (yyyy > 1800){
                    year=yyyy;
                    System.out.println("The input is true!");
                }
                else
                    System.out.println("Wrong input!");
                printMonth(year, month, day);
                return;
            }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            static int changeMonthName(String month) {

                int monthName = 0;

                switch (month) {
                    case "Jan": monthName = 1; break;
                    case "Feb": monthName = 2; break;
                    case "March": monthName = 3; break;
                    case "April": monthName = 4; break;
                    case "May": monthName = 5; break;
                    case "June": monthName = 6; break;
                    case "July": monthName = 7; break;
                    case "Aug": monthName = 8; break;
                    case "Sept": monthName = 9 ; break;
                    case "Oct": monthName = 10 ; break;
                    case "Nov": monthName = 11; break;
                    case "Dec": monthName = 12; break;
                }
                return monthName;
            }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            /** Print the calendar for a month in a year */
            static void printMonth(int year, int month, int day) {
                printMonthTitle(year, month, day);
                printMonthBody(year, month);
                dayofweek( day,  month,  year);
            }
            static void printMonthTitle(int year, int month, int day) {
                System.out.println("         " + getMonthName(month) + " " + year);
                System.out.println("–––––––––––––––––––––––––––––");
                System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
            }
//----------------------------------------------------------------------------------

            static String getMonthName(int month) {
                String monthName = null;
                switch (month) {
                    case 1: monthName = "January"; break;
                    case 2: monthName = "February"; break;
                    case 3: monthName = "March"; break;
                    case 4: monthName = "April"; break;
                    case 5: monthName = "May"; break;
                    case 6: monthName = "June"; break;
                    case 7: monthName = "July"; break;
                    case 8: monthName = "August"; break;
                    case 9: monthName = "September"; break;
                    case 10: monthName = "October"; break;
                    case 11: monthName = "November"; break;
                    case 12: monthName = "December";
                }
                return monthName;
            }

            /** Print month body */
            static void printMonthBody(int year, int month) {
                                                    // Get start day of the week for the first date in the month
                int startDay = getStartDay(year, month);
                                                     // Get number of days in the month
                int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
                                                    // Pad space before the first day of the month
                int i = 0;
                for (i = 0; i < startDay; i++)
                    System.out.print("    ");
                for (i = 1; i <= numberOfDaysInMonth; i++) {
                    if (i < 10)
                        System.out.print("   " + i);
                    else
                        System.out.print("  " + i);
                    if ((i + startDay) % 7 == 0)
                        System.out.println();
                }
                System.out.println();
            }

            /** Get the start day of the first day in a month */
            static int getStartDay(int year, int month) {

                int startDay1800 = 2;
                int totalNumberOfDays = getTotalNumberOfDays(year, month);

                //Return the start day
                return (totalNumberOfDays + startDay1800) % 7;
            }
            /** Get the total number of days since January 1, 1800 */
            static int getTotalNumberOfDays(int year, int month) {

                int total = 0;
                                                //Get the total days from 1800 to year - 1
                for (int i = 1800; i < year; i++)
                    if (isLeapYear(i))
                        total = total + 366;
                    else
                        total = total + 365;

                                            //Add days from January to the month prior to the calendar month

                for (int i = 1; i < month; i++)
                    total = total + getNumberOfDaysInMonth(year, i);
                return total;
            }
            /** Get the number of days in a month */

            static int getNumberOfDaysInMonth(int year, int month) {
                if (month == 1 || month == 3 || month == 5 || month == 7 ||
                        month == 8 || month == 10 || month == 12)
                    return 31;

                if (month == 4 || month == 6 || month == 9 || month == 11)
                    return 30;

                if (month == 2) return isLeapYear(year) ? 29 : 28;
                return 0;
            }

            /** Determine if it is a leap year */
            static boolean isLeapYear(int year) {
                return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
            }
//-------------------------------------------------------------------------------------------------------------------
            static int dayofweek( int day, int month, int year ) {
                int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
                if ( month<3 ){
                    year = year - 1;
                }
                int searchDay = ( year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;

                String dayName;
                switch (searchDay) {
                    case 1: dayName = "Mon"; break;
                    case 2: dayName = "Tue"; break;
                    case 3: dayName = "Wed"; break;
                    case 4: dayName = "Thu"; break;
                    case 5: dayName = "fri"; break;
                    case 6: dayName = "Sat"; break;
                    case 0: dayName = "Sun"; break;

                    default: dayName = "Invalid day"; break;
                }
                String ordinaldayName[] = {"the first", "the secont", "the third ", "the fourth", "the fifth" };
                String ordinaldayName1[] = {"the first", "the secont", "the third ", "the fourth", "the fifth"};

             //+++++++++++++++++++++++++++++++++++++++ WEDNESDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 3  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 3 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 3 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 3 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 3 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ SATURDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 6  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 6 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 6 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 6 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 6 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ SUNDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 0  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 0 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 0 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 0 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 0 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ MONDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 1  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName1[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 31 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName1[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 1 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName1[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 1 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName1[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 1 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName1[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ TUESDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 2  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName1[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 2 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName1[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 2 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName1[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 2 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName1[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 2 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName1[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ THURSDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 4  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName1[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 4 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName1[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 4 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName1[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 4 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName1[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 4 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName1[4] + " " + dayName + " of the month");
                }

//+++++++++++++++++++++++++++++++++++++++ FRIDAY ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

                if (searchDay == 5  && day>0 && day<8)
                {
                    System.out.println(ordinaldayName1[0]+ " " + dayName + " of the month");
                }
                else if(searchDay == 5 && day>7 && day<15)
                {
                    System.out.println(ordinaldayName1[1] + " " + dayName + " of the month");
                }
                else if(searchDay == 5 && day>14 && day<21)
                {
                    System.out.println(ordinaldayName1[2] + " " + dayName + " of the month");
                }
                else if(searchDay == 5 && day>20 && day<28)
                {
                    System.out.println(ordinaldayName1[3] + " " + dayName + " of the month");
                }
                else if(searchDay == 5 && day>27 && day<32)
                {
                    System.out.println(ordinaldayName1[4] + " " + dayName + " of the month");
                }
                System.out.println("The day of the month you have chosen is: " + dayName);
                return searchDay;

            } //END  of function
        }