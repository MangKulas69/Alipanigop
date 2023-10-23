/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalcutelator;

import java.util.Scanner;

/**
 *
 * @author Alipan_CPE
 */
public class KaLcuteLATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("kalcutelator");
        System.out.println("  ");
        Scanner huh = new Scanner(System.in);
        
        int q = (100);
        int w = (300);
        System.out.println("Let a=100 and b=300");
        System.out.println("  ");
        
        System.out.println("Please Select an operation");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        int wow = huh.nextInt();
        
        if (wow==1) {
            double add = (q + w);
            System.out.println("The Answer is: " + add);
        } else if (wow==2) {
            double sub = (q - w);
            System.out.println("The Answer is: " + sub);
        } else if (wow==3) {
            double mult = (q * w);
            System.out.println("The Answer is: " + mult);
        } else if (wow==4) {
            double div = (q / w);
            System.out.println("The Answer is: " + div);
        }
    }
    
}
