import java.util.*;
public class test5{
	public static void main(String argu[])
	{	Scanner o=new Scanner(System.in);
		student st=new student();
		teacher t=new teacher();
		int e=1,c;
		while(e==1){
		System.out.println(" enter the choice");
		System.out.println(" 1. enter teacher biodata\n 2. enter the student data\n 3. print details teacher\n 4. print student details\n 5.exit");
		c=o.nextInt();
		switch(c)
		{
			case 1: t.biodata();
					break;
			case 2:	st.biodata();
					break;
			case 3: t.display();
					break;
			case 4: st.display();
					break;
			case 5: e=0;
					break;
		}
			}
	}
}