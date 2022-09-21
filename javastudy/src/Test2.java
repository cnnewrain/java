
public class Test2 {
/*
	public Test2(int a,String n)
	{
		age=a;
		name=n;

	}
		public int age;
		public String name;
		*/
		
		//javabean测试
	public static void main(String[] args) {
		
		Javabean bean=new Javabean();
		bean.setName("zhangsan");
		bean.setAge(2);
		bean.setSex('m');
		bean.getAge();
		bean.getName();
		bean.getSex();
		System.out.println(bean.getAge());
		System.out.println(bean.getName());
		System.out.println(bean.getSex());
	}	
	
		
}	

