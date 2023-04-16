
public class Video {
private String videoName;
private boolean checkout=false;
private int rating;

public Video(String name){
	this.videoName=name;
}

String getName(){
	return this.videoName;
}
void doCheckout(){
	checkout = true;
}
void doReturn(){
	checkout=false;
}
void receiveRating(int rating){
	this.rating=rating;
}
int getRating(){
	return this.rating;
}

boolean getCheckout(){
	return this.checkout;
}


}
