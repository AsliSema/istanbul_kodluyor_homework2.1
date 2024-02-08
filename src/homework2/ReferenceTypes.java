package homework2;

public class ReferenceTypes {

	public static void main(String[] args) {
		//Bellekte iki tane alan var biri stack diğeri heap. 
		//int DEĞER TİP olarak kabul edilir ve stack te tutulur.
		
		int number1 = 10;
		int number2 = 20;
		
		number1 = number2; // number2 'nin DEĞERİ number1' e atanır.
		number2 = 100; // number2' nin değeri 100' e eşitlenir. 
		
		System.out.println(number1);  //çıktı: 20
		
		//-------------------------------------------------------------//

		
		//String stackte mi tutulur heapte mi??? Buna bakılırsa stackte tutulur??
		String str1 = "abc";
		String str2 = "hey";
		
		str1 = str2;
		str2 = "merhaba";  
		
		System.out.println("str1 ---> " + str1);  //çıktı: hey
		
		String str3 = new String("nasıl");
		String str4 = new String("acaba");
		str3 = str4;
		str4 = new String("bakalım");
		
		System.out.println("str3 ---> " + str3); //çıktı: acaba
		
		//-------------------------------------------------------------//


		//Array ler REFERANS TİP' tir. Değer tip değildir!
		//numbers1 isim olarak stack'te tutulur.
		//new yapıldığı zaman onun bir tane örneği bellekte oluşturulur.
		//numbers1' in karşılığı olan değerler heap'te oluşturulur.
		//İkisi arasındaki bağlantı referansla sağlanır.
		
		
		//int[] numbers = new int[] {1, 2, 3};
		int[] numbers1 = {1, 2, 3};
		int[] numbers2 = {10, 20, 30};
		
		
		//numbers2'nin REFERANSINI numbers1'e atar. Değerini değil.
		numbers1 = numbers2;
		numbers2[1] = 1000;
		
		System.out.println(numbers1[1]); //çıktı: 1000
				

	}

}
