/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagoltanan;

import java.util.Scanner;

/**
 *
 * @author Alipan_CPE
 */
public class Sagoltanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {

            System.out.println("Maayong buntag Mindanao");
            System.out.println("  ");
            Scanner bogo = new Scanner(System.in);
            System.out.println("Pilie sa upat chuy:");
            System.out.println("  " + "1. Temperature Converter");
            System.out.println("  " + "2. Odd/Even Number Checker");
            System.out.println("  " + "3. Trigonometric Calculator");
            System.out.println("  " + "4. Polygon Surface Area Calculator");
            int hehe = bogo.nextInt();

            if (hehe == 1) {
                System.out.println("Unsa may i convert nato sa unom?:");
                System.out.println("  ");
                System.out.println("1. Celsius to Farenheight");
                System.out.println("2. Farenheight to Celsius");
                System.out.println("3. Kelvin to Celsius");
                System.out.println("4. Kelvin to Farenheight");
                System.out.println("5. Celsius to Kelvin");
                System.out.println("6. Farenheight to Kelvin");
                int haha = bogo.nextInt();

                while (true) {
                    switch (haha) {
                        case 1:
                            System.out.println("Esulat ang value chuy:");
                            double c = bogo.nextDouble();
                            double f = (c * 9 / 5) + 32;
                            System.out.println("The Answer is:" + " " + f);
                            break;

                        case 2:
                            System.out.println("Esulat ang value chuy:");
                            double f2 = bogo.nextDouble();
                            double c2 = (f2 - 32) * 5 / 9;
                            System.out.println("The Answer is:" + " " + c2);
                            break;

                        case 3:
                            System.out.println("Esulat ang value chuy:");
                            double k = bogo.nextDouble();
                            double c3 = k - 273.15;
                            System.out.println("The Answer is:" + " " + c3);
                            break;

                        case 4:
                            System.out.println("Esulat ang value chuy:");
                            double k2 = bogo.nextDouble();
                            double f3 = (k2 - 273.15) * 9 / 5 + 32;
                            System.out.println("The Answer is:" + " " + f3);
                            break;

                        case 5:
                            System.out.println("Esulat ang value chuy:");
                            double c4 = bogo.nextDouble();
                            double k3 = c4 + 273.15;
                            System.out.println("The Answer is:" + " " + k3);
                            break;

                        case 6:
                            System.out.println("Esulat ang value chuy:");
                            double f4 = bogo.nextDouble();
                            double k4 = (f4 - 32) * 5 / 9 + 273.15;
                            System.out.println("The Answer is:" + " " + k4);
                            break;
                    }
                    Scanner input = new Scanner(System.in);
                    System.out.println("Usab tag convert chuy?");
                    System.out.println("1. YES");
                    System.out.println("2. NO");

                    int q = input.nextInt();

                    if (q == 1) {

                    } else if (q == 2) {

                        break;
                    }
                }
            } else if (hehe == 2) {
                while (true) {
                    {

                        System.out.print("Enter a Number: ");
                        int x = bogo.nextInt();
                        if (x % 2 == 0) {
                            System.out.println(x + " is even.");
                        } else {
                            System.out.println(x + " is odd.");
                        }

                    }
                    Scanner input = new Scanner(System.in);
                    System.out.println("Usab tag convert chuy?");
                    System.out.println("1. YES");
                    System.out.println("2. NO");

                    int q = input.nextInt();

                    if (q == 1) {

                    } else if (q == 2) {

                        break;
                    }
                }
            } else if (hehe == 3) {
                while (true) {

                    {

                        System.out.println("Please choose trigonometric functions:");
                        System.out.println("  ");
                        System.out.println("1. Sine (sin)");
                        System.out.println("2. Cosine (cos)");
                        System.out.println("3. Tangent (tan)");

                        int t = bogo.nextInt();

                        switch (t) {

                            case 1:
                                System.out.println("Enter value in degree:");
                                double sin = bogo.nextDouble();
                                System.out.println("The sine of" + " " + sin + " " + "is:" + " " + Math.sin(Math.toRadians(sin)));
                                break;

                            case 2:
                                System.out.println("Enter value in degree:");
                                double cos = bogo.nextDouble();
                                System.out.println("The cosine of" + " " + cos + " " + "is:" + " " + Math.cos(Math.toRadians(cos)));
                                break;

                            case 3:
                                System.out.println("Enter value in degree:");
                                double tan = bogo.nextDouble();
                                System.out.println("The tangent of" + " " + tan + " " + "is:" + " " + Math.tan(Math.toRadians(tan)));
                                break;
                        }

                    }
                    Scanner input = new Scanner(System.in);
                    System.out.println("Usab tag convert chuy?");
                    System.out.println("1. YES");
                    System.out.println("2. NO");

                    int q = input.nextInt();

                    if (q == 1) {

                    } else if (q == 2) {

                        break;
                    }

                }
            } else if (hehe == 4) {
                while (true) {
                    {

                        System.out.println("Please choose a polygon:");
                        System.out.println("  ");
                        System.out.println("1. Triangle");
                        System.out.println("2. Square");
                        System.out.println("3. Rectangle");
                        System.out.println("4. Circle");
                        int p = bogo.nextInt();

                        while (true) {
                            switch (p) {

                                case 1:
                                    System.out.println("Enter the value of three sides of triangle");
                                    System.out.println("Side 1:");
                                    double a = bogo.nextDouble();
                                    System.out.println("Side 2:");
                                    double b = bogo.nextDouble();
                                    System.out.println("Side 3:");
                                    double c = bogo.nextDouble();

                                    double abc = ((a + b + c) / 2);
                                    double fv = Math.sqrt(abc * (abc - a) * (abc - b) * (abc - c));

                                    System.out.println("The area of triangle is:" + " " + fv);
                                    break;

                                case 2:
                                    System.out.println("Enter the value of length of the square:");
                                    double d = bogo.nextDouble();

                                    double fv2 = (d * d);

                                    System.out.println("The area of Square is:" + " " + fv2);
                                    break;

                                case 3:
                                    System.out.println("Enter the value of length and width of a rectangle");
                                    System.out.println("Length:");
                                    double e = bogo.nextDouble();
                                    System.out.println("Width:");
                                    double f = bogo.nextDouble();

                                    double fv3 = (e * f);

                                    System.out.println("The area of a rectangle is:" + " " + fv3);
                                    break;
                                case 4:
                                    System.out.println("Enter the value of radius of the circle:");
                                    double g = bogo.nextDouble();

                                    double fv4 = (Math.PI * g * g);

                                    System.out.println("The area of a circle is:" + " " + fv4);
                                    break;
                            }

                            Scanner input = new Scanner(System.in);
                            System.out.println("Usab tag convert chuy?");
                            System.out.println("1. YES");
                            System.out.println("2. NO");

                            int q = input.nextInt();

                            if (q == 1) {

                            } else if (q == 2) {

                                break;
                            }

                        }
                    }

                    Scanner input = new Scanner(System.in);
                    System.out.println("Do you want to choose another polygon?");
                    System.out.println("1. YES");
                    System.out.println("2. NO");

                    int q = input.nextInt();

                    if (q == 1) {

                    } else if (q == 2) {

                        break;
                    }
                }
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to select another options?");
            System.out.println("1. YES");
            System.out.println("2. NO");

            int q = input.nextInt();

            if (q == 1) {

            } else if (q == 2) {
                System.out.println("Payts chuyy!");
                break;
            }
        }
    }

}
