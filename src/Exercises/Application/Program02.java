package Exercises.Application;

import Exercises.entities.exercise02.ImportedProduct;
import Exercises.entities.exercise02.Product;
import Exercises.entities.exercise02.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) throws ParseException {

        List <Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufcatureDate = sdf1.parse(sc.next());
                String formattedDate = sdf1.format(manufcatureDate);
                Product product = new UsedProduct(name, price, formattedDate);
                list.add(product);

            } else if (type == 'i') {
                System.out.println("Customs fee: ");
                double fee = sc.nextDouble();
                Product product = new ImportedProduct(name,price,fee);
                list.add(product);
            }else{
                Product product = new Product(name,price);
                list.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.toString());
        }

        sc.close();
    }

}
