package se.lexicon.mb.OOP;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Person person = new Person(1, "Maria", "Borodkina","mashaborodkina@example.ru");
        System.out.println(person.getSummary());
        Todoitem todo = new Todoitem(1, "Clean Car", LocalDate.of(2025,7,21), person);
        System.out.println(todo.getSummary());
        Person person2 = new Person(2, "Yulia", "Ivanova", "ivanova@ex.se");
        TodoItemTask totdoitem = new TodoItemTask(1, "Go to car wash ", person2);
        System.out.println(totdoitem.getSummary());
    }
}
