package org.example;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your name ");
        String name = scan.nextLine();
        System.out.println("type your salary");
        double salary = scan.nextDouble();
        System.out.println("write your workhour");
        double workHours = scan.nextDouble();
        System.out.println("enter  your hireyear (just year)");
        int hireYear = scan.nextInt();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee);

    }
}

