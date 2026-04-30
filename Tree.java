
package constructor;

public class Fruit {
	String name;
	double weight;
	double price;
		Fruit(String name)
		{
			this.name=name;
		}
		Fruit(String name, double weight)
		{
			this.name=name;
			this.weight=weight;
		}
		Fruit(String name, double weight, double price)
		{
			this.name=name;
			this.price=price;
			this.weight=weight;
		}
		public void displayFruit()
		{
			System.out.println("name of fruit:"+name);
			System.out.println("weight of fruit:"+weight);
			System.out.println("price of fruit:"+price );
		}
	
	
		
		
	
	

}
