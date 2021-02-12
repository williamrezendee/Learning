import java.util.Scanner;
import java.util.ArrayList;

import entities.Vehicle;
import entities.Motorcycle;
import entities.Car;
import entities.Bus;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> vehicles = new ArrayList();
		int option = 0;
		
		while (option != 9) {
			Menu();
			System.out.println("");
			option = input.nextInt();
			if (option == 1) {
				System.out.print("Placa: ");
				String plate = input.nextLine();
				System.out.print("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.print("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.print("Cor: ");
				String color = input.nextLine();
				System.out.print("Chassi: ");
				String chassis = input.nextLine();
				System.out.print("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.print("Valor da diária: ");
				double valueDaily = input.nextDouble();
				vehicles.add(new Vehicle(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily));
			} else if (option == 2) {
				System.out.println("Placa: ");
				String plate = input.nextLine();
				System.out.println("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.println("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.println("Cor: ");
				String color = input.nextLine();
				System.out.println("Chassi: ");
				String chassis = input.nextLine();
				System.out.println("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.println("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.println("Tipo de moto: ");
				String motorcycleType = input.nextLine();
				System.out.println("Tipo de corrente: ");
				String chainType = input.nextLine();
				vehicles.add(new Motorcycle(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, motorcycleType, chainType));
			} else if (option == 3) {
				System.out.println("Placa: ");
				String plate = input.nextLine();
				System.out.println("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.println("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.println("Cor: ");
				String color = input.nextLine();
				System.out.println("Chassi: ");
				String chassis = input.nextLine();
				System.out.println("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.println("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.println("Tipo de carro: ");
				String carType = input.nextLine();
				System.out.println("Capacidade do porta-malas: ");
				int trunk = input.nextInt();
				vehicles.add(new Car(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, carType, trunk));
			} else if (option == 4) {
				System.out.println("Placa: ");
				String plate = input.nextLine();
				System.out.println("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.println("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.println("Cor: ");
				String color = input.nextLine();
				System.out.println("Chassi: ");
				String chassis = input.nextLine();
				System.out.println("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.println("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.println("Tipo de Ônibus: ");
				String busType = input.nextLine();
				System.out.println("Quantidade de janelas de emergência: ");
				int emergencyWindows = input.nextInt();
				vehicles.add(new Bus(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, busType, emergencyWindows));
			}
			else if (option == 5) {
				int i = 0;
				for (Vehicle v: vehicles) {
					System.out.printf("Veículo %d- %s\n", i, v);
					i++;
				}
			}
		}
	}
	
	private static void Menu() {
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um Veículo");
		System.out.println("2 - Incluir uma Moto");
		System.out.println("3 - Incluir um Carro");
		System.out.println("4 - Incluir um Ônibus");
		System.out.println("5 - Listar veículos cadastrados");
		System.out.println("9 - Sair");
	}
}