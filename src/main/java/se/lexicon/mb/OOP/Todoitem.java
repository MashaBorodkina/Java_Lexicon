package se.lexicon.mb.OOP;

import java.time.LocalDate;

public class Todoitem {
    private int id;
    String title;
    String description;
    LocalDate deadline;
    boolean done;
    Person creator;

    public Todoitem (int id, String title, LocalDate deadline, Person creator) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if(deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null or empty");
        }
        if (LocalDate.now().isAfter(deadline)) {
            System.out.println("Attention! You have missed the deadline!");
        }
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.creator = creator;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public int getId () {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getDeadline(){
        return deadline;
    }
    public boolean getDone() {
        return done;
    }
    public Person getCreator(){
        return creator;
    }

    public String getSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("id: ").append(id)
                .append(", title:").append(title)
                .append(", description:").append(description)
                .append(", deadline:").append(deadline)
                .append(", is done:").append(done)
                .append(", creator:").append(creator.getSummary());
        return summary.toString();
    }
    public boolean isOverdue(){
        if (LocalDate.now().isAfter(deadline));
        return true;
    }
}
