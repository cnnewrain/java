////此类为 继承中的子类  用extends Personn继承父类里面的特性 然后在写自己特有的特性即可
package inherit;

public class Teacher extends Person {

	String subject;
	public void showInfo()
	{
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.sex);
		System.out.println(this.subject);
	}
}
