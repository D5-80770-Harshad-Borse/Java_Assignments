package com.app.fruitsBasket;

import com.app.fruits.*;
import java.util.*;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basket size: ");
		int size = sc.nextInt();
		fruit basket[] = new fruit[size];
		boolean Exit = false;
		int counter = 0;
		do {
			int choice = 0;
			System.out.println("---------FRIUT BASKET---------");
			System.out.println("1. Add fruit in basket");
			System.out.println("2. Display Fruit Name");
			System.out.println("3. Dispaly Details of All Fruits");
			System.out.println("4. Dispaly Stale Fruits");
			System.out.println("5. Mark Fruit as Stale");
			System.out.println("6. Mark all sour fruits stale");
			System.out.println("7. Exit");
			System.out.println("------------------------------");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1: {
					boolean flag = false;
					int choice1 = 0;
					System.out.println("-------Fruits------");
					System.out.println("1. Add Apple");
					System.out.println("2. Add Mango");
					System.out.println("3. Add Orange");
					System.out.println("4. Exit to main Menu");
					System.out.println("-------------------");

					do {
						System.out.print("Enter Choice: ");
						choice1 = sc.nextInt();
						switch (choice1) {
							case 1: {
								basket[counter] = new Apple();
								basket[counter].accept();
								System.out.println("Apple added");
								counter++;
							}
								break;
							case 2: {
								basket[counter] = new Mango();
								basket[counter].accept();
								System.out.println("Mango added");
								counter++;
							}
								break;
							case 3: {
								basket[counter] = new Orange();
								basket[counter].accept();
								System.out.println("Orange added");
								counter++;
							}
								break;
							case 4: {
								flag = true;

							}
								break;
						}

					} while (!flag);

				}
					break;
				case 2: {
					// for(fruit ref:basket)
					// System.out.println(ref.getname());
					for (int i = 0; i < counter; i++) {
						System.out.println(basket[i].getname());
					}
				}
					break;
				case 3: {
					for (int i = 0; i < counter; i++) {
						basket[i].display();
						// System.out.println("Taste: "+basket[i].taste());
						if (basket[i] instanceof Apple) {
							Apple A1 = (Apple) basket[i];
							if (A1.getIsFresh() == true)
								System.out.println("Tast : " + A1.taste());
						} else if (basket[i] instanceof Mango) {
							Mango M1 = (Mango) basket[i];
							if (M1.getIsFresh() == true)
								System.out.println("Taste : " + M1.taste());
						}

						else if (basket[i] instanceof Orange) {
							Orange O1 = (Orange) basket[i];
							if (O1.getIsFresh() == true)
								System.out.println("Taste : " + O1.taste());
						}

					}
				}
					break;
				case 4: {
					for (int i = 0; i < counter; i++) {
						if (basket[i].getIsFresh() == false) {
							System.out.println(basket[i].getname());
						}
					}
				}
					break;
				case 5: {
					System.out.print("Enter the Index : ");
					int index = sc.nextInt();
					if (index >= 0 && index < counter) {
						basket[index].setIsfresh(false);
					} else
						System.out.println("Please Enter valid index");
				}
					break;
				case 6: {
					for (int i = 0; i < counter; i++) {
						if (basket[i] instanceof Orange) {
							basket[i].setIsfresh(false);
							System.out.println("All sour fruits are marked stale!!");
						}
					}
				}
					break;
				case 7:
					Exit = true;
					break;
				default:
					System.out.println("Invalid User Input!!");
					break;
			}
		} while (!Exit);
	}
}
