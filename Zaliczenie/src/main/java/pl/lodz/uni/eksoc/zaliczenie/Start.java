/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pl.lodz.uni.eksoc.zaliczenie;

import java.io.IOException;
import pl.lodz.uni.eksoc.zaliczenie.services.ConsoleHelper;



/**
 *
 * @author Admin
 */
public class Start {

    public static void main(String[] args) throws IOException {
        
        var consoleHelper = new ConsoleHelper();
        
        consoleHelper.WelcomeMessage();
    }
}
