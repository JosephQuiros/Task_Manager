/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package task_manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Joseph
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textField;
    @FXML
    private Button insert_btn;
    @FXML
    private ListView<Task> viewList;
    
    private ObservableList<Task> tasks = FXCollections.observableArrayList();
    @FXML
    private Button state_btn;
    @FXML
    private Button delete_btn;
 
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        viewList.setItems(tasks);
    }    

    @FXML
    private void addTask(ActionEvent event)
    {
        String descriptionTask = textField.getText();
        if (!descriptionTask.isEmpty()) {
            Task newTask = new Task(descriptionTask);
            tasks.add(newTask);
            textField.clear();
        }

    }

    @FXML
    private void changeTaskState(ActionEvent event)
    {
        Task selectedTask = viewList.getSelectionModel().getSelectedItem();
        
        if (selectedTask != null) {
            
            if(selectedTask.isCompleted())
                selectedTask.setCompleted(false);
            else
                selectedTask.setCompleted(true);
            
            viewList.refresh();
        }

    }

    @FXML
    private void deleteTask(ActionEvent event)
    {
        Task tareaSeleccionada = viewList.getSelectionModel().getSelectedItem();
        if (tareaSeleccionada != null) {
            tasks.remove(tareaSeleccionada);
        }

    }

    
}
