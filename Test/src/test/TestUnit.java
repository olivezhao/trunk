package test;

public class TestUnit {

	public static void main(String[] args) {
		System.out.println( TestManager.getInstance().get_id() );
		TestManager.getInstance().set_id(2);
		System.out.println( TestManager.getInstance().get_id());
	}

}
