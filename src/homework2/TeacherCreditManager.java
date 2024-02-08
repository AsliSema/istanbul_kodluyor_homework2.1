package homework2;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");
	}

//	@Override
//	public void save() {
//		System.out.println("Öğretmen kredisi kaydedildi.");
//	}
	
	@Override
	public void save() {
		System.out.println("Java da base.save() yok super.save() var! ");
		super.save();
	}

}
