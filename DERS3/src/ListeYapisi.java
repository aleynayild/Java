
public class ListeYapisi {

	Node head = null;//head diye bir "en onemli" düğüm var ama bellekte yer kaplamıypr
    Node tail = null;//son düğüm
//bir fonksiyon olusturalım ki liste yapısının icine dugum eklesin
	
	void ekle(int x)
	{
		Node eleman = new Node();//eklenecek olan düğüm
		eleman.data = x;
		eleman.next = null;
		
		if(head == null )//eğer head nulla eşitse listeyapısı olusturulmamıstır ve düğüm diye bir şwy yoktur
		{
			head = eleman;//head artık null değil
		    tail=eleman;//head ve tail basta null tutar aynı degeri tutar yani.
		System.out.println("liste olusturuldu ve ilk düğüm eklendi");
		}
		else
		{
			tail.next=eleman;//son elemanın devamına yeni düğümü ekledik.
			tail = eleman;//taili son eleamnı güncelledimç
			System.out.println("listenin sonuna yeni bir eleman eklendi");
			
		}
	}
	
	void yazdir()
	{
		if(head == null)
		{
			System.out.println("liste yapısı bos");
		}
		else
		{
			Node temp = head;
			System.out.println("bas ->");
			while(temp != null)
			{
				System.out.println(temp.data + "->");
				
				temp = temp.next;
			}
			System.out.println("son");
			
			
		}
	}
	
	
	
	
}



