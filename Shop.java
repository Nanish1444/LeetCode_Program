import java.util.*;
class Basket{
	private int quantity;
	private  int index;
	private String[] str;
	Basket nextBasket;
	Basket(){
		nextBasket=null;
		index=0;
		str=new String[10];
		Arrays.fill(str,"Empty");
	}

	public boolean Add(String item){
		if(index<10){
			str[index++]=item;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		String value="[";
		for(int i=0;i<str.length;i++){
			value+=str[i];
			if(i<str.length-1){
				value+=",";
			}
		}
		value+="]";
		return value;
	}
}

class Fruits{
	Basket basket;
	Fruits(){
		basket=new Basket();
	}
	void buy(String item){
		Basket temp=basket;
		while(temp.nextBasket!=null){
			temp=temp.nextBasket;
		}
		if(temp.nextBasket==null&&temp.Add(item)==false){
			temp.nextBasket=new Basket();
			temp=temp.nextBasket;
			temp.Add(item);
		}


	}
	void viewBasket(){
		Basket temp=basket;
		while(temp!=null){
			System.out.println(temp);
			temp=temp.nextBasket;
		}
		
	}

}
class Shop{
	public static void main(String[]args){
		String[] things={"1 Apple ","2 Banana ","3 Blueberry ","4 Cherry ","5 Grapefruit ","6 Kiwi ","7 Lemon ","8 Mango ","9 Orange ","10 Strawberry ","11","12","13","14","15"};
		Fruits fruits=new Fruits();
		for(int i=0;i<things.length;i++){
			fruits.buy(things[i]);
		}
		fruits.viewBasket();
	}
}
