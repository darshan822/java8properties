package java8properties;
interface dem0
{
	public Sample1 get();
	
}
class Sample1
{
	Sample1()
	{
		System.out.println("constructor  is executing");
	}
	
}

public class test3 {
	public static void main(String[] args) {
		dem0 d=Sample1::new;
		d.get();
		
		
		
	}

}
