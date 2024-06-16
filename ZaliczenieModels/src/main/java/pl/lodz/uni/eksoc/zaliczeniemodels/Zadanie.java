/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.lodz.uni.eksoc.zaliczeniemodels;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Zadanie
{
    public Zadanie(int id, String name, Typ typ, int priority, LocalDate dateOfCreation, boolean isDone) {
        setId(id);
        setName(name);
        setPriority(priority);
        setDateOfCreation(dateOfCreation);
        setIsDone(isDone);
        this.typ = typ;
    }
    
    private int id;
    private String name;
    private int priority;
    private LocalDate dateOfCreation;
    private boolean isDone;
    public Typ typ;
    
    public enum Typ {
        prywatne,
        sluzbowe
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public boolean isIsDone() {
        return isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    
    
    
}
