public class test2{
	public static void main(String argu[])
	{
		table t=new table();
		thread t1=new thread(t,8);
		thread t2=new thread(t,9);
		t1.start();
		t2.start();
	}
}