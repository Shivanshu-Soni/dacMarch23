/*3. Book Inventory Management System
Core Java Assignment 2
Designed by Sandeep Kulange
You are required to write a Java program to implement a Book class that can be 
used to manage a book inventory system. 
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructors, 
b. Getter & setter methods
c. Business Logic methods
I. increaseQuantity(int quantity ): A method to increase the quantity of 
the book in the inventory by the specified amount.
II. decreaseQuantity(int quantity): A method to decrease the quantity of 
the book in the inventory by the specified amount.
III. getInventoryValue(): A method to calculate the total value of the 
inventory of the book, which is the product of the price and the 
quantity of the book./* */

import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    Book() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getYear() {
        return year;
    }

    void increaseQuantity(int quantity) {

        // this.quantity = this.quantity+quantity;
        // System.out.println("increased books :"+(this.quantity+quantity));
        this.quantity += quantity;

    }

    void decreaseQuantity(int quantity) {
        // this.quantity = this.quantity-quantity;
        // System.out.println("decreased books :"+(this.quantity-quantity));
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough quantity is avialable.");
        }
    }

    double getInventoryValue() {

        return (quantity * price);

    }

}

class Q_3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter title");
        b1.setTitle(sc.nextLine());
        System.out.println("enter author");
        b1.setAuthor(sc.nextLine());
        System.out.println("enter publisher");
        b1.setPublisher(sc.nextLine());
        System.out.println("enter isbn");
        b1.setIsbn(sc.nextLine());
        System.out.println("enter year");
        b1.setYear(sc.nextInt());
        System.out.println("enter price");
        b1.setPrice(sc.nextInt());
        System.out.println("enter quantity");
        b1.setQuantity(sc.nextInt());

        System.out.println("enter the num of quantities to increase");
        b1.increaseQuantity(sc.nextInt());
        
        System.out.println("enter quantity to decrease");
        b1.decreaseQuantity(sc.nextInt());
        
        System.out.println(b1.getQuantity());

        double b = b1.getInventoryValue();
        System.out.println(b);

    }
}