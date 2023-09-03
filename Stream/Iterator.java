package Stream;

import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        var itWords = words.iterator();
        while (itWords.hasNext()) {
            System.out.println(itWords.next());
        }

        final List<Product> products = List.of(
                new Product("Laptop", 1000.0),
                new Product("Keyboard", 20.0),
                new Product("Keyboard", 50.0));

        // Obtendo um iterador dos produtos
        var iterator = products.iterator();
        List<String> nameOfProducts = List.of();
        iterator.forEachRemaining(product -> nameOfProducts.add(product.getName()));

        double totalPrice = 0.0;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            totalPrice += product.getPrice();
        }

        System.out.println("Preço total dos produtos: $" + totalPrice);

        List<String> fruitList = List.of("Apple", "Pineapple", "Orange", "Banana", "Mango");
        var fruitIterator = fruitList.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            fruitList.remove(fruit);
        }

        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            if (fruit.startsWith("A")) {
                fruitIterator.remove();
            }
        }
    }

    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }
}
