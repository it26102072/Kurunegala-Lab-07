import java.util.Scanner;

public class IT26102072Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
			
			System.out.println("customer "+ i );
			
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C for cash , O for other): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay;

            switch (mode) {
                case 'C':
                case 'c':
                    discount = bill * 0.05;
                    amountToPay = bill - discount;

                    System.out.println("Discount is : " + discount);
                    System.out.println("Amount to be paid : " + amountToPay);
                    break;

                case 'O':
                case 'o':
                    amountToPay = bill;

                    System.out.println("NO discount applicable");
                    System.out.println("Amount to be paid : " + amountToPay);
                    break;

                default:
                    System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}