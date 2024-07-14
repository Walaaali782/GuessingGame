/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamejava;

/**
 *
 * @author MO
 */
import java.util.Scanner;
import java.util.Random;
public class Gamejava {

    public static void main(String[] args) {
        // إنشاء كائن Scanner لأخذ المدخلات من المستخدم
        Scanner scanner = new Scanner(System.in);
        // إنشاء كائن Random لتوليد الأرقام العشوائية
        Random random = new Random();
        
        // اختيار رقم عشوائي بين 1 و 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean win = false;
        
        // رسالة ترحيب
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        // حلقة اللعبة الرئيسية
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("The number is lower. Try again.");
            } else {
                win = true;
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }
        
        // إغلاق Scanner
        scanner.close();
    }    }

