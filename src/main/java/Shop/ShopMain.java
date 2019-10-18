package Shop;

import java.awt.*;
import java.util.Scanner;

public class ShopMain {
    public static void main(String... args) {
        Bill bill = new Bill();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of items :");
        int total = sc.nextInt();
        StringBuilder ans = new StringBuilder();

        while (total-- > 0) {
            System.out.println("Enter the item number ");
            String item = sc.next();
            System.out.println("Enter the quantity of item ");
            float quantity = sc.nextFloat();
            try {
                ans.append(bill.CalculateBill(item, quantity)).append("\n");
            } catch (Exception itemNotFound) {
                System.out.println("Item Not Found ");
                total++;
            }
        }
        System.out.println("Item Code\t  Item Name\t   Quantity  \t  Unit Price\tTax\t\tPrice");
        System.out.println(ans);
        bill.netAmount(bill.getAmount());

    }
}
