package app;

public class Main {

    static int productNumber;
    static String productType;
    static double salesQuantity;
    static double productPrice;
    static double totalSalesAmount;
    static double tradingDaysCount;
    static double avgDailySalesAmount;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        productNumber = 1;
        productType = "smartphone";
        salesQuantity = 59;
        productPrice = 205.99;
        tradingDaysCount = 5;
        totalSalesAmount = salesQuantity * productPrice;
        avgDailySalesAmount = totalSalesAmount / tradingDaysCount;

        System.out.printf("%n Product No %s: %s," +
                        "%n total sales for %.0f days is %s %.2f," +
                        "%n sales by day is %s %.2f.",
                productNumber, productType, tradingDaysCount, CURRENCY, totalSalesAmount, CURRENCY, avgDailySalesAmount);

        productNumber = 2;
        productType = "laptop";
        salesQuantity = 5;
        productPrice = 2097.37;
        tradingDaysCount = 7;
        totalSalesAmount = salesQuantity * productPrice;
        avgDailySalesAmount = totalSalesAmount / tradingDaysCount;

        System.out.printf("%n Product No %s: %s," +
                        "%n total sales for %.0f days is %s %.2f," +
                        "%n sales by day is %s %.2f.",
                productNumber, productType, tradingDaysCount, CURRENCY, totalSalesAmount, CURRENCY, avgDailySalesAmount);

    }
}
