import add.addition;
import sub.substraction;
import mult.multiplication;
import div.division;
class calculator{
	public static void main(String args[])
	{
	addition obj=new addition();
	substraction obj1=new substraction();
	multiplication obj2=new multiplication();
	division obj3=new division();
	
	obj.set();
	System.out.println("***************************************************");
	obj1.set();
	System.out.println("***************************************************");
	obj2.set();
	System.out.println("***************************************************");
	obj3.set();
	}
}

