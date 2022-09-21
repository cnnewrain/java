//方法的参数传递



//{

//  形参是基本数据类型的情况之下

//	public static void swap(int i) {
//		int i1=6;
//		System.out.println("swap方法中的参数中i的值:"+i1);
//	}
//	public static void main(String agrs[]) {
//		int a=0;
//		swap(a);
//		System.out.println("main方法中a的值:"+a);
//	}
//}     输出结果为 swap方法中的参数中i的值:6   main方法中a的值:0

// 形参是引用类型的情况下  类似于c语言里面的指针变量 
//{
//	public static void swap(Dataswap ds1)
//	{
//		ds1.a=6;
//		System.out.println("swap方法里面,a的值输出为:"+ds1.a);
//	}
//	public static void main(String[] args)
//	{
//		Dataswap ds=new Dataswap();
//		System.out.println("执行swap之前,main方法里面,a的值为:"+ds.a);
//		swap(ds);
//		System.out.println("执行swap之后,main方法里面,a的值为:"+ds.a);
//	}
//} 

/*
输出结果为   swap方法里面,a的值输出为:6  执行swap之前,main方法里面,a的值为0  执行swap之后,main方法里面,a的值为:6  相当于c语言里面的指针变量发生改变指向了Dataswap的数据 
也就是ds1.a=6  所以执行完swap之后 由于引用对象（指针变量）指向了 Dataswap 所以 再次输出值为6 因为地址发生了改变. 对象（变量）存放在堆里面  而引用对象（指针变量）存放在栈里面
引用变量里面存放着 对象的地址也就相当于指针变量里面存放着变量的地址
*/
 
/*
 *    匿名对象方法：
 *    public class Test
 *    {
 *    public double area(double r)
	{																										匿名的b要用方法double类型
		return 3.14*r*r;							这是一个求圆面积的函数 如果只用一次  用匿名方法创建对象为:	 double b=new Test().area(参数); 不用在创建一个新变量接收值
	}			
	  }									如果不用匿名方法就要在创建一个变量:Test b=new Test();  不用匿名的方法要用类的java文件的名字 如Test
						 															 double a=b.area(2);
																									
 */
















