package com.example.javafxtableviewframework13a2026;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.List;
import java.util.function.Function;

public class TableviewManager implements ITableviewManager {
    private TableView<ObservableList<String>> tableView;
    private ObservableList<ObservableList<String>> tableData;

    /**
     * Initialize table data.
     *
     * @return tableData
     * */
    public ObservableList<ObservableList<String>> initTableData() {
        tableData = FXCollections.observableArrayList();
        return tableData;
    }

    /**
     * Constructor.
     * */
    public TableviewManager() {
        tableView = new TableView<>();
        initTableData();
    }

    public TableviewManager(TableView<ObservableList<String>> tableView) {
        setTableview(tableView);
        initTableData();
    }

    @Override
    public TableView<ObservableList<String>> getTableview() {
        return tableView;
    }

    /**
     * Setter for tableView.
     *
     * @param tableview TableView.
     * */
    @Override
    public void setTableview(TableView<ObservableList<String>> tableview) {
        this.tableView = tableview;
    }

    @Override
    public ObservableList<ObservableList<String>> getTableData() {
        return tableData;
    }

    @Override
    public void setTableData(ObservableList<ObservableList<String>> tableData) {
        this.tableData = tableData;
    }

    @Override
    public String getCellValue(int rowIndex, int columnIndex) {
        return "";
    }

    @Override
    public void setCellValue(int rowIndex, int columnIndex, String value) {
        ObservableList<String> row = tableData.get(rowIndex);
        row.set(columnIndex, value);
    }


    public void addRow(List<String> rowData) {
        if (tableData!=null && rowData!=null && !rowData.isEmpty()) {
            tableData.add(FXCollections.observableArrayList(rowData));
            if (tableView!=null) {
                for (int i=0; i < rowData.size(); i++) {
                    setCellValue(tableData.size()-1, i, rowData.get(i));
                }

                tableView.setItems(tableData);
            }
        }
    }

    public void addRow() {
        if (tableData!=null) {
            tableData.add(FXCollections.observableArrayList());
            if (tableView!=null) {
                tableView.setItems(tableData);
            }
        }
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
