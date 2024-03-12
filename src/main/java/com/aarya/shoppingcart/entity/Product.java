import org.springframework.web.client.RestTemplate;

public class Product {
    // Existing code...

    public void fetchProductData() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://fakestoreapi.com/products/" + id;
        Product fetchedProduct = restTemplate.getForObject(apiUrl, Product.class);

        // Update the product properties with the fetched data
        if (fetchedProduct != null) {
            this.name = fetchedProduct.getName();
            this.availableQuantity = fetchedProduct.getAvailableQuantity();
            this.price = fetchedProduct.getPrice();
        }
    }


}
