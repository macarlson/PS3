
public class Account {

	public static void main(String[] args) {

		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;

		id defAccount = new id();
		{

		}

		public Account(int IDnumber, double money) {
			id = IDnumber;
			balance = money;

		}
		
		public int getID()
		{
			return this.id;
		}
		
		public void setID(int id)
		{
			this.id = id;
		}
		
		public double getBalance()
		{
			return this.balance;
		}
		
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		
		public double getInterestRate()
		{
			return this.annualInterestRate;
		}
		
		public void setInterestRate(double annualInterestRate)
		{
			this.annualInterestRate = annualInterestRate;
		}
		
		public Date getDate()
		{
			return this.dateCreated;
		}
		
		public int getMonthlyInterestRate()
		{
			double monthly = annualInterestRate/12;
			return monthly;
		}

	}

}
