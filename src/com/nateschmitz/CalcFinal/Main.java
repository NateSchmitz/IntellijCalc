package com.nateschmitz.CalcFinal;

import com.sun.jdi.FloatValue;

import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float result = 0;
        String firstNumber;
        String secondNumber;
        JOptionPane.showMessageDialog(null,
                "Welcome to my calculator",
                "By: Nate Schmitz",
                JOptionPane.PLAIN_MESSAGE);
        while (1 == 1) {
            String[] options = new String[]{"Addition", "Subtraction", "Multiplication", "Division", "EXIT"};
            int choice = JOptionPane.showOptionDialog(null,
                    "What operation would you like to do?",
                    "Operation?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[4]);
            if (choice == 0) {
                String additionFNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the first number you would like to add?");
                String additionSNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the second number you would like to add?");
                float addFNum = Float.parseFloat(additionFNumber);
                float addSNum = Float.parseFloat(additionSNumber);
                result = addFNum + addSNum;
                JOptionPane.showMessageDialog(null, "Your answer is " + result, "Answer:", JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == 1) {
                String subtractFNumber =
                        JOptionPane.showInputDialog(null,
                                "What is your first number(Minuend)?");
                String subtractSNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the number you would like\n"
                                        + "to subtract from your first number?");
                float subFNum = Float.parseFloat(subtractFNumber);
                float subSNum = Float.parseFloat(subtractSNumber);
                result = subFNum - subSNum;
                JOptionPane.showMessageDialog(null, "Your answer is " + result, "Answer:", JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == 2) {
                String multiplyFNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the first number you\n"
                                        + "would like to multiply?");
                String multiplySNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the second number you\n"
                                        + "would like to multiply?");
                float multFNum = Float.parseFloat(multiplySNumber);
                float multSNum = Float.parseFloat(multiplyFNumber);
                result = multFNum * multSNum;
                JOptionPane.showMessageDialog(null, "Your answer is " + result, "Answer:", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 3) {
                String divideFNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the number you would\n"
                                        + "like to divide from?");
                String divideSNumber =
                        JOptionPane.showInputDialog(null,
                                "What is the number you would\n"
                                        + "like to use to divide?");
                float divdFNum = Float.parseFloat(divideFNumber);
                float divdSNum = Float.parseFloat(divideSNumber);
                if (divdSNum == 0) {
                    JOptionPane.showMessageDialog(null,
                            "You cannot divide by zero",
                            "Error!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    result = divdFNum / divdSNum;
                    JOptionPane.showMessageDialog(null, "Your answer is " + result, "Answer:", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (choice == 4) {
                System.exit(0);
            }
        }
    }
}
