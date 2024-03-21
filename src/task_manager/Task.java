/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_manager;

/**
 *
 * @author Joseph
 */
public class Task
{
    private String description;
    private boolean completed;
     
    public Task(String description)
    {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    
    public String toString()
    {
        if(completed)
        {return description + " (Completed)";}
        
        else
            return description + " (Not completed)";
    }
}
