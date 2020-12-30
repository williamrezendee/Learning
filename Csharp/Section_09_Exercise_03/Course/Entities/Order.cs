using System;
using System.Text;
using System.Collections.Generic;
using Course.Entities.Enums;

namespace Course.Entities
{
    class Order
    {
        public DateTime Moment { get; set; }
        public OrderStatus Status { get; set; }
        public Client Client { get; set; }
        public List<OrderItem> OrderItems { get; set; } = new List<OrderItem>();

        public Order()
        {
        }

        public Order(DateTime moment, OrderStatus status, Client client)
        {
            Moment = moment;
            Status = status;
            Client = client;
        }

        public void AddItem(OrderItem item)
        {
            OrderItems.Add(item);
        }

        public void RemoveItem(OrderItem item)
        {
            OrderItems.Add(item);
        }

        public double Total()
        {
            double sum = 0.0;
            foreach (OrderItem item in OrderItems)
            {
                sum += item.SubTotal();
            }

            return sum;
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.AppendLine("Order moment: " + Moment);
            sb.AppendLine("Order status: " + Status);
            sb.AppendLine("Client: " + Client.Name + " (" + Client.BirthDate + ") - " + Client.Email);
            sb.AppendLine("Order items: ");
            foreach (OrderItem item in OrderItems)
            {
                sb.AppendLine(item.Product.Name + ", $" + item.Price + ", Quantity: " + item.Quantity + ", Subtotal: $" + item.SubTotal());
            }
            sb.AppendLine("Total price : $" + Total());

            return sb.ToString();
        }
    }
}
