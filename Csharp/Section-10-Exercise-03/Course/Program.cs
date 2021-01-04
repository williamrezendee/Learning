using System;
using System.Globalization;
using System.Collections.Generic;
using Course.Entities;
using Course.Entities.Enums;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the number of shapes: ");
            int num = int.Parse(Console.ReadLine());
            List<Shape> list = new List<Shape>();
            for (int i = 1; i <= num; i++)
            {
                Console.WriteLine($"Shape #{i} data:");
                Console.Write("Rectangle or Circle (R/C)? ");
                char ch = char.Parse(Console.ReadLine().Trim().ToUpper());
                Console.Write("Color (Black/Blue/Red): ");
                string str = Console.ReadLine().Trim();
                Color color = Enum.Parse<Color>(char.ToUpper(str[0]) + str.Substring(1));
                if (ch == 'R')
                {
                    Console.Write("Width: ");
                    double width = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    Console.Write("height: ");
                    double height = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    list.Add(new Rectangle(width, height, color));
                }
                else if (ch == 'C')
                {
                    Console.Write("Radius: ");
                    double radius = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
                    list.Add(new Circle(radius, color));
                }
            }

            Console.WriteLine();
            Console.WriteLine("SHAPE AREAS:");
            foreach (Shape sp in list)
            {
                Console.WriteLine(sp.Area().ToString("F2", CultureInfo.InvariantCulture));
            }
        }
    }
}
