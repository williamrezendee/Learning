namespace Course.Entities
{
    class Individual : TaxPayer
    {
        public double HealthExpenditures { get; set; }

        public Individual(double healthExp, string name, double anualIncome) : base(name, anualIncome)
        {
            HealthExpenditures = healthExp;
        }

        public override double Tax()
        {
            double tax = 0.0;
            if (AnualIncome < 20000.0)
            {
                tax = AnualIncome * 0.15;
            }
            else
            {
                tax = AnualIncome * 0.25;
            }
            if (HealthExpenditures > 0)
            {
                tax -= HealthExpenditures * 0.5;
            }

            return tax;
        }
    }
}
