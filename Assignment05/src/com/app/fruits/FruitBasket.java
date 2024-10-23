package com.app.fruits;

import java.util.Scanner;

enum Menu{
	EXIT,
	Add_Mango,
	Add_Orange,
	Add_Apple,
	Display_names_of_all_fruits_in_the_basket,
	Display_name_color_weight_taste_of_all_fresh_fruits_in_the_basket,
	Display_tastes_of_all_stale_fruits_in_the_basket,
	Mark_a_fruit_as_stale,
	Mark_all_sour_fruits_stale
}
public class FruitBasket {	
	public static void main(String[] args) {

			Menu[] menu=Menu.values();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the basket size you want .");
			int sizeOfBasket=scan.nextInt();
			Fruit[] fruits=new Fruit[sizeOfBasket];
			int choice=-1;
			int counter=0;
			double weight=0;
			String color="";
			while(choice!=0)
			{
				for(Menu item:menu) {
					System.out.println(item.ordinal()+"."+item.name());
				}
				choice=scan.nextInt();

				if(choice>=0 && choice<=8)
				{
				switch(menu[choice]) {
				case EXIT :
					choice=0;
					System.out.println("Thanking for using my application.");
					break;
				case Add_Mango:
					if(counter<sizeOfBasket)
					{
					fruits[counter++]=new Mango();
					fruits[counter-1].accept(scan);
					}
				else
					System.out.println("Basket is full.");
				break;
				case Add_Orange:

					if(counter<sizeOfBasket)
					{
					fruits[counter++]=new Orange();
					fruits[counter-1].accept(scan);
					}
				else
					System.out.println("Basket is full.");
				break;
				case Add_Apple:
					if(counter<sizeOfBasket)
					{
					fruits[counter++]=new Apple();
					fruits[counter-1].accept(scan);
					}
				else
					System.out.println("Basket is full.");
				break;
				case Display_names_of_all_fruits_in_the_basket :
					for(Fruit fruit:fruits) {
						if(fruit!=null) {
							System.out.println("Name of fruit - "+fruit.getName());
						}
					}
				break;
				case Display_name_color_weight_taste_of_all_fresh_fruits_in_the_basket:
					for(Fruit fruit:fruits) {
						if(fruit!=null) {
							if(fruit.isFresh())
							{
								System.out.println(fruit);
							}
						}
					}	
				break;
				case Display_tastes_of_all_stale_fruits_in_the_basket :
					for(Fruit fruit:fruits) {
						if(fruit!=null) {
							if(!fruit.isFresh())
							{
								System.out.println(fruit.taste());
							}
						}
					}	

					break;
				case Mark_a_fruit_as_stale:
					System.out.print("Enter the index : ");
					int index = scan.nextInt();
					if(index>=0 && index<sizeOfBasket)
					{
						if(fruits[index]!=null) {
							fruits[index].setFresh(false);
						}else {
							System.out.println("No fruit is available");
						}
					}else {
						System.out.println("Invalid index.");
					}
				break;
				case Mark_all_sour_fruits_stale:
					for(Fruit fruit:fruits) {
						if(fruit!=null) {
							if(fruit.taste().equals("Sour") && !fruit.isFresh())
							{
							fruit.setFresh(false);
							}
						}
					}	

								
				break;
				default:
					System.out.println("Invalid input. Enter correct choice.");
				}
				}else {
					System.out.println("Invalid output. Enter valid input.");
				}
			}
	}

}
