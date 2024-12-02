package org.example.task10;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField salaryField;

    @FXML
    private TextField hoursWorkedField;

    @FXML
    private TextField hourlyRateField;

    @FXML
    private ComboBox<String> employeeTypeComboBox;

    @FXML
    private Button addButton;

    @FXML
    private Button calculateButton;

    @FXML
    private Button deleteButton;  // Add a delete button

    @FXML
    private TableView<Employee> employeeTable;

    @FXML
    private TableColumn<Employee, String> nameColumn;

    @FXML
    private TableColumn<Employee, String> typeColumn;

    @FXML
    private TableColumn<Employee, Double> salaryColumn;

    private ObservableList<Employee> employeeList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize combo box with employee types
        employeeTypeComboBox.setItems(FXCollections.observableArrayList("Full-time", "Part-time", "Contractor"));

        // Set up the table columns
        nameColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
        typeColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getClass().getSimpleName()));
        salaryColumn.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().calculateSalary()).asObject());

        // Initialize buttons and their actions
        addButton.setOnAction(event -> addEmployee());
        calculateButton.setOnAction(event -> updateSalaries());
        deleteButton.setOnAction(event -> deleteEmployee());  // Set delete button action

        // Add a listener to the table to update the delete button visibility
        employeeTable.setOnMouseClicked(event -> handleTableClick(event));
    }

    // Method to add an employee
    private void addEmployee() {
        String name = nameField.getText();
        String type = employeeTypeComboBox.getValue();
        double salary = 0;
        int hoursWorked = 0;
        double hourlyRate = 0;

        try {
            if (type == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name and Type are required.");
            }

            if (type.equals("Full-time")) {
                salary = Double.parseDouble(salaryField.getText());
                employeeList.add(new FullTimeEmployee(name, salary));
            } else if (type.equals("Part-time")) {
                hourlyRate = Double.parseDouble(hourlyRateField.getText());
                hoursWorked = Integer.parseInt(hoursWorkedField.getText());
                employeeList.add(new PartTimeEmployee(name, hourlyRate, hoursWorked));
            } else if (type.equals("Contractor")) {
                hourlyRate = Double.parseDouble(hourlyRateField.getText());
                hoursWorked = Integer.parseInt(hoursWorkedField.getText());
                employeeList.add(new Contractor(name, hourlyRate, hoursWorked));
            }

            // Refresh table to show updated data
            employeeTable.setItems(employeeList);

        } catch (Exception e) {
            showAlert("Error", "Please fill out all fields correctly.");
        }
    }

    // Method to update salaries (refresh table)
    private void updateSalaries() {
        employeeTable.refresh();
    }

    // Method to delete an employee
    private void deleteEmployee() {
        Employee selectedEmployee = employeeTable.getSelectionModel().getSelectedItem();
        if (selectedEmployee != null) {
            employeeList.remove(selectedEmployee);
        } else {
            showAlert("Error", "Please select an employee to delete.");
        }
    }

    // Method to show alert messages
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Ensure the delete button is only enabled if an employee is selected
    private void handleTableClick(MouseEvent event) {
        if (employeeTable.getSelectionModel().getSelectedItem() != null) {
            deleteButton.setDisable(false);  // Enable delete button when an employee is selected
        } else {
            deleteButton.setDisable(true);  // Disable delete button when no employee is selected
        }
    }
}
