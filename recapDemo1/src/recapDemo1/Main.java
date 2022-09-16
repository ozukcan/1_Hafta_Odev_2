package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		int enBuyukSayi = sayi3;
		
		if(enBuyukSayi < sayi1) {
			enBuyukSayi = sayi1;
		}
		
		if(enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
			
		System.out.println(enBuyukSayi);
		

	}

}
