package electronicshop;

import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

abstract class MyClass
{

//	abstract void getData();
	abstract double displayData();
//	abstract void calculateBill();
//	abstract void generateBill();
	
}

class Tv extends MyClass
{

	String name1 = "Samsung";
	String size1 = "1500-2000";
	double price1 = 20000.00;
	String name2 = "Xiomi MI";
	String size2 = "1600-2000";
	double price2 = 25000.00;
	String name3 = "LG";
	String size3 = "1700-2000";
	double price3 = 27000.00;
	double displayData()
	{
		double price = 0;
		System.out.println("Enter\n1 for Samsung\n2 for Xiomi MI\n3 for LG");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("TV brand: "+name1);
			System.out.println("TV size: "+size1);
			System.out.println("TV Price: "+price1);
			price = price1;
		}
		else if(choice == 2)
		{
			System.out.println("TV brand: "+name2);
			System.out.println("TV size: "+size2);
			System.out.println("TV Price: "+price2);
			price = price2;
		}
		else if(choice == 3)
		{
			System.out.println("TV brand: "+name2);
			System.out.println("TV size: "+size2);
			System.out.println("TV Price: "+price2);
			price = price3;
		}
		System.out.println("Item added to your cart...");
		System.out.println();
		return price;
		
	}
}

class Laptop extends MyClass
{
	String name1 = "HP";
	String size1 = "1500-2000";
	double price1 = 60000.00;
	String name2 = "Lenovo";
	String size2 = "1600-2000";
	double price2 = 85000.00;
	String name3 = "Asus";
	String size3 = "1700-2000";
	double price3 = 97000.00;
	double displayData()
	{
		double price = 0;
		System.out.println("Enter\n1 for HP\n2 for Lenovo\n3 for Asus");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Laptop brand: "+name1);
			System.out.println("Laptop size: "+size1);
			System.out.println("Laptop Price: "+price1);
			price = price1;
		}
		else if(choice == 2)
		{
			System.out.println("Laptop brand: "+name2);
			System.out.println("Laptop size: "+size2);
			System.out.println("Laptop Price: "+price2);
			price = price2;
		}
		else if(choice == 3)
		{
			System.out.println("Laptop brand: "+name2);
			System.out.println("Laptop size: "+size2);
			System.out.println("Laptop Price: "+price2);
			price = price3;
		}
		System.out.println("Item added to your cart...");
		System.out.println();
		return price;
		
	}
}

class Headphones extends MyClass
{
	String name1 = "Sony";
	String frequenzy1 = "40Hz – 50kHz";
	double price1 = 600.00;
	String name2 = "JBL";
	String frequenzy2 = "30Hz – 40kHz";
	double price2 = 850.00;
	String name3 = "SkullCandy";
	String frequenzy3 = "80Hz – 120kHz";
	double price3 = 970.00;
	double displayData()
	{
		
		double price = 0;
		System.out.println("Enter\n1 for Sony\n2 for JBL\n3 for SkullCandy");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Headphones brand: "+name1);
			System.out.println("Headphones size: "+frequenzy1);
			System.out.println("Headphones Price: "+price1);
			price = price1;
		}
		else if(choice == 2)
		{
			System.out.println("Headphones brand: "+name2);
			System.out.println("Headphones size: "+frequenzy2);
			System.out.println("Headphones Price: "+price2);
			price = price2;
		}
		else if(choice == 3)
		{
			System.out.println("Headphones brand: "+name2);
			System.out.println("Headphones size: "+frequenzy3);
			System.out.println("Headphones Price: "+price2);
			price = price3;
		}
		System.out.println("Item added to your cart...");
		System.out.println();
		return price;
	}
	
}

public class ElectronicShop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hm = new HashMap<>();
		hm.put("madhu", "123");
		hm.put("mohan", "456");
		hm.put("mythreyan", "789");
		hm.put("sathish", "012");
		
		System.out.println("Login Module");
		System.out.println("Enter UserName:");
		String username = sc.next().trim();
		System.out.println("Enter Password:");
		String pwd = sc.next().trim();

		if(pwd.equals(hm.get(username).toString()))
		{
			double netprice=0.0D;
			System.out.println("Welcome to Syntel Electronics Shop");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			System.out.print("Date :");
			System.out.print(dtf.format(now));  
			System.out.println();

			while(true)
			{
				System.out.println("Select Which you want to buy:");
				System.out.println("Enter\n1 for TV\n2 for Laptop\n3 for Headphones\n4 for Netprice\n5 for Exit...");
				System.out.print("Enter your choice:");
				int choice = sc.nextInt();
				if(choice == 1)
				{
					Tv tv = new Tv();
					MyClass mc;
					mc = tv;
					double np1 = mc.displayData();
					netprice=netprice+np1;
					
				}
				else if(choice == 2)
				{
					Laptop lt = new Laptop();
					MyClass mc;
					mc = lt;
					double np2 = lt.displayData();
					netprice=netprice+np2;
				}
				else if(choice == 3)
				{
					Headphones hps = new Headphones();
					MyClass mc;
					mc = hps;
					double np3 = hps.displayData();
					netprice=netprice+np3;
				}
				else if(choice == 4)
				{
					System.out.println("Net price = "+netprice);
				}
				else if(choice == 5)
				{
					System.exit(0);
				}
			}
			
			
		}
		else
		{
			System.out.println("Incorrect password");
		}
		
	}

}
