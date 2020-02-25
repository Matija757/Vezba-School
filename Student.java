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
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    


public Student() {
    this.firstName = " ";
    this.lastName = " ";
    this.yearOfBirth = 0;
}

public String getFirstName() {
    return this.firstName;
}

public void setFirstName(String customFirstName) {
    this.firstName = customFirstName;
}

public String getLastName() {
    return this.lastName;
}

public void setLastName(String customLastName) {
    this.lastName = customLastName;
} 

public int getYearOfBirth() {
    return this.yearOfBirth;
}

public void setYearOfBirth(int customYearOfBirth) {
    this.yearOfBirth = customYearOfBirth;
}

public void showInfo() {
    System.out.println("Ime: " + this.firstName);
    System.out.println("Prezime: " + this.lastName);
    System.out.println("Godina rodjenja: " + this.yearOfBirth);
}

public void showFirstName() {
    System.out.println("Zovem se: " + this.firstName);
}

public void showLastName() {
    System.out.println("Prezivam se: " + this.lastName);
    }
    
public void showYearOfBirth() {
    System.out.println("Rodjen sam: " + this.yearOfBirth);
}
}

