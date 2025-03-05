
public class uygulama {
	public static void main(String[] args) {
		TekYonluListeYapisi tekYonList = new TekYonluListeYapisi();// Bu kodun amacı: TekYonluListeYapisi sınıfından bir
																	// nesne oluşturup, bağlı liste işlemlerini yapmaya
		    														// hazır hale getirmektir.
		
		
		tekYonList.basaekle(10);
		tekYonList.sonraekle(20);
		tekYonList.basaekle(5);
		tekYonList.sonraekle(30);
		
	 tekYonList.yazdir();

	}
}