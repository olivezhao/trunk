package test;

public class TestManager {
	private Integer _id;
	private static TestManager _testManager;
	
	private TestManager(){
		_id = 1;
		System.out.println("TestManager() unit");
	}
	
	public static TestManager getInstance(){
		if( _testManager == null)
			_testManager = new TestManager();
		return _testManager;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer id) {
		this._id = id;
	}
	
	
}
