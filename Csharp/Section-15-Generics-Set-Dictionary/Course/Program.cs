﻿using System;
using System.Collections.Generic;
using Course.Services;
using Course.Entities;
using System.Globalization;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Product> list = new List<Product>();

            Console.Write("Enter N: ");
            int n = int.Parse(Console.ReadLine());
            for (int i=0; i<n; i++) {
                string[] vect = Console.ReadLine().Split(',');
                string name = vect[0];
                float price = float.Parse(vect[1], CultureInfo.InvariantCulture);
                list.Add(new Product(name, price));
            }

            CalculationService calculationService = new CalculationService();

            Product max = calculationService.Max(list);

            Console.Write("Max: ");
            Console.WriteLine(max);
        }
    }
}
