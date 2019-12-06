package java8properties;//if already implementation is there better to go for method reference otherwise go for lamda expression .then go for normal implementation
class Sample
{
	Sample()
	{
		System.out.println("sample class construcvtor is executexd");
	}
}
interface abc
{
	public Sample m1();
	
	
}
class Test{
	public static void main(String[] args) {
		abc i=Sample::new;
		i.m1();
		
	}
	
}


