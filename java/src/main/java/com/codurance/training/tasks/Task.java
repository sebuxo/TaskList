package com.codurance.training.tasks;

import java.util.List;
import java.util.Map;

public final class Task {
    private final Integer id;
    private final String description;
    private Boolean taskDone;

    public Task(Integer id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.taskDone = done;
    }

    public boolean compareId(long id){
        if(this.id == id){
            return true;
        }
        return false;
    }


public int getId(){
        return id;
}

    @Override
    public String toString() {
       return  "    [%c] %d: %s%n"+ (this.taskDone ? 'x' : ' ')+ this.id+ this.description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return taskDone;
    }

    public void completeTask() {
        this.taskDone = true;
    }

    private void show(Map<String, List<Task>> tasks) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            System.out.println(project.getKey());
            for (Task task : project.getValue()) {
                System.out.printf( "    [%c] %d: %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription());
            }
            System.out.println();
        }
    }
}
