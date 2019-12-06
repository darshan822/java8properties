package java8properties;

interface demo1
{
	public void m2();
}
public class test2 {
	public static void m3()
	{
		System.out.println("m3 method is executed");
	}

	public static void main(String[] args) {
		demo1 d=test2::m3;
		d.m2();
		// TODO Auto-generated method stub

	}

}
