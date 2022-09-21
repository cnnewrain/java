
public class This 
{	
	public This()
	{
		
	}												//this 可以作为一个类中，构造器相互调用的特殊格式 如 this（）无参数 this（2）
	public This(int age) 							//																有参数	
	{												//使用this必须放在构造器的首行位置		
													//使用this调用本类中的其他构造器时，必须保证至少有一个构造器是不用this的
	}
	public This(String name)
	{
		this();//调用的public This(int age)
	}
	public This(int age,String name) 
	{
		this(2);//调用的public This(int age,String name)
	this.age=age;
	this.name=name;
	}
	int age;
	String name;
	public static void mian(String args[])
	{
		
	}
	
}
