public class thread extends Thread{
	table t;
	int n;
	public thread(table t,int n)
	{
		this.t=t;
		this.n=n;
	}
	public void run()
	{
		t.display(n);
	}
}