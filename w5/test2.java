public class test2{
	public static void main(String arg[])
	{
		add a=new add();
		int r=a.calci(5,4);
		System.out.println(" the add is "+r);
		sub s=new sub();
		r=s.calci(6,5);
		System.out.println(" the sub is "+r);
		mul m=new mul();
		r=m.calci(3,4);
		System.out.println(" the mul is "+r);
		div d=new div();
		r=d.calci(12,4);
		System.out.println(" the div is "+r);
	}
}