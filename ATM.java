
import java.util.*;

public class SkeletonATM
{

    double reserve = 20000.0;
    double bank_account = 0;
    int pin = 0000;

    public SkeletonATM(double reserve, double bank_account, int pin)
		{
        super();
    }

    public SkeletonATM(double startAmount)
		{
			this.reserve = startAmount;
    }

		// validates the pin
		// returns true if the pin entered matches our stored pin
    public boolean login(int pin)
		{
				if (this.pin == pin)
					return true;
        return false;
    }

		// removes the amount requested from the account if it does not overdraw
		// returns reserve if successful, returns 0 if nothing was changed
    public double withdraw(double request)
		{
				if (reserve-request < 0)
				{
					return 0;
				}
				else
				{
					reserve = reserve-request;
				}
        return reserve;
    }

		// adds the deposit amount to the reserve
		// if the input is negative, no modifications made
    public void deposit(double input)
		{
			if (input > 0)
				reserve = reserve + input;
    }


    public static void main(String args[])
		{
			System.out.println("Hello, world!");
    }
}
