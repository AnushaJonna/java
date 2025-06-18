package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.*;

public class StudentFormApp extends Application {

    // Database connection parameters - update these
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "prasad@08";

    @Override
    public void start(Stage primaryStage) {
        // Create input fields
        TextField nameField = new TextField();
        TextField rollField = new TextField();
        TextField courseField = new TextField();
        TextField semesterField = new TextField();
        TextField emailField = new TextField();
        TextField phoneField = new TextField();

        Button insertButton = new Button("Insert");

        // Action when Insert button is clicked
        insertButton.setOnAction(e -> {
            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();
            String semester = semesterField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String sql = "INSERT INTO students (name, roll_number, course, semester, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, roll);
                stmt.setString(3, course);
                stmt.setString(4, semester);
                stmt.setString(5, email);
                stmt.setString(6, phone);

                stmt.executeUpdate();

                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data inserted successfully!");
                alert.showAndWait();

                // Clear fields after insertion
                nameField.clear();
                rollField.clear();
                courseField.clear();
                semesterField.clear();
                emailField.clear();
                phoneField.clear();

            } catch (SQLException ex) {
                ex.printStackTrace();
                Alert alert = new Alert(Alert.AlertType.ERROR, "Error: " + ex.getMessage());
                alert.showAndWait();
            }
        });

        // Layout using GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add Labels and Fields to grid
        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(new Label("Roll Number:"), 0, 1);
        grid.add(rollField, 1, 1);

        grid.add(new Label("Course:"), 0, 2);
        grid.add(courseField, 1, 2);

        grid.add(new Label("Semester:"), 0, 3);
        grid.add(semesterField, 1, 3);

        grid.add(new Label("Email:"), 0, 4);
        grid.add(emailField, 1, 4);

        grid.add(new Label("Phone:"), 0, 5);
        grid.add(phoneField, 1, 5);

        grid.add(insertButton, 1, 6);

        Scene scene = new Scene(grid, 400, 350);

        primaryStage.setTitle("Student Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX app
    }
}