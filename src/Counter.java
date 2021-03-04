
public class Counter{
	int result=0;
	
	public int getResult()
	{
		//System.out.println("get");
		return result;
	}
	
	public void setResult(int result)
	{
		System.out.println("set");
		this.result=result;
	}

	public static void main(String[] args) {
		
		Counter c=new Counter();
		c.setResult(10);
		System.out.println(c.getResult());
		System.out.println("returns value");
	}

}
