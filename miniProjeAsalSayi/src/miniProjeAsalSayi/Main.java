package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		boolean asalmi = true;
		
		if(number==1 || number < 1)
		{
			System.out.println("1 veya geçersiz bir sayı girdiniz");
			return;
		}
		
		for(int i=2;i<number;i++)
		{
			if(number % i == 0) {
				asalmi = false;
			}
		}
		
		if(asalmi)
		{
			System.out.println(number + " : asal sayıdır");
		}
		else 
		{
			System.out.println( number + " : asal değildir");
		}


	}
	

}
