package com.circularsinglylist;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		CircularSinglyList cList=new CircularSinglyList();
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		do {
			System.out.println("1. Insert Element At First ");
			System.out.println("2. Display the CircularSinglyList");
			System.out.println("3. Insert Element At Last ");
			System.out.println("4. Insert Element And Position");
			System.out.println("5. Delete Element At First ");
			System.out.println("6. Delete Element At Last ");
			System.out.println("7. Insert  Position to delete Element");
			System.out.println("Enter the Choice");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Enter the Element :: ");
				cList.insertAtFirst(sc.nextInt());
				break;
			case 2:
				cList.display();
				break;
			case 3:
				System.out.println("Enter the Element :: ");
				cList.insertAtLast(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the position and data");
				cList.insertAtPosition(sc.nextInt(), sc.nextInt());
				break;
			case 5:
				cList.deleteFirst();
				break;
			case 6:
				cList.deleteLast();
				break;	
			case 7:
				System.out.println("Enter the position to delete Element ");
				cList.deleteAtPos(sc.nextInt());
				break;
			case 8:
				System.out.println("Enter the Element to find ");
				cList.findElementPosition(sc.nextInt());
				break;	
			case 0:
				exit=false;
				break;
			}
		}while(exit);
	}

}
