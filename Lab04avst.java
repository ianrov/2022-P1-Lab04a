// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;

        double numMonths  = numYears * 12;
        double monthlyRate = ((annualRate/100)) / 12;

        double monthlyPayTop = monthlyRate * (Math.pow ((1+monthlyRate),numMonths));
        double monthlyPayBottom = (Math.pow ((1+monthlyRate),numMonths)) -1;
        double monthPay = (monthlyPayTop / monthlyPayBottom) * principal;
        double monthPayRound = (Math.ceil(monthPay * 100)) / 100;

        double totalPay = monthPayRound * numMonths;
        double totalIntrest = totalPay - principal;


        System.out.println("Principal:         $"+principal);
        System.out.println("Annual Rate:       "+annualRate+"%");
        System.out.println("Number Of Years:   "+numYears);
        System.out.println("Monthly Payment:   $"+monthPayRound);
        System.out.println("Total Payments     $"+totalPay);
        System.out.println("Total Intrest      $"+totalIntrest);











        System.out.println();
    }
}

