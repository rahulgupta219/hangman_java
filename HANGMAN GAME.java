import java.io.*;
class Hangman
{
public static void main()throws IOException
{InputStreamReader x2 =new InputStreamReader(System.in);
BufferedReader y2 =new BufferedReader(x2);
System.out.println("                        ***********************************");
System.out.println("                        **********    HANGMAN    **********");
System.out.println("                        ***********************************");
System.out.println("                                                                                           BY RAHUL GUPTA ");
System.out.println("1--> PLAY GAME ");
System.out.println("2--> INSTRUCTIONS ");
System.out.println("3--> CREDITS ");
System.out.println("4--> EXIT ");
int ch1=0,pl=0;
String x="",vow=""; int len=0,cd=1,cho=0,s=5,pos=0,c=0,f=0,i=0,cc=0,xz=0,tr=0;
double ee=0;
String y="",str="",cr="";
long q,r,n;
String gh=" LOADING ...... ";
String ss=" GAME LOADED READY TO PLAY  ... ";
String wrd[]=new String[20];String wrd1[]=new String[20];String wrd2[]=new String[20];
outer:
do{if(pl>0&&s>=0)
{ len=0;cd=1;cho=0;s=5;pos=0;c=0;f=0;i=0;cc=0;
System.out.println("1--> PLAY GAME ");
System.out.println("2--> INSTRUCTIONS ");
System.out.println("3--> CREDITS ");
System.out.println("4--> EXIT ");}
ch1=Integer.parseInt(y2.readLine());
if(ch1==4)
{break;}

switch(ch1)
{ case 1: if(ch1!=4)
{ {String s1[]={"BATMAN-THE-DARK-KNIGHT","127-HOURS","AMERICAN-PIE","SAW","INCEPTION","TITANIC","THE-GODFATHER",};
   String s2[]={"LONDON","INDIA"};
   String s3[]={"TOPPER","MAWANA","MACHAR","JUICE","KAJU","CHOCO","PULLU","CHEEMAN","CHINESE","MILK","TYRE","CC","AMAAAN","TENDUA","SIXXXX","CHUHA","SIDDHU","SABHA","FAUJI","AISUARIYA"};
   String s4[]={"CHAK DE","3 IDIOTS"};
   String s5[]={"PELE","LIONEL-MESSI","CHRISTIANO-RONALDO","ZLATAN-IBRAHAMNOVIC"};
   for(q=1;q<=2;q++)
   {if(q==1){str=gh;}else{str=ss;}
      for(int z=0;z<str.length();z++)
      {
      for(r=0;r<19999990;r++)
       {
        }
        System.out.print(str.charAt(z));
    }System.out.println();}
   System.out.println("1--> ENGLISH MOVIES ");
   System.out.println("2--> PLACES ");
   System.out.println("3--> PET NAMES (THIS ONE'S FOR XII-B)");
   System.out.println("4--> HINDI MOVIES");
   System.out.println("5--> FOOTBALL PLAYERS");
   System.out.println("PRESS 4 TO EXIT  ");
   cho=Integer.parseInt(y2.readLine());
   if(cho==4)
   {System.out.println(" BYE!! THANK YOU");
       break outer;}
   switch(cho)
   {case 1: len=s1.length;ee=(len-1)*Math.random();
       x=s1[(int )ee];break;
    case 2: len=s2.length;ee=(len-1)*Math.random();
       x=s2[(int)ee];break;
    case 3: len=s3.length;ee=(len-1)*Math.random();
       x=s3[(int)ee];break;
      case 4: len=s4.length;ee=(len-1)*Math.random();
       x=s4[(int)ee];break; 
      case 5: len=s5.length;ee=(len-1)*Math.random();
       x=s5[(int)ee];break;  
    default : System.out.println("Wrong choice");break;
}

            for( i=0;i<x.length();i++)
            {vow=x.charAt(i)+"";if(vow==" "){cc++;}
                     wrd[i]=vow;if(vow.equalsIgnoreCase("-")||vow.equalsIgnoreCase("/")||vow.equalsIgnoreCase(" ")||vow.equalsIgnoreCase("A")||vow.equalsIgnoreCase("E")||vow.equalsIgnoreCase("I")||vow.equalsIgnoreCase("O")||vow.equalsIgnoreCase("U"))
                            {wrd1[i]=vow;cc++;}
                            else{

                            wrd1[i]="_"+" ";}
                            System.out.print(wrd1[i]+" ");
                        }
System.out.println();
                        
 for(int j=5;j>=1;j--)
 {  System.out.println("  Enter Character  "+" Lives Remaining -----> "+s);
     cr=y2.readLine();if(cr.equalsIgnoreCase("!"))
     {System.out.println(" BYE!! THANK YOU");
         break outer;}
         cr=cr.toUpperCase();
         if(cr.equalsIgnoreCase("A")||cr.equalsIgnoreCase("E")||cr.equalsIgnoreCase("I")||cr.equalsIgnoreCase("O")||cr.equalsIgnoreCase("U"))
         {j++;continue;}
    
     wrd2[cd]=cr;cd++;
     for(int e=1;e<cd-1;e++)
     { if((cr.equals(wrd2[e])&&e>1))
        {System.out.println(cr+" ALREADY ENTERED PLEASE ENTER OTHER CHARACTER ");
           cr=y2.readLine();
           cr=cr.toUpperCase();
        }}
     for(int k=0;k<i;k++)
     {if((cr.equalsIgnoreCase(wrd[k])))
         {pos=k;f=1;wrd1[k]=cr;cc++;wrd[k]="";
          }
          
     }
    
     
    if(f==1)
    {
       for(int g=0;g<x.length();g++)
        {System.out.print(wrd1[g]);
        }j++;f=0;if(cc==x.length())
        {System.out.println(" ----> Youve Got It "); break;}
    }
    else
     {
        s=s-1;System.out.println(" OOPS WRONG CHARACTER ENTERED "+" Lives Remaining -----> "+s); 
     if(s==0)
     {System.out.println("HARD LUCK YOU LOSE BUDDY"+"WORD WAS "+x);}continue;
    }tr=0;
}System.out.println(" Word Was "+x);
System.out.println(" Do you Want To Play Again Y/N");
y=y2.readLine();
if(y.equalsIgnoreCase("y"))
  {pl++;s=5;}
else
break outer;}}
break;
case 2:{System.out.println("HANGMAN IS A VERY EXCITING GAME THAT WAS DEVELOPED IN LATE 1990's.");
   System.out.println("YOU WILL BE PROVIDED WITH AN INCOMPLETE WORD AND ONLY THE VOVELS WILL BE DISPLAYED.\n"+"YOU HAVE TO GUESS THE WORD.\n"+"YOU HAVE 5 CHANCE,IN PUT THE WORDS WITH THE HELP OF KEYBOARD/n");
     System.out.println("");pl=1;s=1;continue outer;}
    case 3:{System.out.println("GAME DESIGNED BY RAHUL");
        System.out.println(" GAME IDEA BY SHASHWAT PRASAD ");
        System.out.println("SPECIAL THANKS TO ALL STUDENTS OF XII SCIENCE");
        System.out.print("SPECIALLY TO: \n"+"1:KETAN \n"+"3:AISHWARYA \n"+"4:ABHIMANYU \n"); 
        pl=1;s=1;
     continue outer;}
case 4:System.out.println(" BYE!! THANK YOU");break;
default:System.out.println("Wrong Choice");break;
    }}
    while(y.equalsIgnoreCase("y")||(ch1>=1&&ch1<=4));
    if(ch1==4)
    {System.out.println(" BYE ");}
}}
     