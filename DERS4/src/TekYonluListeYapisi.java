public class TekYonluListeYapisi {
	// en başta bir node tipinde en baş düğümü tutan bir head düğümü olacak
	// Node sınıfından bir nesne oluşturacağız.
	Node head = null;// bu tek yonlu doğrusal listeye eleman eklemesi yaparsam ilk elemanı head
						// olarak isimlendireceğim
	Node tail = null;

	void basaekle(int x)// ekeleyeceğimiz düğümün datası yani tutacağı değer
	{
		Node eleman = new Node();// node tipinde bir eleman nesnesi (düğümü,objesi)
		eleman.data = x;// elemanın verisi parametre olarak gelen xtir.
		// peki elemanın pointerı nereyi gösterek ?basa ekleme yaptııgmız icin
		// ekleyecegimiz eleman yeni head olacak ve eski headi gösterecek (pointerla)

		if (head == null) {
			eleman.next = null;// elemanın işaret edeceği yer bostur
			/*
			 * simdi neden bos olduguna bir bakalım Başlangıçta elimizde şu şekilde bir
			 * bağlı liste var: head → [10] → [20] → [30] → null basaEkle(5); çağırdığımızda
			 * şu adımlar gerçekleşir:
			 * 
			 * Adım 1: Yeni Düğüm (eleman) Oluşturuluyor Node eleman = new Node();
			 * eleman.data = 5; biz ne yazmıstık eleman.data = x; Yeni bir Node oluşturduk
			 * ve içine 5 değerini koyduk. Şu an eleman.next boş (null) çünkü daha hiçbir
			 * yere bağlanmadı: eleman → [5] → null
			 */
			head = eleman;
			tail = eleman;// listeye ilk elemanı ekledigimiz icin de ilk dugum de son dugum de aynı yeri
							// gösteriyor.
			System.out.println("liste yapısı oluturuldu ve ilk elemna eklendi.");
		} else {// yani headin ici bos degilse elemanın gösterebilecegi herhangi bi yer
				// vardır....
			/*
			 * Adım 2: Yeni Düğümün next İşaretçisini Ayarlamak eleman.next = head; Burada
			 * kritik nokta şu: head, listenin eski başını gösteriyordu. eleman.next = head;
			 * dediğimizde eleman'ın next işaretçisi, eski headi (yani [10] düğümünü)
			 * gösteriyor. Şu an bellek durumu şu şekilde olur: eleman (yeni düğüm) → [5] →
			 * [10] → [20] → [30] → null
			 */
			eleman.next = head;// eski listenin bası (eleman eklenmeden onceki)
			head = eleman;// head artık elemanı göstermeli cünkü yeni baş(head) düğüm o oldu.head eskiden
							// [10] elemanını gösteriyordu artık [5] elemanını gösterecek.
			// son durum head → [5] → [10] → [20] → [30] → null
			System.out.println("basa eleman eklendi.");
		}

	}

	void sonraekle(int x) {
		Node eleman = new Node();
		eleman.data = x;

		if (head == null) {
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("Liste yapısı olusturuldu ve yeni eleman eklendi");
		}

		else {
			eleman.next = null;// sona ekleme yapacağımız için elemanın göstereceği herhangi bir eleman
								// olmaması lazım.
			tail.next = eleman;// son düğüm normalde taildı sona ekleme yaptııgmız icin artık son dugum eleman
								// olacak
			tail = eleman;// burada da tail artık eleman oldu ismini güncelledik.
			System.out.println("sona eleman eklendi.");
		}
		}

	void yazdir() {
		if (head == null) {
			System.out.println("liste yapisi bos");
		} else {
			Node temp = head;// bastaki elemanı gecici olarak tutar
			System.out.println("bas -->>>");
			while (temp != null) {
				System.out.println(temp.data);

				temp = temp.next;// temp her dongude bir sonraki düğüme geçer en son nullu görüp döngğden cıkar
			}
			System.out.println("son");
		}

	}

}