package movieticket;

import java.io.*;

public class Movieticket
{
 public static void main(String args[])throws Exception
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String title="******************WELCOME TO STAR CINEMA*****************";
  String list[]=new String[19];//for Storing Movie names.
  list[0]="HARRY POTTER-8";list[1]="TWILIGHT";list[2]="JUMANJI";list[3]="AVATAR";list[4]="SPIDERMAN";list[5]="THAANA SERNTHA KOOTAM";
  list[6]="SKETCH";list[7]="VELAIKKARAN";list[8]="ARUVI";list[9]="BOSS";
  String city[]=new String[6];//for Storing City names.
  city[0]="COIMBATORE";city[1]="CHENNAI";city[2]="ERODE";city[3]="TIRUPUR";
  String cityN,movie,size;//declaration of String variables
  String ans="Q";String ans1="Q";
  int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,catg,quantity,date,bvrg,tot_bvrg,snck,tot_snck,fd;
  int tot_fd=1,tot_d,d,ch;//declaration of Integer variables
  
  
  
  do
  {
   System.out.println();   
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println();
   System.out.println(" SELECT YOUR CURRENT CITY ");
   
   do
   {
    if(flag>0)
    System.out.println("** INVALID INPUT ! TRY AGAIN **");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** COIMBATORE CHENNAI ERODE TIRUPUR **");
    System.out.println();
    System.out.print("ENTER THE CORRECT CITY NAME FOR YOUR CHOICE :");
    cityN=br.readLine();
    for(int i=0;i<6;i++)
    {
     if(city[i].equalsIgnoreCase(cityN))
     {
      flag=0;
      break;
     }
     else
     flag++;
    }
   }while(flag!=0);
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println("<<< SELECT YOUR CATAGORY TO WATCH THE MOVIE >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1.STAR "+cityN+" CLASSIC CINEMAS **");
    System.out.println("** 2.STAR "+cityN+" SUPER CLASSIC CINEMAS **");
    System.out.println();
    System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
    catg=Integer.parseInt(br.readLine());
    if((catg==1)||(catg==2))
      flag1=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag1++;
    }
   }while(flag1!=0);
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println();
   System.out.println("<<< INFORMATION >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
   System.out.println("FOR MOBILE BOOKING CONTACT==411288598 FROM YOUR MOBILE");
   System.out.println("            ** PREMIUM RATES AAPLY **");
   System.out.println("FOR INTERNATE BOOKING VISIT:http://www.starcinemas.com");
   System.out.println();
   System.out.println("** CATCH THE LATEST MOVIES AT STAR CINEMAS NEAR YOU **");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println();
   System.out.println("<<< SELECT YOUR DATE FOR THE MOVIE >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1. FRIDAY, 26 JANUARY [2018] **");
    System.out.println("** 2. SATURDAY,   27JANUARY [2018] **");
    System.out.println("** 3. SUNDAY, 28 JANUARY [2018] **");
    System.out.println("** 4. MONDAY,   29 JANUARY [2018] **");
    System.out.println("** 5. TUESDAY,   30 JANUARY [2018] **");
    System.out.println("** 6. WEDNESDAY,  01 FEBRUARY [2018] **");
    System.out.println("** 7. THURSDAY,02 FEBRUARY [2018] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println(" PLEASE ENTER THE NUMBER OF TICKTETS ");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.print("ENTER THE NUMBER OF TICKTETS :");
   quantity=Integer.parseInt(br.readLine());
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   if(catg==1)
   {
    System.out.println(" MOVIE SELECTION ");
    do
    {
     if(flag3>0)
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     System.out.println("************************** NOW SHOWING ***************************");
     System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
     System.out.println();
     System.out.println("HARRYPOTTER-8                  A          ENGLISH           01:00pm,9:15pm");
     System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
     System.out.println("JUMANJI                        U          ENGLISH     03:20pm");
     System.out.println(" SPIDERMAN                     U/A        ENGLISH      06:15pm,9:20pm");
     System.out.println("AVATAR                         U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
     System.out.println("THAANA SERNTHA KOOTAM          U          TAMIL        10:30am,12:45pm,1:05pm");
     System.out.println("SKETCH                         U          TAMIL        12:15pm,9:45pm");
     System.out.println("VELAIKKARAN                    U          TAMIL      10:00am,12:15pm");
     System.out.println("ARUVI                          U          TAMIL       01:00pm,4:05pm");
     System.out.println("BOSS                           U          TELUGU     01:20pm");
     System.out.println();
     System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
     movie=br.readLine();
     for(int i=0;i<10;i++)
     {
      if(list[i].equalsIgnoreCase(movie))
       {
        flag3=0;   
        break;
       }
      else
       flag3++;
     }
    }while(flag3!=0);
    System.out.println();
    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Movie Selected :"+movie);
    System.out.println("The Total Cost is Rs. "+(quantity*110));
    System.out.print("Your Seat Number/s is/ are ");
    for(int i=1;i<=quantity;i++)
    {
     System.out.print(17+i+" ");
    }
    System.out.println();
   }
   if(catg==2)
   {
     System.out.println("<<< MOVIE SELECTION >>>");
    do
    {
     if(flag3>0)
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     System.out.println("************************** NOW SHOWING ***************************");
     System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
     System.out.println();
     System.out.println("HARRYPOTTER-8                  A          ENGLISH           01:00pm,9:15pm");
     System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
     System.out.println("JUMANJI                        U          ENGLISH     03:20pm");
     System.out.println(" SPIDERMAN                     U/A        ENGLISH      06:15pm,9:20pm");
     System.out.println("AVATAR                         U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
     System.out.println("THAANA SERNTHA KOOTAM          U          TAMIL        10:30am,12:45pm,1:05pm");
     System.out.println("SKETCH                         U          TAMIL        12:15pm,9:45pm");
     System.out.println("VELAIKKARAN                    U          TAMIL      10:00am,12:15pm");
     System.out.println("ARUVI                          U          TAMIL       01:00pm,4:05pm");
     System.out.println("BOSS                           U          TELUGU     01:20pm");System.out.println();
     System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
     movie=br.readLine();
     for(int i=0;i<10;i++)
     {
      if((i==2)||(i==6))
       i++;
      if(list[i].equalsIgnoreCase(movie))
       {
        flag3=0;
        break;
       }
      else
       flag3++;
     }
    }while(flag3!=0);
    System.out.println();
    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Movie Selected :"+movie);
    System.out.println("The Total Cost is Rs. "+(quantity*150));
    System.out.print("Your Seat Number/s is/ are ");
    for(int i=1;i<=quantity;i++)
    {
     System.out.print(135+i+" ");
    }
    System.out.println();
   }
   System.out.println("*********************************************************");
   System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
   System.out.println();
   System.out.println();
   System.out.println("TO QUIT BUYING TICKETS ENTER 'Q'");
   ans=br.readLine();
  
  System.out.println("\f");//to clear the screen for next window
  System.out.println(title);
   System.out.println("*********************************************************");
  do
  {
   System.out.println("*********** WELCOME TO THE SNACK BAR OF STAR ************");
   System.out.println();
   System.out.println("<<< STALL 1 >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("********** SECTION : CHILLED BEVERAGES **********");
   System.out.println();
   System.out.println("1. COCA COLA            2. SPRITE");
   System.out.println("3. FRUITI               4. SEVEN UP");
   System.out.println("5. DIET PEPSI           6. COLD COFEE");
   System.out.println("7. ICE TEA              8. CHOCOLATE KRUSHERS");
   System.out.println("9. BLACKBERRY KRUSHERS  10.LEMON N ICETEA");
   System.out.println();
   System.out.println("********** SECTION : PIPING HOT DRINKS **********");
   System.out.println();
   System.out.println("11. TEA REGULAR         12. HOT LEMON TEA");
   System.out.println("13. ESPRESSO            14. CAFEMACHO");
   System.out.println("15. CAPPUCINO           16. CAFE LATTE");
   System.out.println("17. IRISH COFEE");
   System.out.println();
   String flagC1=new String();    
   System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
   flagC1=br.readLine();
   System.out.println();
   if(flagC1.equalsIgnoreCase("Y"))
   {
    System.out.print("CHOOSE YOUR BEVERAGE BY ENTERING THE NUMBER :");
    bvrg=Integer.parseInt(br.readLine());
    System.out.print("ENTER THE TOTAL NUMBER OF BEVERAGE YOU WANT TO BUY :");
    tot_bvrg=Integer.parseInt(br.readLine());
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.println("<<< STALL 1 BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    if(bvrg>=1 && bvrg<=7)
     System.out.println("TOTAL COST IS RS."+(tot_bvrg*45));
    else if (bvrg>=8 && bvrg<=10)
     System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*55));
    else if (bvrg>=11 && bvrg<=12)
     System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*65));
    else if (bvrg>=13 && bvrg<=17)
     System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*75));
    System.out.println();
   }
   else
    System.out.println();
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("<<< STALL 2 >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("************* SECTION : QUICK BITES *************");
   System.out.println();
   System.out.println();
   System.out.println("18. POP CORN[REGULAR]             19. POP CORN[CHEESE]");
   System.out.println("20. POP CORN[CARAMEL]             21. POP CORN[TANGY TOMATO]");
   System.out.println("22. VEG SAMOSA                    23. VEG PUFF");
   String flagC2=new String();
   System.out.println();
   System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
   flagC2=br.readLine();
   System.out.println();
   if(flagC2.equalsIgnoreCase("Y"))
   {
    System.out.println("CHOOSE YOUR SNACK BY ENTERING THE NUMBER");
    snck=Integer.parseInt(br.readLine());
    System.out.println();
    System.out.println("ENTER THE TOTAL NUMBER OF SNACKS YOU WANT TO BUY");
    tot_snck=Integer.parseInt(br.readLine());
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.println("<<< STALL 2 BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    if(snck>=18 && snck<=21)
    {
     System.out.println("ENTER 'S' FOR SMALL,'M' FOR MEDIUM,'L' FOR LARGE");
     size=br.readLine();
     if(size.equalsIgnoreCase("S"))
      System.out.println("TOTAL COST IS RS."+tot_snck*45);
     else if(size.equalsIgnoreCase("M"))
      System.out.println("TOTAL COST IS RS."+tot_snck*55);
     else if(size.equalsIgnoreCase("L"))
      System.out.println("TOTAL COST IS RS."+tot_snck*65);
    }
    else if(snck>=22 && snck <=23)
      System.out.println("TOTAL COST IS RS."+tot_snck*40);
    else if(snck>=24 && snck <=25)
      System.out.println("TOTAL COST IS RS."+tot_snck*65);
    else if(snck>=26 && snck <=27)
      System.out.println("TOTAL COST IS RS."+tot_snck*75);
    else if(snck==28)
      System.out.println("TOTAL COST IS RS."+tot_snck*35);
    else if(snck>=29 && snck <=31)
      System.out.println("TOTAL COST IS RS."+tot_snck*95);
    else if(snck==32)
      System.out.println("TOTAL COST IS RS."+tot_snck*105);
    }
   
   else
    System.out.println();
   System.out.println("<<< STALL 3 >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("************* SECTION : MAIN COURSE *************");
   System.out.println();
   System.out.println("33. PAV BHAJI               34. CHANNA BHATURA");
   System.out.println("35. SCHEZWAN FRIED RICE     36. CHICKEN BIRYANI"); 
   System.out.println("37. CHICKEN NOODLES");
   System.out.println();
   String flagC3=new String();
   System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
   flagC3=br.readLine();
   System.out.println();
   if(flagC3.equalsIgnoreCase("Y"))
   {
    System.out.println("CHOOSE YOUR MAIN COURSE BY ENTERING THE NUMBER :");
    fd=Integer.parseInt(br.readLine());
    if(fd==33 || fd==34)
     System.out.println("TOTAL COST IS RS."+tot_fd*46);
    else if(fd==35)
     System.out.println("TOTAL COST IN RS."+tot_fd*60);
    else if(fd==36 || fd==37)
     System.out.println("TOTAL COST IN RS."+tot_fd*86);
   }
   System.out.println("<<< STALL 4 >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("*** SECTION : MELTING MOMENTS DESERTS ***");
   System.out.println();
   System.out.println("38. BANANA CHOCOLATE MOUSSE     39. BANANA CARAMEL PIE");
   System.out.println("40. CHOCOLATE/WALNUT BROWNIE    41. CHOCOLATE DOUGHNUT");
   System.out.println("42. MARBEL CAKE                 43. MOCHA MAGIC");
   System.out.println("44. BLACK FOREST GATEAUX");
   String flagC4=new String();
   System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
   flagC4=br.readLine();
   System.out.println();
   if(flagC4.equalsIgnoreCase("Y"))
   {
    System.out.println("CHOOSE YOUR DESSERT BY ENTERING THE NUMBER");
    d=Integer.parseInt(br.readLine());
    System.out.println("ENTER THE TOTAL NUMBER OF ITEMS YOU WANT TO BUY");
    tot_d=Integer.parseInt(br.readLine());
    if(d==38 || d==39)
     System.out.println("TOTAL COST IN RS."+tot_d*55);
    else if(d==40 || d==41)
     System.out.println("TOTAL COST IN RS."+tot_d*45);
    else if(d==42)
     System.out.println("TOTAL COST IN RS."+tot_d*60);
    else if(d==43 || d==44)
     System.out.println("TOTAL COST IN RS."+tot_d*65);
   }
   else
   System.out.println();
   System.out.println("TO QUIT BUYING FOOD ENTER 'Q'");
   ans1=br.readLine();
  }while((ans1.equalsIgnoreCase("Q"))!=true);
  System.out.println("\f");//to clear the screen for next window
  System.out.println(title);
  System.out.println("*********************************************************");
  System.out.println();
  System.out.println("<<< CANCELLATION OF TICKETS >>>");
  do
  {
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("1. TO CANCEL TICKET");
   System.out.println("2. TO SKIP PROCESS");
   System.out.print("ENTER YOUR CHOICE NUMBER :");
   ch=Integer.parseInt(br.readLine());
   if(ch==1)
   {
    System.out.println("YOU HAVE CHOOSEN TO CANCEL THE TICKETS");
    flag4=0;
    cancel();
   }
   else if(ch==2)
   {
    System.out.println("** YOU HAVE CHOOSEN NOT TO CANCEL THE TICKETS **");
    System.out.println("               ** THANK YOU **");
    flag4=0;
   }
   else
    {
     System.out.println(" ### INVALID CHOICE ###");
     flag4++;
    }
  }while(flag4!=0);
 }while(ans1.equalsIgnoreCase("Q")!=true);
}

public static void cancel() throws Exception
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 int date,catg,quantity,seat_no,flag1=0,flag2=0;
 String movie,shw_time;
 System.out.println("*** TODAYS DATE: 2,FEBRUARY[TUESDAY] 2018");
 System.out.println("**************************************************************");
 System.out.println("YOU CANNOT CANCEL YOUR TICKETS FOR ANY SHOW BEFORE THIS TIMING");
 System.out.println("<<< SELECT YOUR CATEGORY TO CANCEL TICKETS >>>");
 do
 {
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println("** 1.STAR CLASSIC CINEMAS **");
  System.out.println("** 2.STAR SUPER CLASSIC CINEMAS **");
  System.out.println();
  System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
  catg=Integer.parseInt(br.readLine());
  if((catg==1)||(catg==2))
   flag1=0;
  else
  {
   System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
   flag1++;
  }
 }while(flag1!=0);
 System.out.println("\f");//to clear the screen for next window
 switch(catg)
 {
  case 1:
  System.out.println("***************** INOX CLASSIC CINEMAS *********************");
   System.out.println();
   System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1. FRIDAY, 26 JANUARY [2018] **");
    System.out.println("** 2. SATURDAY,   27JANUARY [2018] **");
    System.out.println("** 3. SUNDAY, 28 JANUARY [2018] **");
    System.out.println("** 4. MONDAY,   29 JANUARY [2018] **");
    System.out.println("** 5. TUESDAY,   30 JANUARY [2018] **");
    System.out.println("** 6. WEDNESDAY,  01 FEBRUARY [2018] **");
    System.out.println("** 7. THURSDAY,02 FEBRUARY [2018] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
  System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU WOULD LIKE TO CANCEL");
  movie=br.readLine();
  System.out.println("PLEASE ENTER THE SHOW TIMINGS");
  shw_time=br.readLine();
  System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
  quantity=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE SEAT NUMBER");
  seat_no=Integer.parseInt(br.readLine());
  System.out.println();
  System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
  break;
  
  case 2:
  System.out.println("**************** INOX SUPER CLASSIC CINEMAS *****************");
  System.out.println();
  System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("** 1. FRIDAY, 26 JANUARY [2018] **");
    System.out.println("** 2. SATURDAY,   27JANUARY [2018] **");
    System.out.println("** 3. SUNDAY, 28 JANUARY [2018] **");
    System.out.println("** 4. MONDAY,   29 JANUARY [2018] **");
    System.out.println("** 5. TUESDAY,   30 JANUARY [2018] **");
    System.out.println("** 6. WEDNESDAY,  01 FEBRUARY [2018] **");
    System.out.println("** 7. THURSDAY,02 FEBRUARY [2018] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
  date=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU LIKE TO CANCEL");
  movie=br.readLine();
  System.out.println("PLEASE ENTER THE SHOW TIMINGS");
  shw_time=br.readLine();
  System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
  quantity=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE SEAT NUMBER");
  seat_no=Integer.parseInt(br.readLine());
  System.out.println();
  System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
  break;
 }
}
}     