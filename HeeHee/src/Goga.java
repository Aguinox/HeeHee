import javax.swing.JOptionPane;
public class Goga
{
    //Declare the balance and the pin
    private double balance;
    private final int pin;
    //public to bridge between to the private and reassign balance to Initialbalance
    public Goga (int pin, double Initialbalance)
    {
        this.pin = pin;
        balance = Initialbalance;
    }
    //public boolean to Validate pin so that when the user enters the pin it will either come out as true or false
    public boolean ValidatePin (int enteredpin)
        {
            return this.pin == enteredpin;
        }
        public double GetBalance()
        {
            return balance;
        }

        public boolean dispenseCash(double amount)//dispense cash for withdraw
        {
            if (amount <= balance)
            {
                balance -= amount;
                return true;
            }
            else;
            {
                JOptionPane.showMessageDialog(null, "Insufficient funds!");
                System.exit(0);
                return false;
            }
        }
        public boolean Deposit(double amount)// This function is to deposit money
        {
            if (amount >= balance)
            {
                balance += amount;
                return true;
            }
            else if(amount <= balance)
            {
                balance += amount;
                return true;
            }
            else
            {
                System.exit(0);
                return false;
            }
        }

}
