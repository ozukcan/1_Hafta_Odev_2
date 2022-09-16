package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("-------------------------------");
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4)); //charAt = string dizisindeki elemanlara ulaşmamızı sağlar
		System.out.println("-------------------------------");
		//Concat = iki metin birleştirme
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj); //yeni mesajımız = "Bugün hava çok güzel Yaşasın!" olur.
		System.out.println("-------------------------------");
		
		//startsWith - endWith = başlıyormu - bitiyormu
		System.out.println(mesaj.startsWith("B")); //sonuçları boolean olur, B ile başlıyorsa True, başlamıyorsa False olur.
		System.out.println(mesaj.endsWith(".")); //sonuçları boolean olur, B ile başlıyorsa True, başlamıyorsa False olur.
		System.out.println("-------------------------------");
		
		//getChars = cümleden kelime/harf aktarmamızı sağlar.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); //(başlangıç,bitiş,aktarılacak char arrayi,kaçıncı karakterden başlayacağı)
		System.out.println(karakterler);
		System.out.println("-------------------------------");
		
		//indexOf = metindeki harflerin kaçıncı indexte olduğunu bulmamızı sağlar.
		//lastIndexOf = aramaya sağdan başlar.
		//NOT = İlk bulduğu harfin indexini gösterir.
		System.out.println(mesaj);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println("-------------------------------");
	}

}
