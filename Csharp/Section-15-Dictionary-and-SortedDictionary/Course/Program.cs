using System;
using System.Collections.Generic;

namespace Course
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, string> cookies = new Dictionary<string, string>();
            cookies["user"] = "Maria";
            cookies["email"] = "maria@email.com";
            cookies["phone"] = "991165483";
            cookies["phone"] = "79991165483";

            Console.WriteLine(cookies["email"]);
            Console.WriteLine(cookies["phone"]);

            cookies.Remove("email");
            if (cookies.ContainsKey("email"))
            {
                Console.WriteLine(cookies["email"]);
            }
            else
            {
                Console.WriteLine("The key 'email' was not found!");
            }

            Console.WriteLine("Size:" + cookies.Count);

            Console.WriteLine("All cookies: ");
            foreach (KeyValuePair<string, string> item in cookies)
            {
                Console.WriteLine(item.Key + " : " + item.Value);
            }

            
        }
    }
}
