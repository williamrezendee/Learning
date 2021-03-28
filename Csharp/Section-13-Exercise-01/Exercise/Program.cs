using System;
using Exercise.Entities;
using System.Globalization;
using System.IO;

namespace Exercise
{
    class Program
    {
        static void Main(string[] args)
        {
            string sourceFile = @"c:\temp\myfolder\lista.csv";
            try
            {
                string[] lines = File.ReadAllLines(sourceFile);

                string sourceFolder = Path.GetDirectoryName(sourceFile);
                string targetFolder = sourceFolder + @"\out";
                string targetFile = targetFolder + @"\summary.csv";

                Directory.CreateDirectory(targetFolder);

                using (StreamWriter sw = File.AppendText(targetFile))
                {
                    foreach (string line in lines)
                    {
                        string[] fields = line.Split(',');
                        string name = fields[0];
                        double price = double.Parse(fields[1], CultureInfo.InvariantCulture);
                        int quantity = int.Parse(fields[2]);

                        Product product = new Product(name, price, quantity);

                        sw.WriteLine(product.name + "," + product.TotalValue().ToString("F2", CultureInfo.InvariantCulture));
                    }
                }

            }
            catch (IOException e)
            {
                Console.WriteLine("An error occurred!");
                Console.WriteLine(e.Message);
            }

        }
    }
}
