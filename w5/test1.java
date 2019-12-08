import java.util.*;
public class test1{
	public static void main(String arg[])
	{	Scanner o=new Scanner(System.in);
		whale w= new whale();
		bat b= new bat();
		dog d=new dog();
		int e=1;
		while(e==1)
		{System.out.println(" enter the choice to see detaisl\n");
		System.out.println(" 1. whale \n 2. bat\n 3. dog \n 4. exit" );
		int n=o.nextInt();
		switch(n)
		{
			case 1: w.eat();
					w.moves();
					w.sleep();
					break;
			case 2: b.eat();
					b.moves();
					b.sleep();
					break;

			case 3: d.eat();
					d.moves();
					d.sleep();
					break;
			case 4: e=0;
					break;
		}

	}
	}
}