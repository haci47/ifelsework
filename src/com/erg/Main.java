package com.erg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Not Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int not= scanner.nextInt();

        if(not < 50){
            System.out.println("Gecme Notu 50 KALDINIZ");
        }else{
            System.out.println("Gecme Notu 50 GECDINIZ");
        }
    }
}
