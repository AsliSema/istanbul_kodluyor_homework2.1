package homework2;

abstract class BaseCreditManager implements ICreditManager{

	@Override
	public abstract void calculate();

//	@Override
//	public void save() {
//		System.out.println("Kaydedildi.");
//	}
//	
	
	@Override
	public void save() {
		System.out.println("Kaydedildi.");
	}
	
}
