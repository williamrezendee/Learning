using System;
using System.Collections.Generic;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            HashSet<int> set = new HashSet<int>();

            Console.Write("How many students for course A? ");
            int studentsQuantity = int.Parse(Console.ReadLine());
            AddStudentsInGroup(set, studentsQuantity);

            Console.Write("How many students for course B? ");
            studentsQuantity = int.Parse(Console.ReadLine());
            AddStudentsInGroup(set, studentsQuantity);

            Console.Write("How many students for course C? ");
            studentsQuantity = int.Parse(Console.ReadLine());
            AddStudentsInGroup(set, studentsQuantity);

            Console.WriteLine("Total students: "+set.Count);
        }

        static void AddStudentsInGroup(HashSet<int> set, int studentsQuantity)
        {
            for (int i = 0; i < studentsQuantity; i++)
            {
                int studentCode = int.Parse(Console.ReadLine());
                set.Add(studentCode);
            }
        } 
    }
}
