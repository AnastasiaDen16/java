import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "lemon", 5, 3.5);
        product.printProduct();

//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        String card;
//        String products[];
//        String cardRegex = "card-\\d*";
//        String productRegex = "\\d-\\d";
//        Pattern cardPattern = Pattern.compile(cardRegex);
//        Pattern productPattern = Pattern.compile(productRegex);
//        Matcher cardMatcher = cardPattern.matcher(string);
//        Matcher productMatcher = productPattern.matcher(string);
//
//        while (cardMatcher.find()) {
//            card = cardMatcher.group();
//            System.out.println(card);
//        }
//
//        while (productMatcher.find()) {
//            products = productMatcher.group().split("-");
//            System.out.println("{id: " + products[0] + ", quantity:" + products[1] + "}");
//        }

    }
}
