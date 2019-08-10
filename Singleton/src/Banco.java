
public class Banco {
	private static Banco instance;
	
	private Banco() {
		
	}
	
	public static Banco getInstance() {
		if(instance == null)
			instance = new Banco();
		return instance;
	}
	
	public boolean connect() {
		
		return true;
	}
}
