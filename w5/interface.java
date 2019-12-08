import java.util.*;
interface resume{
	 public void biodata();
}

class teacher  implements resume{
		String s;
		int a,c;
		Scanner o=new Scanner(System.in);
		 public void biodata()
		{
			System.out.println(" enter 1. for male teacher \n 2. for female teacher ");
	 		c=o.nextInt();

			System.out.println(" enter the qualifiaction of teacher");
			s=o.next();

			System.out.println(" enter the experience of techer");
			a=o.nextInt();
		}
		void display()
		{	if(c==1)
			{
				System.out.println(" the gender of teacher is male");
			}
			else
			{
			System.out.println(" the gender of teacher is female");	
			}
			System.out.println(" the qualifiaction of teacher is"+s);
			System.out.println(" the experience of teacher is "+ a);
		}		
}
class student implements resume{
	Scanner o=new Scanner(System.in);
	String c,g;
	String s;
	 public void biodata()
	{
		System.out.println(" enter the gender (M/F");
		c=o.next();
		System.out.println("enter the branch of student");
		s=o.next();
		System.out.println(" enter the grade of student");
		g=o.next();

	}
	void display()
		{
			System.out.println(" the gender of student is"+c);
			System.out.println(" the branch of student is "+ s);
			System.out.println(" the grade of student is "+ g);
		}	
}