/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.multimedia_matija_losic;

/**
 *
 * @author qa
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student m = new Student();
        m.setFirstName("Matija");
        m.setLastName("Losic");
        m.setYearOfBirth(1571992);
        
        
        m.showInfo();
        
        Student b = new Student();
        b.setFirstName("Budimir");
        b.setLastName("Martinovic");
        b.setYearOfBirth(4111984);
        
        b.showInfo();
        
        Student n = new Student();
        n.setFirstName("Nenad");
        n.setLastName("Maksic");
        n.setYearOfBirth(5101997);
        
        n.showInfo();
        
    }
    
}
