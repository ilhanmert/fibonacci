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
		 if(sayi == 0) //ilk eleman� 0 olarak belirler
		      return 0;
		    else if(sayi == 1) //ikinci eleman� 1 olarak belirler
		      return 1;
		   else
		      return fibonacci(sayi - 1) + fibonacci(sayi - 2); //girilen say�dan �nceki 2 say�y� toplar
	}
	public static boolean isFibonacci (int sayi)
	{
		int sonuc;
		for (int i=0; i<=sayi+2 ;i++) //for d�ng�s� 2 ve 3 say�lar�na kadar gelmedi�i i�in kontrol aral���n� 2 artt�rd�k
		{
			sonuc=fibonacci(i); //dizi elemanlar�n� tek tek kontrol eder
			if (sonuc==sayi) return true; //kontrol edilen say�ya e�it sonu� varsa true d�nd�r�r
		    if (sonuc>sayi) break; //sonuc kontrol edilen say�y� ge�tiyse bir daha e�itlik sa�lanamayaca�� i�in d�g� biter false d�nd�r�r
		}                       // diziden gelen sonucun say�dan k���k olmas� halinde d�ng�, say� b�y�k ya ada e�it olana kadar devam eder
		return false;
	}
}
