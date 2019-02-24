public class StaticBlock {

	static {
		System.out.println("in static block");
	}

	{
		System.out.println("in initialization block");
	}

	public StaticBlock() {
		System.out.println("in constructor");
	}

	public void method() {
		System.out.println("inside method");
	}

	public static void main(String[] args) {
		System.out.println("in main method");
		StaticBlock block = new StaticBlock();
		block.method();
	}
}