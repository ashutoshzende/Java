import java.util.Scanner;
class SavingAcc
{
static int rate1=4;
int bal,acc_no,mon_int;
String nm;
void get(int bal1,int annual_int)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your name:");
nm=sc.next();
System.out.println("Enter Your Account Number:");
acc_no=sc.nextInt();
//bal1=(bal1*4)/100;		
System.out.println("Your balance is:"+bal1);
mon_int=(bal1*annual_int)/12;
bal1=bal1+mon_int;
System.out.println("Monthly interest is:"+mon_int);
System.out.println("Balance is:"+bal1);
	}
/*public void month_int(int l)
{
mon_int=(bal1*annual_int)/12;
bal1=bal1+mon_int;
System.out.println("Monthly interest is:"+mon_int);
System.out.println("Balance is:"+bal1);
}*/
public static void main(String args[])
{
int i;
SavingAcc[] sa= new SavingAcc[3];
SavingAcc sv=new SavingAcc();
sv.get(2000,4); 		
//sv.month_int(4);	
for(i=0;i<2;i++)
{
	
sa[i]=new SavingAcc();
sa[i].get(3000,5);
//sa[i].month_int(5);
	
}
}
}		

