package tut_5_week_7.Question_3_4_5_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question_3_4_5_6 {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();
        HashMap<Book, Integer> hmap = new HashMap<Book, Integer>();
        while(true){
            System.out.print("adding book (press a to add or q to exit) : ");
            String input = new Scanner(System.in).next();
            if(input.equals("q")){
                break;
            }
            System.out.print("Enter title : ");
            String title = new Scanner(System.in).next();
            System.out.print("Enter price : ");
            double price = new Scanner(System.in).nextDouble();
            System.out.print("Enter year : ");
            int year = new Scanner(System.in).nextInt();
            System.out.print("Enter author name : ");
            String author = new Scanner(System.in).next();
            arrayList.add(new Book(title,price,year,author));
        }

        for (int i=0; i<arrayList.size(); i++){
            System.out.print ("Please, enter the number of the shelf where is placed the book" + arrayList.get(i).getTitle() + " : ");
            int numShelf = new Scanner(System.in).nextInt();
            /*Adding elements to HashMap*/
            hmap.put(arrayList.get(i), numShelf);
        }
    }
}
