package com.greatlearningQuestion1.floorconstruction;

import java.util.Stack;

public class floorConstruction {
	private Stack<Integer> floorSizesStack = new Stack<>(); 

	public floorConstruction() {

		System.out.println("\nThe order of construction is as follows :");

	}

	public void constructFloor(int requiredFloorSize, int[] floorSizes)

	{

		for (int i = 0; i < floorSizes.length; i++) {

			int day = i + 1;

			System.out.println("\n\nDay: " + day);

			if (floorSizes[i] != requiredFloorSize) {

				System.out.print(" ");

				floorSizesStack.push(floorSizes[i]);

			}

			else {

				requiredFloorSize -= 1;

				System.out.print(floorSizes[i] + " ");

				while (!floorSizesStack.isEmpty() && requiredFloorSize == floorSizesStack.peek()) 
			
				{

					requiredFloorSize -= 1;

					System.out.print(floorSizesStack.pop() + " "); 

				}

			}

		}

	}

}
