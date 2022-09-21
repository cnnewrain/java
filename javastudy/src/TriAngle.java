
public class TriAngle {

//	public TriAngle(int a,int b) {
//		base=a;
//		height=b;
//	}
	private int base;
	private int height;
	public void PrintS()
	{
		System.out.println("三角形面积是:"+base*height/2);
	}
	public void GetS(int base,int height)
	{
		if(base>0&&height>0)
			
		System.out.println(base*height/2);
		else
			System.out.println("数值错误");
	} 
}
