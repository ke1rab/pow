/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.interfaces;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ReadCSVFilesInterface {
    public <T> List<T> readFile (String filename) throws IOException;
}
