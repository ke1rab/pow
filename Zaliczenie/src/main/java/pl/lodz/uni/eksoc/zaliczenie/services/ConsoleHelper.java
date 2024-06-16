/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.zaliczenie.services;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ConsoleHelper {
    public void WelcomeMessage() throws IOException {
        
        var readCsv = new ReadCSVFiles();
        var scanner = new Scanner(System.in);

        
        while(true) 
        {
            System.out.println("Witaj w aplikacji. Podaj numer");
            int input = scanner.nextInt();
            switch(input)
            {
                case 1:
                    System.out.println("Read csv file");
                    var result = readCsv.readFile("dane.csv");
                    for (var test : result) {
                        System.out.println(test);
                    }
                    break;
                    
                case 2:
                    
                    break;
                    
                default:
                    
                    return;
            }
        }
        
    }
}
