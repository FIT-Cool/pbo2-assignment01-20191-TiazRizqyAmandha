package com.amandha.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

//Created By : Tiaz Rizqy Amandha
//NRP : 1772052

public class Modul2 {
    public TextField txtWidth;
    public TextField txtLength;
    public TextField txtRadius;
    public TextField txtHeight;
    public boolean kell;
    public String pilih;
    int length, width, height, radius;
    double B, D;


    public void SquareAction(ActionEvent actionEvent) {
        txtHeight.setDisable(false);
        txtWidth.setDisable(false);
        txtRadius.setDisable(true);
        txtLength.setDisable(true);
        txtWidth.setEditable(true);
        txtHeight.setEditable(true);
        txtRadius.setEditable(false);
        txtLength.setEditable(false);
        pilih = "square";
        kell = true;
        txtLength.setText("");
        txtWidth.setText("");
        txtHeight.setText("");
        txtRadius.setText("");



    }

    public void BallAction(ActionEvent actionEvent) {
            txtRadius.setDisable(false);
            txtHeight.setDisable(true);
            txtLength.setDisable(true);
            txtWidth.setDisable(true);
            txtWidth.setEditable(false);
            txtLength.setEditable(false);
            txtHeight.setEditable(false);
            txtRadius.setEditable(true);
            pilih = "ball";
            kell = false;
            txtLength.setText("");
            txtWidth.setText("");
            txtHeight.setText("");
            txtRadius.setText("");
    }

    public void TubeAction(ActionEvent actionEvent) {
        txtRadius.setDisable(false);
        txtHeight.setDisable(false);
        txtWidth.setDisable(true);
        txtLength.setDisable(true);
        txtWidth.setEditable(false);
        txtLength.setEditable(false);
        txtRadius.setEditable(true);
        txtHeight.setEditable(true);
        pilih = "tube";
        kell = false;
        txtLength.setText("");
        txtWidth.setText("");
        txtHeight.setText("");
        txtRadius.setText("");
    }

    public void SubmitAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (pilih.equals("square")){
            height = Integer.parseInt(txtHeight.getText());
            width = Integer.parseInt(txtWidth.getText());
            B = width * height;
            D = 2*(width+height);
        }
        else if (pilih.equals("ball")){
            radius = Integer.parseInt(txtRadius.getText());
            B = 4*Math.PI*Math.pow(radius,2);
            D = (4/3)*Math.PI*Math.pow(radius,3);
        }
        else if (pilih.equals("tube")){
            radius = Integer.parseInt(txtRadius.getText());
            height = Integer.parseInt(txtHeight.getText());
            B = 2 * Math.PI * radius * (radius + height);
            D = Math.PI*Math.pow(radius,2)*height;
        }
        if (kell){
            alert.setContentText("Area: "+B+", Circumference: "+D);
        }
        else
        {
            alert.setContentText("Surface Area: " + B + ", Volume: " + D);
        }
        alert.show();
    }
}
