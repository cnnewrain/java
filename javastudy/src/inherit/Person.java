//此类是父类 人共有的特性 年龄 性别 名字
package inherit;

public class Person {

	int age;
	String name;
	int sex;
	public void showInfo()
	{
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
	}
}
