package com.example.javafxtableviewframework13a2026;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.List;
import java.util.function.Function;

public class TableviewManager implements ITableviewManager {
    @Override
    public TableView<ObservableList<String>> getTableview() {
        return null;
    }

    @Override
    public void setTableview(TableView<ObservableList<String>> tableview) {

    }

    @Override
    public ObservableList<ObservableList<String>> getTableData() {
        return null;
    }

    @Override
    public void setTableData(ObservableList<ObservableList<String>> tableData) {

    }

    @Override
    public String getCellValue(int rowIndex, int columnIndex) {
        return "";
    }

    @Override
    public void setCellValue(int rowIndex, int columnIndex, String value) {

    }

    @Override
    public void addRow(List<String> rowData) {

    }

    @Override
    public void insertRow(int rowIndex, List<String> rowData) {

    }

    @Override
    public void updateRow(int rowIndex, List<String> rowData) {

    }

    @Override
    public String[] getRow(int rowIndex) {
        return new String[0];
    }

    @Override
    public void removeRow(int rowIndex) {

    }

    @Override
    public void addColumn(String[] columnData) {

    }

    @Override
    public void insertColumn(int columnIndex, String[] columnData) {

    }

    @Override
    public void updateColumn(int columnIndex, String[] columnData) {

    }

    @Override
    public String[] getColumn(int columnIndex) {
        return new String[0];
    }

    @Override
    public void removeColumn(int columnIndex) {

    }

    @Override
    public void clearTable() {

    }

    @Override
    public void setCellTextColor(int rowIndex, int columnIndex, String color) {

    }

    @Override
    public String getCellTextColor(int rowIndex, int columnIndex) {
        return "";
    }

    @Override
    public void setCellBackgroundColor(int rowIndex, int columnIndex, String color) {

    }

    @Override
    public String getCellBackgroundColor(int rowIndex, int columnIndex) {
        return "";
    }

    @Override
    public void handleCellClick(int rowIndex, int columnIndex, Function<String, Void> onClick) {

    }
}
