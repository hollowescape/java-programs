class person{
	int n;
	person()
	{
		System.out.println(" in person class");
	}
}

class employee extends person{
	int n,sal;
	employee()
	{
		
		System.out.println(" in employee class");
	}
	}
class mag extends person{
	mag()
	{
	
       System.out.println(" in manager class");
	}
}	/*person(int n)
	{
		this.n=n;
	}
	void setdata(int n)
	{
			this.n=n;
	}
	void display()
	{
		System.out.println(" the number of employee is"+n);
	}
	protected void finalize()
	{
		System.out.println(" end of person");
	}
}

	/*employee(int n1,int n,int sal)
	{
		super.n=n1;
		this.n=n;
		this.sal=sal;
	}
	void setdata(int n,int sal)
	{
		this.n=n;
		this.sal=sal;
	}
	void display()
	{
		System.out.println(" the number of employee are "+n);
		System.out.println(" the average salary of employee is "+sal);
	}
	protected void finalize()
	{
		System.out.println(" end of employee");
	}

}*/
