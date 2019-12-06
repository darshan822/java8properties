package java8properties;

interface Myinterface
{
	public void mymethod();
}
public class methodreference {
	public static void referedMethod()
	{
		System.out.println("refer method is executing");
	}
	public static void main(String[] args) {
		Myinterface i=methodreference::referedMethod;
		i.mymethod();
		
	}

}
