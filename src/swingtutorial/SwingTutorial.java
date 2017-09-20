/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtutorial;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Administrator
 */
public class SwingTutorial {

    public static void main(String[] args) {

        JFrame formLogin = new JFrame("Student");
        formLogin.setSize(800, 400);
        formLogin.setVisible(true);
        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(100, 30, 600, 300);
        loginPanel.setVisible(true);
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.lightGray);

        JLabel lblStudent = new JLabel("Id Student ");
        lblStudent.setBounds(50, 10, 150, 40);
        lblStudent.setBackground(Color.red);
        JLabel lblName = new JLabel("Name ");
        lblName.setBounds(50, 50, 150, 40);
        JLabel lblClassname = new JLabel("Class Name ");
        lblClassname.setBounds(50, 90, 150, 40);
        JLabel lblPhone = new JLabel("Phone ");
        lblPhone.setBounds(50, 130, 150, 40);
        JLabel lblRollnumber = new JLabel("RollNumber ");
        lblRollnumber.setBounds(50, 170, 150, 40);
        JLabel lblEmail = new JLabel("Email ");
        lblEmail.setBounds(50, 210, 150, 40);
        JTextArea txtIdstudent = new JTextArea();
        txtIdstudent.setBounds(200, 20, 200, 20);
        JTextArea txtName = new JTextArea();
        txtName.setBounds(200, 60, 200, 20);
        JTextArea txtClassName = new JTextArea();
        txtClassName.setBounds(200, 100, 200, 20);
        JTextArea txtPhone = new JTextArea();
        txtPhone.setBounds(200, 140, 200, 20);
        JTextArea txtRollNumber = new JTextArea();
        txtRollNumber.setBounds(200, 180, 200, 20);
        JTextArea txtEmail = new JTextArea();
        txtEmail.setBounds(200, 220, 200, 20);
        JButton btn = new JButton();
        btn.setText("Submit");
        btn.setBounds(250, 255, 100, 30);

        loginPanel.add(lblName);
        loginPanel.add(lblStudent);
        loginPanel.add(lblEmail);
        loginPanel.add(lblPhone);
        loginPanel.add(lblRollnumber);
        loginPanel.add(lblClassname);
        loginPanel.add(txtIdstudent);
        loginPanel.add(txtName);
        loginPanel.add(txtPhone);
        loginPanel.add(txtClassName);
        loginPanel.add(txtEmail);
        loginPanel.add(txtRollNumber);
        loginPanel.add(btn);
        formLogin.add(loginPanel);
        
//        formLogin.setLocationRelativeTo(null);

//        loginPanel.setLayout(null);
//        loginPanel.setBackground(Color.red);
//        lblStudent.setLayout(null);
//        lblStudent.setBounds(50, 20, 1000, 40);
//        lblStudent.setBackground(Color.RED);
//
//        JLabel lblName = new JLabel("Name ");
//        lblName.setBounds(50, 60, 100, 40);
//        lblName.setBackground(Color.red);
//        lblName.setLayout(null);
//        JLabel lblClassname = new JLabel("Class Name ");
//        lblClassname.setBounds(50, 100, 150, 40);
//        JLabel lblPhone = new JLabel("Phone ");
//        lblPhone.setBounds(100, 145, 150, 40);
//        JLabel lblRollnumber = new JLabel("RollNumber ");
//        lblRollnumber.setBounds(100, 145, 150, 40);
//        JLabel lblEmail = new JLabel("Email ");
//        lblEmail.setBounds(100, 145, 150, 40);
//        loginPanel.add(lblStudent);
//        loginPanel.add(lblName);
//        formLogin.add(loginPanel);
//        formLogin.setVisible(true);
//
//        
//        formLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formLogin.setLayout(null);
    }

}
