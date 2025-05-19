import java.util.Scanner;
import java.util.Random;

class Guess
{
public static void main(String [] args)
{
int i=1;
Scanner sc= new Scanner(System.in);
Random random = new Random();
int computer =random.nextInt(100);

while(i<=10)
{
if(i==10)
{
System.out.println("you ran out of attempts! you can only try for 10 times");
System.out.println(" Do you want another round? yes or no");
sc.nextLine();
String answer2=sc.nextLine();
if(answer2.equals("yes"))
{
i=0;

System.out.println(" Here is another round! Do well");
computer=random.nextInt(100);
}
else
{
break;
}
}
System.out.println("choose the number");
int user =sc.nextInt();

if(user==computer)
{
System.out.println(" congrates! you chose same ");
System.out.println(" Do you want another round? yes or no");
sc.nextLine();
String answer=sc.nextLine();
if(answer.equals("yes"))
{
i=0;
System.out.println(" Here is another round! Do well");
computer=random.nextInt(100);
}
else
{
System.out.println(" you attempted"+ " "+i+"times");
System.out.println(" your score ="+ (11-i));
break;
}
}
else if(user>computer)
{
System.out.println(" no you chose high number , choose less ");
}
else 
{
System.out.println(" no you chose low number, choose high ");
}
i++;
}
sc.close();
}
}