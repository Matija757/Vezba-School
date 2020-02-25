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
public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    
public Course() {
    this.name = " ";
    this.numberOfClasses = 0;
    this.codeName = " ";
}

public String getName () {
    return this.name;
}

public void setName(String customName) {
    this.name = customName;
}

public int getNumberOfClasses() {
    return this.numberOfClasses;
}

public void setNumberOfClasses(int customNumberOfClasses) {
    this.numberOfClasses = customNumberOfClasses;
}

public String getCodeName() {
    return this.codeName;
}

public void setCodeName(String customCodeName) {
    this.codeName = customCodeName;
}

public void showCourseDetails() {
    System.out.println("Moj username je: " + this.name);
    System.out.println("Ucenik je prisustvovao: " + this.numberOfClasses + " puta na predavanjima");
    System.out.println("Moj identifikacioni kod je: " + this.codeName);
}

public void showName() {
    System.out.println("Moj username je: " + this.name);
}

public void showNumberOfClasses() {
    System.out.println("Ucenik je prisustvovao: " + this.numberOfClasses + " puta na predavanjima");
    }

public void showCodeName() {
    System.out.println("Moj identifikacioni kod je: " + this.codeName);
}
        
}
