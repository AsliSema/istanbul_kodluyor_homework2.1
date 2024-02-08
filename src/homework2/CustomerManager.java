package homework2;

public class CustomerManager {

	//Sonradan customer'a değer eklenmek istendiğinde buraya da gelip eklemek gerekir. O yüzden bu kullanım mantıklı değil.
//	public void Save(int id, String firstName, String lastName, String nationalIdentity) {
//		System.out.println("Müşteri kaydedildi.");
//	}
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri kaydedildi. ");
	}

	public void delete() {
		System.out.println("Müşteri silindi. ");
	}
	
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi.");
	}
	
	public void saveCredit() {
		_creditManager.save();
		System.out.println("Kredi kaydedildi. Artık kullanabilirsiniz! ");
	}
}
