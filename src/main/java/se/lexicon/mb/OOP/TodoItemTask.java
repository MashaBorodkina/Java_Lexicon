package se.lexicon.mb.OOP;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private String todoItem;
    private Person assignee;

    public TodoItemTask(int id, String todoItem, Person assignee) {
        if(todoItem==null|| todoItem.trim().isEmpty()){
            throw new IllegalArgumentException("To do item cannot be null or empty");
        }
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
        if(assignee!=null){
            this.assigned=true;
        }else{
            this.assigned=false;
        }
    }
    public int getId(){
        return id;
    }
    public String getTodoItem(){
        return todoItem;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public Person getAssignee(){
        return assignee;
    }
    public String getSummary(){
        StringBuilder summary = new StringBuilder();
        summary.append("id:").append(id)
                .append(", assigned:").append(assigned)
                .append(", ToDoItem ").append(todoItem)
                .append("assignee").append(assignee.getSummary());
        return summary.toString();
    }
}
