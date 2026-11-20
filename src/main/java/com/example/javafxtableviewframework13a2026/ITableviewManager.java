package com.example.javafxtableviewframework13a2026;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.List;
import java.util.function.Function;

public interface ITableviewManager {
    TableView<ObservableList<String>> getTableview();
    void setTableview(TableView<ObservableList<String>> tableview);
    ObservableList<ObservableList<String>> getTableData();
    void setTableData(ObservableList<ObservableList<String>> tableData);
    String getCellValue(int rowIndex, int columnIndex);
    void setCellValue(int rowIndex, int columnIndex, String value);
    void addRow(List<String> rowData);
    void insertRow(int rowIndex, List<String> rowData);
    void updateRow(int rowIndex, List<String> rowData);
    String[] getRow(int rowIndex);
    void removeRow(int rowIndex);
    void addColumn(String[] columnData);
    void insertColumn(int columnIndex, String[] columnData);
    void updateColumn(int columnIndex, String[] columnData);
    String[] getColumn(int columnIndex);
    void removeColumn(int columnIndex);
    void clearTable();
    void setCellTextColor(int rowIndex, int columnIndex, String color);
    String getCellTextColor(int rowIndex, int columnIndex);
    void setCellBackgroundColor(int rowIndex, int columnIndex, String color);
    String getCellBackgroundColor(int rowIndex, int columnIndex);
    void handleCellClick(int rowIndex, int columnIndex, Function<String, Void> onClick);
}