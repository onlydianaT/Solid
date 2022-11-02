import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products products = new Products();
        HashMap<String, Integer> productInShop = products.productBasket();
        Basket basket = new Basket(productInShop.size());
        products.printProductBasket(productInShop);

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        long sum = basket.sum(products.productBasket());
        System.out.println("ИТОГО: " + sum);
    }
}