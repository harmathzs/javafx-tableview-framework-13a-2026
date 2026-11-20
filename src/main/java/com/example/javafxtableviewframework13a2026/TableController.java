package com.example.javafxtableviewframework13a2026;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableController implements Initializable {
    @FXML
    public TableView<ObservableList<String>> tableView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableviewManager manager = new TableviewManager(tableView);
        List<String> firstRow = new ArrayList<>();
        firstRow.add("A");
        firstRow.add("B");
        manager.addRow(firstRow);
    }
}