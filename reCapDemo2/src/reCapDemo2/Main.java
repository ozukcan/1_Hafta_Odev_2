package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2 , 1.3, 4.3, 5.6};
		double total=0;
		double enBuyuk = myList[1];
		
		for(double number:myList) {
			if(enBuyuk < number)
			{
				enBuyuk = number;
			}
			total = total + number;
		}
		 System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + enBuyuk);
		
		

		 

	}

}
