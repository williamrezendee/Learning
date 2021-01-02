using System;
using System.Globalization;
using Course.Entities;
using System.Collections.Generic;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the number of products: ");
            int num = int.Parse(Console.ReadLine());
            List<Product> list = new List<Product>();

            for (int i = 1; i <= num; i++)
            {
                Console.WriteLine($"Product #{i} data:");
                Console.Write("Common, used or imported (c/u/i)? ");
                char ch = char.Parse(Console.ReadLine().Trim().ToUpper());
                Console.Write("Name: ");
                string name = Console.ReadLine();
                Console.Write("Price: ");
                double price = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                if (ch == 'I')
                {
                    Console.Write("Customs fee: ");
                    double fee = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    list.Add(new ImportedProduct(name, price, fee));
                }
                else if (ch == 'U')
                {
                    Console.Write("Manufacture date (DD/MM/YYYY): ");
                    DateTime dt = DateTime.Parse(Console.ReadLine());
                    list.Add(new UsedProduct(name, price, dt));
                }
                else
                {
                    list.Add(new Product(name, price));
                }   
            }

            Console.WriteLine();
            Console.WriteLine("PRICE TAGS:");
            foreach (Product pr in list)
            {
                Console.WriteLine(pr.PriceTag());
            }
        }
    }
}
