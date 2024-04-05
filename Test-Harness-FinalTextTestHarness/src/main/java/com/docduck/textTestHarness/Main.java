package com.docduck.textTestHarness;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.docduck.textlibrary.*;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextField positionXField = new TextField("50");
        TextField positionYField = new TextField("50");
        TextField widthField = new TextField("200");
        TextField heightField = new TextField("100");
        TextArea contentArea = new TextArea("Enter text here");
        TextField fontField = new TextField("Arial");
        TextField fontColourField = new TextField("#000000");
        TextField fontSizeField = new TextField("12");
        TextField lineSpacingField = new TextField("1.0");
        TextField characterSpacingField = new TextField("0.0");
        TextField backgroundColourField = new TextField("#FFFFFF");
        TextField borderColourField = new TextField("#000000");
        TextField borderWidthField = new TextField("1");
        TextField marginField = new TextField("5");
        TextField cornerRadiusField = new TextField("0.0");

        Button createButton = new Button("Create");

        VBox textBoxUI = new VBox(
                new Label("Position X:"),
                positionXField,
                new Label("Position Y:"),
                positionYField,
                new Label("Width:"),
                widthField,
                new Label("Height:"),
                heightField,
                new Label("Content:"),
                contentArea,
                new Label("Font:"),
                fontField,
                new Label("Font Colour (HEX):"),
                fontColourField,
                new Label("Font Size:"),
                fontSizeField,
                new Label("Line Spacing:"),
                lineSpacingField,
                new Label("Character Spacing:"),
                characterSpacingField,
                new Label("Background Colour (HEX):"),
                backgroundColourField,
                new Label("Border Colour (HEX):"),
                borderColourField,
                new Label("Border Width:"),
                borderWidthField,
                new Label("Margin:"),
                marginField,
                new Label("Corner Radius:"),
                cornerRadiusField,
                createButton
        );

        // Checkbox for adding/removing border
        CheckBox borderCheckBox = new CheckBox("Add Border");

        // Add the checkbox to the UI
        textBoxUI.getChildren().add(borderCheckBox);

        Pane canvas = new Pane();

        VBox root = new VBox(textBoxUI, canvas);
        root.setStyle("-fx-background-color: #c4c4c4; -fx-padding: 10px;");
        root.setSpacing(10);

        Scene scene = new Scene(root, 600, 800);

        stage.setTitle("Text Test Harness");
        stage.setScene(scene);
        stage.show();

        EventHandler<ActionEvent> createButtonHandler = event -> {
            int positionX = Integer.parseInt(positionXField.getText());
            int positionY = Integer.parseInt(positionYField.getText());
            double width = Double.parseDouble(widthField.getText());
            double height = Double.parseDouble(heightField.getText());
            String content = contentArea.getText();
            String font = fontField.getText();
            String fontColour = fontColourField.getText();
            int fontSize = Integer.parseInt(fontSizeField.getText());
            double lineSpacing = Double.parseDouble(lineSpacingField.getText());
            double characterSpacing = Double.parseDouble(characterSpacingField.getText());
            String backgroundColour = backgroundColourField.getText();
            String borderColour = borderColourField.getText();
            int borderWidth = Integer.parseInt(borderWidthField.getText());
            int margin = Integer.parseInt(marginField.getText());
            double cornerRadius = Double.parseDouble(cornerRadiusField.getText());

            TextBox textBox = new TextBox(positionX, positionY, width, height, content, font, fontColour,
                    fontSize, lineSpacing, characterSpacing, backgroundColour, borderColour, borderWidth, margin,
                    cornerRadius);

            // Check if the checkbox is selected
            if (borderCheckBox.isSelected()) {
                textBox.addBorder(); // Add border
            } else {
                textBox.removeBorder(); // Remove border
            }

            Stage textBoxStage = new Stage();
            Pane textBoxPane = new Pane();
            textBoxPane.getChildren().addAll(textBox.returnBox(), textBox.returnText());
            Scene textBoxScene = new Scene(textBoxPane, width + 1000, height + 420);
            textBoxStage.setScene(textBoxScene);
            textBoxStage.setTitle("Text Box");
            textBoxStage.show();
        };

        createButton.setOnAction(createButtonHandler);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
