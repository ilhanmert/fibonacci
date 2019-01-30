package fibonacci;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		System.out.print("sayi giriniz:");
		int sayi1;
		boolean sonuc;
		Scanner klavye = new Scanner(System.in);
		sayi1=klavye.nextInt();
		sonuc=isFibonacci(sayi1);
		System.out.println(sonuc);
		
	}
	public static int fibonacci (int sayi) //recursive fonksiyon
	{
		 if(sayi == 0) //ilk elemaný 0 olarak belirler
		      return 0;
		    else if(sayi == 1) //ikinci elemaný 1 olarak belirler
		      return 1;
		   else
		      return fibonacci(sayi - 1) + fibonacci(sayi - 2); //girilen sayýdan önceki 2 sayýyý toplar
	}
	public static boolean isFibonacci (int sayi)
	{
		int sonuc;
		for (int i=0; i<=sayi+2 ;i++) //for döngüsü 2 ve 3 sayýlarýna kadar gelmediði için kontrol aralýðýný 2 arttýrdýk
		{
			sonuc=fibonacci(i); //dizi elemanlarýný tek tek kontrol eder
			if (sonuc==sayi) return true; //kontrol edilen sayýya eþit sonuç varsa true döndürür
		    if (sonuc>sayi) break; //sonuc kontrol edilen sayýyý geçtiyse bir daha eþitlik saðlanamayacaðý için dögü biter false döndürür
		}                       // diziden gelen sonucun sayýdan küçük olmasý halinde döngü, sayý büyük ya ada eþit olana kadar devam eder
		return false;
	}
}
