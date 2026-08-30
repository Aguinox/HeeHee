import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args)
    {
        while(true)
        
            {
                //Account
                Goga Yuser = new Goga (1234, 500.0);//Goga is in your other tab, "Yuser" is the name of the user, you can name this with anything you want. new Goga calls the public variables we have in goga specifically line 8, Since pin and balance has no value in it, you assign it here.

                JOptionPane.showMessageDialog(null, "Welcome to ATM");
                int PIN = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your pin: "));
                if (Yuser.ValidatePin(PIN))//Pin confirmation. Uses the public boolean in Goga specifically line 14
                {
                    JOptionPane.showMessageDialog(null, "Access Granted!");
                    JOptionPane.showMessageDialog(null, "Your Current balance is: $"+ Yuser.GetBalance());

                    String[] Sulid = {"Withdraw", "Deposit", "Exit"};//Assign your options for int decision
                    int decision = JOptionPane.showOptionDialog(null, "What are you going to do?", "ATM", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Sulid, Sulid[0]);
                    if (Sulid[decision].equals("Withdraw"))
                    {
                        Double amont = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would like to withdraw?"));//the amount of the user is willing to withdraw
                        Yuser.dispenseCash(amont);//
                        JOptionPane.showMessageDialog(null, "you have successfully withdrew: $"+amont);
                        JOptionPane.showMessageDialog(null, "Your current balance is: $"+ Yuser.GetBalance());
                        System.exit(0);
                    }
                    if (Sulid[decision].equals("Deposit"))
                    {
                        Double crazy = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would like to deposit"));
                        Yuser.Deposit(crazy);
                        JOptionPane.showMessageDialog(null, "you have deposited: $"+crazy);
                        JOptionPane.showMessageDialog(null, "Your new balance is: $"+ Yuser.GetBalance());
                        System.exit(0);
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "you entered the wrong PIN please try again");
                }
            }
    }



}
