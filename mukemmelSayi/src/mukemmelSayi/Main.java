package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//Mükemmel sayı = Kendinden başka pozitif tüm tam bölenlerin toplamı kendisine eşit olan sayılar mükemmel sayıdır
		//6 --> 1,2,3 = Toplamları 6 yapar
		
		int number = 6;
		int total = 0;
		boolean mukemmelmi = false;
		for(int i=1;i<number;i++)
		{
			if(number % i == 0)
			{
				total = total + i;
			}
		}
		
		if(total == number)
		{
			mukemmelmi = true;
			System.out.println(number + " : Mükemmel sayıdır");
		}
		else
		{
			System.out.println(number + " : Mükemmel sayı değildir.");
		}
		
	}

}
