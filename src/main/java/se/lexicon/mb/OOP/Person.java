package se.lexicon.mb.OOP;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person (int id, String firstName, String lastName, String email) {
        if(firstName==null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName==null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        if (email==null || email.trim().isEmpty()){
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getSummary(){
        StringBuilder summary = new StringBuilder();
        summary.append("id:").append(id)
                .append(", name:").append(firstName).append(" ").append(lastName)
                .append(", email:").append(email);
        return summary.toString();
    }

}
