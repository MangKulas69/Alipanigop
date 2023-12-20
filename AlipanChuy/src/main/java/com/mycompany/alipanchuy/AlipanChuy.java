/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.alipanchuy;

import javax.swing.JOptionPane;

/**
 *
 * @author Mick
 */
public class AlipanChuy {

    public static void main(String[] args) {

        boolean calculateAnother = true;

        while (calculateAnother) {
            // papilia siya og shape
            String shapeOptions = "1. Heptagon\n2. Octagon\n3. Nonagon\n4. Decagon";
            String shapeInput = JOptionPane.showInputDialog("Select a shape:\n" + shapeOptions);
            int shapeChoice = Integer.parseInt(shapeInput);

            switch (shapeChoice) {
                case 1 -> // Heptagon
                    calculateHeptagonArea();

                case 2 -> // Octagon
                    calculateOctagonArea();

                case 3 -> // Nonagon
                    calculateNonagonArea();

                case 4 -> // Decagon
                    calculateDecagonArea();

                default -> JOptionPane.showMessageDialog(null, "Nice ka chuy!.");
            }

            // mangutana kong mag calculate ba og usab
            int option = JOptionPane.showConfirmDialog(null, "Do you want to try another shape?", "Calculate Another Equation", JOptionPane.YES_NO_OPTION);
            calculateAnother = (option == JOptionPane.YES_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Thank you for using the Geometry Calculator!");
    }

    private static double getPositiveDoubleInput(String message) {
        String input;
        double value;
        do {
            input = JOptionPane.showInputDialog(message);
            value = Double.parseDouble(input);
        } while (value <= 0);
        return value;
    }

// Method para ma calculate ang Area sa Heptagon
    private static void calculateHeptagonArea() {
        // Get the side length of the Heptagon from user input
        double sideLength = getPositiveDoubleInput("Enter the side length of the Heptagon:");
        // Calculate the area of the Heptagon using the formula
        double heptagonArea = (7 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 7));
        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, "Area of the Heptagon is: " + heptagonArea);
    }

// Method para ma calculate ang Area sa Octagon
    private static void calculateOctagonArea() {
        // Get the side length of the Octagon from user input
        double sideLength = getPositiveDoubleInput("Enter the side length of the Octagon:");
        // Calculate the area of the Octagon using the formula
        double octagonArea = (8 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 8));
        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, "Area of the Octagon is: " + octagonArea);
    }

// Method para ma calculate ang Area sa Nonagon
    private static void calculateNonagonArea() {
        // Get the side length of the Nonagon from user input
        double sideLength = getPositiveDoubleInput("Enter the side length of the Nonagon:");
        // Calculate the area of the Nonagon using the formula
        double nonagonArea = (9 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 9));
        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, "Area of the Nonagon is: " + nonagonArea);
    }

// Method para ma calculate ang Area sa Decagon
    private static void calculateDecagonArea() {
        // Get the side length of the decagon from user input
        double sideLength = getPositiveDoubleInput("Enter the side length of the Decagon:");
        // Calculate the area of the decagon using the formula
        double decagonArea = (10 * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / 10));
        // Display the result using a dialog box
        JOptionPane.showMessageDialog(null, "Area of the Decagon is: " + decagonArea);
    }
}
