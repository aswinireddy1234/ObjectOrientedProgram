package com.objectorientedprogram;
import java.util.ArrayList;
import java.util.Scanner;

    public class StockAccount {

        public static void main(String[] args) {
            int flag = 0;
            Scanner scanner = new Scanner(System.in);
            StockPortfo portfo = new StockPortfo();
            while (flag == 0) {
                System.out.println("Enter the details of Stock ");
                StockPortfo.Stock stockport = new StockPortfo.Stock();
                System.out.println("Enter Company Name:");
                stockport.company = scanner.nextLine();
                System.out.println("Enter number of share:");
                stockport.NoOfShare = scanner.nextInt();
                System.out.println("Enter Price of share:");
                stockport.price = scanner.nextDouble();

                portfo.portf.add(stockport);
                System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
                flag = scanner.nextInt();
            }
            for (int i = 0; i < portfo.portf.size(); i++) {
                System.out.println(portfo.totalValue());

            }
        }
    }

    class StockPortfo {
        ArrayList<Stock> portf = new ArrayList<>();
        double totalValue = 0;

        static class Stock {
            int NoOfShare;
            String company;
            double price;
        }
        public double totalValue() {
            for (Stock stock : portf) {
                totalValue += stock.price * stock.NoOfShare;
            }
            return totalValue;
        }
}

