package dsi;

public class HelloWorld {

	public static void main(String[] args) {
		(new HelloWorld()).Run();
	}
	void Run() {
		var name = "Greg";
		System.out.println(String.format("Hello, %s", name));
	}
}
