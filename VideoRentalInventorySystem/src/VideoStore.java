
public class VideoStore {
	private Video store[];

int i=0;
void addVideo(String name){
	Video newVideo= new Video(name);

	int storeSize;
	try {
		storeSize = store.length;
	} catch (Exception e) {
		storeSize = 0;
	}
	
	Video[] newStore = new Video[storeSize + 1];
	if(storeSize>0){
	for(int i=0;i<store.length;i++){
		newStore[i]=store[i];
	}
	}
	newStore[storeSize] = newVideo;
	store = newStore;
	System.out.println("Video \""+name+"\" added successfully.\n");
}

void doCheckout(String name){

	if (store == null || store.length == 0) {
		System.out.println("Store is empty");
		return;
	}
	for (int i=0;i<store.length;i++) {
		
		Video video=store[i];
		boolean c=video.getName().equals(name);
		
		if (c) {
			
			video.doCheckout();
			System.out.println("Video \""+name+"\" checked out successfully\n");
			return;
		}
		else if(!c && i==store.length-1)
			System.out.println("Video doesn't Exists ");
	
	}
	

}
void doReturn(String name){
	if (store == null || store.length == 0) {
		System.out.println("Store is empty");
		return;
	}
	

	for (int i=0;i<store.length;i++) {
		
		Video video=store[i];
		boolean c=video.getName().equals(name);
		
		if (c) {
			
			video.doReturn();
			System.out.println("Video \""+name+"\" returned successfully\n");
			return;
		}
		else if(!c && i==store.length-1)
			System.out.println("Video doesn't Exists ");
	
	}
}
void receiveRating(String name,int rating){
	if (store == null || store.length == 0) {
		System.out.println("Store is empty");
		return;
	}
	
	for (int i=0;i<store.length;i++) {
	
		Video video=store[i];
		boolean c=video.getName().equals(name);
		
		if (c) {
			
			video.receiveRating(rating);
			System.out.println("Rating \""+rating+"\" has been mapped to the Video \""+name+"\"\n");
			return;
		}
		else if(!c && i==store.length-1)
			System.out.println("Video doesn't Exists ");
	
	}

}
void listInventory(){

	if (store == null || store.length == 0) {
		System.out.println("Store is empty");
		return;
	}
	
	
		for (int i = 0; i < 80; i++) System.out.print("-");
		System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Name", "Rating", "Checkout");
		for (int i = 0; i < 80; i++) System.out.print("-");
		
		for (Video video : store) {
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getRating(), video.getCheckout());
		}
		
		for (int i = 0; i < 80; i++) System.out.print("-");
		System.out.println();
	
	
}

}
