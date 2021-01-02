using System;
using System.Globalization;
using System.Collections.Generic;
using Course.Entities;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Employee> employees = new List<Employee>();

            Console.Write("Enter the number of employees: ");
            int num = int.Parse(Console.ReadLine());

            for (int i = 1; i <= num; i++)
            {
                Console.WriteLine($"Employee #{i} data:");
                Console.Write("Outsourced (y/n)? ");
                char yN = char.Parse(Console.ReadLine());
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Hours: ");
                int hours = int.Parse(Console.ReadLine());
                Console.Write("Value per hour: ");
                double valuePerHour = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                if (yN == 'y' || yN == 'Y')
                {
                    Console.Write("Additional Charge: ");
                    double additionalCharge = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    employees.Add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
                }
                else if (yN == 'n' || yN == 'N')
                {
                    employees.Add(new Employee(name, hours, valuePerHour));
                }
                Console.WriteLine();
            }

            Console.WriteLine("PAYMENTS:");
            foreach (Employee item in employees)
            {
                Console.WriteLine(item.Name + " - $ " + item.Payment().ToString("F2", CultureInfo.InvariantCulture));
            }
        }
    }
}
