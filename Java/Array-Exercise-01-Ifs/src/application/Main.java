package application;

import java.util.Scanner;

import Entities.Students;

public class Main {

	public static void main(String[] args) {
		
		Students[] rooms = new Students[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms do you want to rent?");
		int numberOfRooms = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=numberOfRooms; i++) {
			String[] inData = new String[2];
			System.out.println("Rent #"+i+": ");
			System.out.print("Name: ");
			sc.nextLine();
			inData[0] = sc.nextLine();
			System.out.print("Email: ");
			inData[1] = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			Students student = new Students(inData[0], inData[1]);
			rooms[room] = student;
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i+": "+rooms[i]);
			}
		}
		sc.close();
	}
}
