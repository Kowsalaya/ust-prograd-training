import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Converter converter = new Converter();
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********Currency Converter************");
        System.out.println("Currency converting from : \t1.USD\t2.ASN\t3.EURO\t4.GBP\t5.INR");
        String fromCode = scanner.nextLine();
        System.out.println("Currency converting to : \t1.USD\t2.ASN\t3.EURO\t4.GBP\t5.INR");
        String toCode = scanner.nextLine();
        switch (fromCode) {
            case "USD" -> {
                System.out.println("Enter the amount to be converted");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount must be greater than zero");
                } else if (toCode.equals("INR")) {
                    System.out.printf("%.2f" ,converter.usdToINR(amount));
                } else if (toCode.equals("ASN")) {
                    System.out.printf("%.2f" ,converter.usdToASN(amount));
                } else if (toCode.equals("EURO")) {
                    System.out.printf("%.2f" ,converter.usdToEURO(amount));
                } else if (toCode.equals("GBP")) {
                    System.out.printf("%.2f" , converter.usdToGBP(amount));
                } else {
                    throw new IllegalArgumentException("Enter the valid currency");
                }
            }
            case "ASN" -> {
                System.out.println("Enter the amount to be converted");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount must be greater than zero");
                } else if (toCode.equals("INR")) {
                    System.out.printf("%.2f" ,converter.asnToINR(amount));
                } else if (toCode.equals("USD")) {
                    System.out.printf("%.2f" , converter.asnToUSD(amount));
                } else if (toCode.equals("EURO")) {
                    System.out.printf("%.2f" , converter.asnToEURO(amount));
                } else if (toCode.equals("GBP")) {
                    System.out.printf("%.2f" , converter.asnToGBP(amount));
                } else {
                    throw new IllegalArgumentException("Enter the valid currency");
                }
            }
            case "EURO" -> {
                System.out.println("Enter the amount to be converted");
                amount = scanner.nextDouble();
                if (amount < 0) {
                    throw new IllegalArgumentException("Amount must be greater than zero");
                } else if (toCode.equals("INR")) {
                    System.out.printf("%.2f" , converter.euroToINR(amount));
                } else if (toCode.equals("ASN")) {
                    System.out.printf("%.2f" , converter.euroToASN(amount));
                } else if (toCode.equals("USD")) {
                    System.out.printf("%.2f" , converter.euroToUSD(amount));
                } else if (toCode.equals("GBP")) {
                    System.out.printf("%.2f" , converter.euroToGBP(amount));
                } else {
                    throw new IllegalArgumentException("Enter the valid currency");
                }
            }
            case "GBP" -> {
                System.out.println("Enter the amount to be converted");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount must be greater than zero");
                } else if (toCode.equals("INR")) {
                    System.out.printf("%.2f" , converter.gbpToINR(amount));
                } else if (toCode.equals("ASN")) {
                    System.out.printf("%.2f" , converter.gbpToASN(amount));
                } else if (toCode.equals("EURO")) {
                    System.out.printf("%.2f" , converter.gbpToEURO(amount));
                } else if (toCode.equals("GBP")) {
                    System.out.printf("%.2f" , converter.gbpToUSD(amount));
                } else {
                    throw new IllegalArgumentException("Enter the valid currency");
                }
            }
            case "INR" -> {
                System.out.println("Enter the amount to be converted");
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    throw new IllegalArgumentException("Amount must be greater than zero");
                } else if (toCode.equals("USD")) {
                    System.out.printf("%.2f" , converter.inrToUSD(amount));
                } else if (toCode.equals("ASN")) {
                    System.out.printf("%.2f" , converter.inrToASN(amount));
                } else if (toCode.equals("EURO")) {
                    System.out.printf("%.2f" , converter.inrToEURO(amount));
                } else if (toCode.equals("GBP")) {
                    System.out.printf("%.2f" , converter.inrToGBP(amount));
                } else {
                    throw new IllegalArgumentException("Enter the valid currency");
                }
            }
            default -> throw new IllegalArgumentException("Enter the valid currency");
        }
    }
}

