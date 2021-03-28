using System;

namespace Exercise.Entities
{
    class Product
    {
        public string name { get; set; }
        public double price { get; set; }
        public int quantity { get; set; }

        public Product(string name, double price, int quantity)
        {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double TotalValue()
        {
            return price * quantity;
        }
    }
}
