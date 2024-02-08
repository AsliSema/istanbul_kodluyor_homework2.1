package homework2;

public class Main {

	public static void main(String[] args) {
		
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Save();
//		Customer customer = new Customer(); //örneğini oluşturma, instance oluşturma, instance creation
//		customer.id = 1;
//		customer.firstName = "Nikola";
//		customer.lastName = "Tesla";
//		customer.nationalIdentity = "1111111";
		
		//CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.Save(1, "Nikola", "Tesla", "11111111");
//		customerManager.save();
//		customerManager.delete();
//		
//		Company company = new Company();
//		company.taxNumber = "11111";
//		company.companyName = "Arçelik";
//		company.id = 100;
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		CustomerManager customerManager3 = new CustomerManager(new Company());
//		CustomerManager customerManager4 = new CustomerManager(new Customer());
//		
//		Customer customer1 = new Customer();
//		Customer customer2 = new Company();
//		Customer customer3 = new Person();
		
		
//		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
//		customerManager.giveCredit();
//		customerManager.saveCredit();
		
		
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new TeacherCreditManager());
		//customerManager2.giveCredit();
		customerManager2.saveCredit();


	}

}
