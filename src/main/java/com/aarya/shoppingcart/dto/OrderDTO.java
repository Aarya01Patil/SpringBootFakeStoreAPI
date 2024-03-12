package com.aarya.shoppingcart.dto;

import java.util.List;

import com.aarya.shoppingcart.entity.ShoppingCart;

public class OrderDTO {

    private String orderDescription;
    private List<ShoppingCart> cartItems;
    private String customerEmail;
    private String customerName;

    public OrderDTO() {
    }

    public OrderDTO(String orderDescription, List<ShoppingCart> cartItems, String customerEmail, String customerName) {
        this.orderDescription = orderDescription;
        this.cartItems = cartItems;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public List<ShoppingCart> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<ShoppingCart> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderDescription='" + orderDescription + '\'' +
                ", cartItems=" + cartItems +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
    
    
    public void addToCart(int productId, int quantity) {
        // TODO: Implement the logic to add a product to the cart using the Fake Store API
        

    }
    
    public void removeFromCart(int productId) {
        // TODO: Implement the logic to remove a product from the cart using the Fake Store API
    }
    
    public void updateCartItemQuantity(int productId, int quantity) {
        // TODO: Implement the logic to update the quantity of a product in the cart using the Fake Store API
    }
    
    public List<ShoppingCart> getCartItemsFromAPI() {
        // TODO: Implement the logic to retrieve the cart items from the Fake Store API
        return null;
    }
    
    public void clearCart() {
        // TODO: Implement the logic to clear the cart using the Fake Store API
    }
    
}
