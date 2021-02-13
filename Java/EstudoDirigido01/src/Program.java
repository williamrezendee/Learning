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
			option = Menu();
			if (option == 1) {
				System.out.print("Placa: ");
				String plate = input.next();
				System.out.print("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.print("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.print("Cor: ");
				String color = input.next();
				System.out.print("Chassi: ");
				String chassis = input.next();
				System.out.print("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.print("Valor da diária: ");
				double valueDaily = input.nextDouble();
				vehicles.add(new Vehicle(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily));
				System.out.println(" ");
			}
			if (option == 2) {
				System.out.print("Placa: ");
				String plate = input.next();
				System.out.print("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.print("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.print("Cor: ");
				String color = input.next();
				System.out.print("Chassi: ");
				String chassis = input.next();
				System.out.print("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.print("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.print("Tipo de moto: ");
				String motorcycleType = input.next();
				System.out.print("Tipo de corrente: ");
				String chainType = input.next();
				vehicles.add(new Motorcycle(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, motorcycleType, chainType));
				System.out.println(" ");
			}
			if (option == 3) {
				System.out.print("Placa: ");
				String plate = input.next();
				System.out.print("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.print("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.print("Cor: ");
				String color = input.next();
				System.out.print("Chassi: ");
				String chassis = input.next();
				System.out.print("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.print("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.print("Tipo de carro: ");
				String carType = input.next();
				System.out.print("Capacidade do porta-malas: ");
				int trunk = input.nextInt();
				vehicles.add(new Car(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, carType, trunk));
				System.out.println(" ");
			}
			if (option == 4) {
				System.out.print("Placa: ");
				String plate = input.next();
				System.out.print("Ano de fabricação: ");
				int fabricationYear = input.nextInt();
				System.out.print("Ano do modelo: ");
				int modelYear = input.nextInt();
				System.out.print("Cor: ");
				String color = input.next();
				System.out.print("Chassi: ");
				String chassis = input.next();
				System.out.print("Quilometragem: ");
				int mileage = input.nextInt();
				System.out.print("Valor da diária: ");
				double valueDaily = input.nextDouble();
				System.out.print("Tipo de Ônibus: ");
				String busType = input.next();
				System.out.print("Quantidade de janelas de emergência: ");
				int emergencyWindows = input.nextInt();
				vehicles.add(new Bus(plate, fabricationYear, modelYear, color, chassis, mileage, valueDaily, busType, emergencyWindows));
				System.out.println(" ");
			}
			if (option == 5) {
				int i = 0;
				for (Vehicle v: vehicles) {
					System.out.print("placa: "
							+ v.getPlate()
							+ "/ Ano fabricação: "
							+ v.getFabricationYear()
							+ "/ Ano modelo: "
							+ v.getModelYear()
							+ "/ Cor: "
							+ v.getColor()
							+ "/ Chassi: "
							+ v.getChassis()
							+ "/ Quilometragem: "
							+ v.getMileage()
							+ "/ Diária: "
							+ v.getValueDaily());
					if (v instanceof Motorcycle) {
						Motorcycle m = (Motorcycle)v;
						System.out.println("/ Tipo Moto: "
								+ m.getMotorcycleType()
								+ "/ Tipo Corrente: "
								+ m.getChainType());
					}
					if (v instanceof Car) {
						Car c = (Car)v;
						System.out.println("/ Tipo Carro: "
								+ c.getCarType()
								+ "/ Tamanho Mala: "
								+ c.getTrunk());
					}
					if (v instanceof Bus) {
						Bus b = (Bus)v;
						System.out.println("/ Tipo Ônibus: "
								+ b.getBusType()
								+ "/ Quantidade de Janelas: "
								+ b.getEmergencyWindows());
					}
					System.out.printf("\n");
				}
			}
			System.out.println("");
		}
	}	
	private static int Menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a sua opção:");
		System.out.println("1 - Incluir um Veículo");
		System.out.println("2 - Incluir uma Moto");
		System.out.println("3 - Incluir um Carro");
		System.out.println("4 - Incluir um Ônibus");
		System.out.println("5 - Listar veículos cadastrados");
		System.out.println("9 - Sair");
		System.out.println("Opção: ");
		int option = input.nextInt();
		return option;
	}
}