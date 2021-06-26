using System;

namespace ProcessFile
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dt = new DateTime(2021, 06, 09, 8, 10, 45);
            Console.WriteLine(dt.ElapsedTime());

            string s1 = "Good morning dear students!";
            Console.WriteLine(s1.CutString(10));
        }
    }
}
