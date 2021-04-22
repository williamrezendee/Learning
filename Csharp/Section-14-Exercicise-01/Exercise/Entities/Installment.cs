using System;
using System.Globalization;

namespace Exercise.Entities
{
    class Installment
    {
        public double Amount { get; private set; }
        public DateTime DueDate { get; private set; }

        public Installment(DateTime dueDate, double amount)
        {
            Amount = amount;
            DueDate = dueDate;
        }

        public override string ToString()
        {
            return DueDate + " - " + Amount.ToString("F2", CultureInfo.InvariantCulture);
        }
    }
}
