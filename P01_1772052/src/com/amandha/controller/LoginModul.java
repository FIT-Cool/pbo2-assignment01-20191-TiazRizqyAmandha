package com.amandha.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

//Created By : Tiaz Rizqy Amandha
//NRP : 1772052

public class LoginModul {
    public ImageView txtImageUser;
    public ImageView txtImageComputer;
    public int menang = 0;
    public int seri = 0;
    public int kalah = 0;
    public TextField txtWin;
    public TextField txtDraw;
    public TextField txtLose;


    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void paperAction(ActionEvent actionEvent) {
        txtImageUser.setImage(new Image("kertas.png"));
        Random random = new Random();
        int a = random.nextInt(3);

        if (a == 0) {
            txtImageComputer.setImage(new Image("kertas.png"));
            seri+=1;
            txtDraw.setText(String.valueOf(seri));

        }
        if (a == 1) {
            txtImageComputer.setImage(new Image("batu.png"));
            menang+=1;
            txtWin.setText(String.valueOf(menang));
        } else {
            txtImageComputer.setImage(new Image("gunting.png"));
            kalah+=1;
            txtLose.setText(String.valueOf(kalah));
        }


    }

    public void RockAction(ActionEvent actionEvent) {
        txtImageUser.setImage(new Image("batu.png"));
        Random random = new Random();
        int a = random.nextInt(3);

        if (a == 0) {
            txtImageComputer.setImage(new Image("kertas.png"));
            kalah+=1;
            txtLose.setText(String.valueOf(kalah));

        }
        if (a == 1) {
            txtImageComputer.setImage(new Image("batu.png"));
            seri+=1;
            txtDraw.setText(String.valueOf(seri));
        } else {
            txtImageComputer.setImage(new Image("gunting.png"));
            menang+=1;
            txtWin.setText(String.valueOf(menang));
        }
    }

    public void ScissorsAction(ActionEvent actionEvent) {
        txtImageUser.setImage(new Image("gunting.png"));
        Random random = new Random();
        int a = random.nextInt(3);

        if (a == 0) {
            txtImageComputer.setImage(new Image("kertas.png"));
            menang+=1;
            txtWin.setText(String.valueOf(menang));
        }
        if (a == 1) {
            txtImageComputer.setImage(new Image("batu.png"));
            kalah+=1;
            txtLose.setText(String.valueOf(kalah));
        } else {
            txtImageComputer.setImage(new Image("gunting.png"));
            seri+=1;
            txtDraw.setText(String.valueOf(seri));
        }
    }
}

