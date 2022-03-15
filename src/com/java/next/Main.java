package com.java.next;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayDemo= new ArrayList<>();
        arrayDemo.ensureCapacity(5);
        ArrayList<Integer> arrayDemo1= new ArrayList<>();

        System.out.println("""
                Enter a value
                Type '0' to exit
                """);
        Scanner scanner= new Scanner(System.in);
      for (int i=0; i<10;i++){
        int data= scanner.nextInt();
        if (data==0){
              break;
          }
          System.out.println("Enter");
          arrayDemo.add(data);

        }
        System.out.println( "Original ArrayList:" + arrayDemo);
        System.out.println("=====================================");

        arrayDemo.removeIf(e -> e==5);
        System.out.println("ArrayList after 'removeIf:" +arrayDemo);
        System.out.println("=====================================");

        System.out.println("Is ArrayListDemo Empty:" + arrayDemo.isEmpty());
        System.out.println("Is ArrayListDemo1 Empty:" + arrayDemo1.isEmpty());
        arrayDemo.removeAll(arrayDemo);


    }
}
