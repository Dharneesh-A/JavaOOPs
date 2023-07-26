package constructor;

public class Child extends Parent{

Child (int a){
	super(12);
	System.out.println("child constructor");
}	
	
	public static void main(String[] args) {
	Child c = new Child(10);
	
	}

}
