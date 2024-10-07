import java.util.*;
class Basket{
	private count;
	private Fruit[] fruits;
	Basket(){
		count=0;
		fruits=new Fruit[10];
	}
	void addToBasket(String name){
		if(count<10){
			fruits[count]=new Fruit(name);
			count++;
		}
	}
	void removeFromBasket(){
		if(count>=0){
			fruits[count]="empty";
			count--;
		}

	}
	
}
class Fruit{
	private String name;
	Fruit(String name){
		this.name=name;
	}

}
class Shop{
	public static void main(String[]args){
		Basket basket=new Basket();
		basket.addToBasket("Apple");
		
	}
}
