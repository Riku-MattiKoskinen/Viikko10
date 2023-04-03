package com.example.jostoimisi;
import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String email;
    private List<String> completedDegrees;
    protected int image;
    protected String degreeProgram;

    public User(String firstName, String lastName, String email, String degreeProgram, int image, List<String> completedDegrees){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
        this.completedDegrees = completedDegrees;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getDegreeProgram() {
        return degreeProgram;
    }
    public int getImage() {
        return image;
    }
    public List<String> getCompletedDegrees() {
        return completedDegrees;
    }
}
