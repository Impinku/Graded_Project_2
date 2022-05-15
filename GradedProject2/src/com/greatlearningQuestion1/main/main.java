package com.greatlearningQuestion1.main;

import java.util.Scanner;

import com.greatlearningQuestion1.floorconstruction.floorConstruction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the total number of floors in the building:");

		int totalfloor = sc.nextInt();

		int[] floorSizes = new int[totalfloor];

		for (int i = 0; i < floorSizes.length; i++) {

			int day = i + 1;

			System.out.println("\nEnter the floor size on day :" + day);

			int size = sc.nextInt();

			if (size <= 0) {

				System.out.println("\nFloor size cannot be less than or equal to zero");

				i--;
			}

			else if (size > totalfloor) {

				System.out.println("\nFloor size cannot be greater than totalfloor");

				i--;
			}

			else {

				floorSizes[i] = size;

			}

		}

		floorConstruction fConstruction = new floorConstruction();

		fConstruction.constructFloor(totalfloor, floorSizes); 
		sc.close();


	}

}
