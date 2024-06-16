/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.zaliczenie.services;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import pl.lodz.uni.eksoc.interfaces.ReadCSVFilesInterface;
import pl.lodz.uni.eksoc.zaliczeniemodels.*;
import pl.lodz.uni.eksoc.zaliczeniemodels.Zadanie.Typ;

/**
 *
 * @author Admin
 */
public class ReadCSVFiles implements ReadCSVFilesInterface {
    @Override
    public <T> List<T> readFile (String filename) throws IOException {
        List list = new ArrayList();
        
        File file = new File(filename);

        if (file.canRead()) {
            
            try (
                    FileReader reader = new FileReader(file, Charset.forName("UTF-8")); 
                    BufferedReader buffReader = new BufferedReader(reader)) {

                String line; 
                
                
                
                while((line = buffReader.readLine()) != null)
                {
                    String[] splitResult = line.split(";");
                    
                    int id = Integer.parseInt(splitResult[0]);
                    String name = splitResult[1];
                    Typ typ = Typ.valueOf(splitResult[2]);
                    int priority = Integer.parseInt(splitResult[3]);
                    LocalDate dateOfCreation = LocalDate.parse(splitResult[4]);
                            
                    Zadanie zadanie = new Zadanie(id, name, typ, priority, dateOfCreation, false);
                    list.add(zadanie);
                }
            } 
                catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        
        return list;
    }
}
