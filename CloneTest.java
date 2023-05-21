import java.util.ArrayList;

class Product implements Cloneable {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen, as we implement Cloneable
            throw new AssertionError();
        }
    }
}

class ProductBasket implements Cloneable {
    ArrayList<Product> products;

    public ProductBasket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public ProductBasket clone() {
        try {
            ProductBasket clonedBasket = (ProductBasket) super.clone();
            clonedBasket.products = new ArrayList<>(products);
            return clonedBasket;
        } catch (CloneNotSupportedException e) {
             throw new AssertionError();
        }
    }
}

class CloneTest {
    public static void main(String[] args) {
        // Create the first basket
        ProductBasket basket1 = new ProductBasket();
        Product product1 = new Product("Apple", 1.0, 0.1);
        Product product2 = new Product("Banana", 0.5, 0.05);
        basket1.addProduct(product1);
        basket1.addProduct(product2);

        // Clone the first basket
        ProductBasket basket2 = basket1.clone();

        // Modify the second basket
        basket2.removeProduct(product2);

        // Verify that the modifications in the second basket do not affect the first basket
        System.out.println("First Basket Products:");
        for (Product product : basket1.getProducts()) {
            System.out.println(product.getName());
        }

        System.out.println("Second Basket Products:");
        for (Product product : basket2.getProducts()) {
            System.out.println(product.getName());
        }
    }
}
