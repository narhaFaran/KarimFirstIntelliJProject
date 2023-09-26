import java.text.DecimalFormat;
import java.util.Scanner;
public class BillCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat money = new DecimalFormat("0.00"); //help from Henk; format method for rounding
        System.out.println("Enter bill:");
        double bill = scanner.nextDouble();
        System.out.println("Enter tip percentage:");
        double tipPercent = scanner.nextDouble()/100;
        System.out.println("Enter number of people:");
        int numPeople = scanner.nextInt();

        //calculations
        double totalTip = bill*tipPercent;
        double totalBill = bill + totalTip;
        double tipPer = totalTip/numPeople;
        double totalPer = totalBill/numPeople;

        //bunch of print statements
        System.out.println();
        System.out.println("Number of people: " + numPeople);
        System.out.println("Bill: $" + money.format(bill));
        System.out.println("Tip Percent: %" + tipPercent*100);
        System.out.println("Tip: $" + money.format(totalTip));
        System.out.println("Total: $" + money.format(totalBill));
        System.out.println("Tip Per Person: $" + money.format(tipPer));
        System.out.println("Total Per Person: $" + money.format(totalPer));

    }
}
