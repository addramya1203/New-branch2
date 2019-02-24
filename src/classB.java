
public class classB extends classA{

	public static void main(String[] args) {

		classA obj=new classB();
		obj.MethodA();
		obj.methodB();
		
		classB obj1=new classB();
		obj1.MethodA();
		obj1.MethodC();
		obj1.methodB();
		
		
	}
	@Override
	public void MethodA() {
		System.out.println("Method A of ClassB");
	}
	public void MethodC() {
		System.out.println("Method c of ClassB");
	}
}
