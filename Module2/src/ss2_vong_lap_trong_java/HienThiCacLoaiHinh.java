package ss2_vong_lap_trong_java;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter the item you want to select: ");
        int choose = kb.nextInt();
        if (choose == 1) {
            System.out.println("Please enter the length of the rectangle:");
            int length = kb.nextInt();
            System.out.println("Please enter the width of the rectangle:");
            int width = kb.nextInt();
            System.out.println("Menu Rectangle");
            System.out.println("1  Print the empty rectangle");
            System.out.println("2  Print the not empty rectangle");
            System.out.println("select the type of rectangle to draw");
            int chooseRact = kb.nextInt();
            while (chooseRact < 1 || chooseRact > 2) {
                System.out.printf("The number you entered is not valid, please re-enter it : ");
                chooseRact = kb.nextInt();
            }
            if (chooseRact == 1) {
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < width; j++) {
                        if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                            System.out.printf("* ");
                        } else {
                            System.out.printf("  ");
                        }
                    }
                    System.out.println();
                }

            } else {
                if (chooseRact == 2) {
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.printf("*" + " ");
                        }
                        System.out.println();
                    }
                }
            }


        } else {
            if (choose == 2) {
                System.out.println("Please enter the length of the triangle:");
                int lengthTri = kb.nextInt();
                System.out.println("Menu Triangle");
                System.out.println("1  Print the triangle botton-left ");
                System.out.println("2  Print the triangle botton-right ");
                System.out.println("3  Print the triangle top-left ");
                System.out.println("4  Print the triangle top-right ");
                System.out.println("select the type of triangle to draw : ");
                int chooseTri = kb.nextInt();
                while (chooseTri < 1 || chooseTri > 4) {
                    System.out.printf("The number you entered is not valid, please re-enter it : ");
                    chooseTri = kb.nextInt();
                }
                if (chooseTri == 1) {
                    for (int i = 0; i < lengthTri; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                } else {
                    if (chooseTri == 2) {
                        for (int i = lengthTri; i > 0; i--) {
                            for (int j = 0; j <= lengthTri; j++) {
                                if (j >= i) {
                                    System.out.printf("* ");
                                } else {
                                    System.out.printf("  ");
                                }
                            }
                            System.out.println();
                        }
                    } else {
                        if (chooseTri == 3) {
                            for (int i = 0; i < lengthTri; i++) {
                                for (int j = 0; j < lengthTri - i; j++) {
                                    System.out.printf("* ");
                                }
                                System.out.println();
                            }
                        } else {
                            if (chooseTri == 4) {
                                for (int i = 0; i < lengthTri; i++) {
                                    for (int j = 0; j < lengthTri; j++) {
                                        if (j >= i) {
                                            System.out.printf("* ");
                                        } else {
                                            System.out.printf("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            } else {
                if (choose == 3) {
                    System.out.println("Please enter the length of the Isosceles triangle:");
                    int lengthTriIsosceles = kb.nextInt();
                    for (int i = 0; i < lengthTriIsosceles; i++) {
                        for (int j = 0; j < lengthTriIsosceles - i; j++) {
                            System.out.printf("  ");
                        }
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                } else {
                    if (choose == 4) {
                        System.out.printf("don't choose any picture");
                    }
                }
            }
        }
    }
}
