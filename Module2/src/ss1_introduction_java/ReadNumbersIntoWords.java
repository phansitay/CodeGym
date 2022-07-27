package ss1_introduction_java;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Mời bạn nhập một số : ");
        int number = kb.nextInt();
        while (number < 0) {
            System.out.printf("Số bạn nhập bé hơn không mời bạn nhập lại : ");
            number = kb.nextInt();
        }

        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.printf("Zero");
                    break;
                case 1:
                    System.out.printf("One");
                    break;
                case 2:
                    System.out.printf("Two");
                    break;
                case 3:
                    System.out.printf("Three");
                    break;
                case 4:
                    System.out.printf("Four");
                    break;
                case 5:
                    System.out.printf("Five");
                    break;
                case 6:
                    System.out.printf("Six");
                    break;
                case 7:
                    System.out.printf("Seven");
                    break;
                case 8:
                    System.out.printf("Eight");
                    break;
                case 9:
                    System.out.printf("Nine");
                    break;
                default:
                    System.out.printf("out of ability");
            }
        } else {
            if (number < 20) {
                switch (number % 10) {

                    case 0:
                        System.out.printf("Ten");
                        break;
                    case 1:
                        System.out.printf("Eleven");
                        break;
                    case 2:
                        System.out.printf("Twelve");
                        break;
                    case 3:
                        System.out.printf("Thirteen");
                        break;
                    case 4:
                        System.out.printf("Fourteen");
                        break;
                    case 5:
                        System.out.printf("Fifteen");
                        break;
                    case 6:
                        System.out.printf("Sixteen");
                        break;
                    case 7:
                        System.out.printf("Seventeen");
                        break;
                    case 8:
                        System.out.printf("Eighteen");
                        break;
                    case 9:
                        System.out.printf("Nineteen");
                        break;
                    default:
                        System.out.printf("out of ability");
                }
            } else {
                if (number < 100) {
                    switch (number / 10) {
                        case 2:
                            System.out.printf("tᴡentу");
                            break;
                        case 3:
                            System.out.printf("thirtу");
                            break;
                        case 4:
                            System.out.printf("fortу");
                            break;
                        case 5:
                            System.out.printf("fiftу");
                            break;
                        case 6:
                            System.out.printf("ѕiхtу");
                            break;
                        case 7:
                            System.out.printf("ѕeᴠentу");
                            break;
                        case 8:
                            System.out.printf("eightу");
                            break;
                        case 9:
                            System.out.printf("ninetу");
                            break;
                        default:
                            System.out.printf("out of ability");
                    }
                    switch (number % 10) {
                        case 1:
                            System.out.printf(" One");
                            break;
                        case 2:
                            System.out.printf(" Two");
                            break;
                        case 3:
                            System.out.printf(" Three");
                            break;
                        case 4:
                            System.out.printf(" Four");
                            break;
                        case 5:
                            System.out.printf(" Five");
                            break;
                        case 6:
                            System.out.printf(" Six");
                            break;
                        case 7:
                            System.out.printf(" Seven");
                            break;
                        case 8:
                            System.out.printf(" Eight");
                            break;
                        case 9:
                            System.out.printf(" Nine");
                            break;
                        default:
                            System.out.printf(" ");
                    }
                } else {
                    if (number < 1000) {
                        switch (number / 100) {
                            case 1:
                                System.out.printf(" One hundred ");
                                break;
                            case 2:
                                System.out.printf(" Two hundred ");
                                break;
                            case 3:
                                System.out.printf(" Three hundred ");
                                break;
                            case 4:
                                System.out.printf(" Four hundred ");
                                break;
                            case 5:
                                System.out.printf(" Five hundred ");
                                break;
                            case 6:
                                System.out.printf(" Six hundred ");
                                break;
                            case 7:
                                System.out.printf(" Seven hundred ");
                                break;
                            case 8:
                                System.out.printf(" Eight hundred ");
                                break;
                            case 9:
                                System.out.printf(" Nine hundred ");
                                break;
                            default:
                                System.out.printf(" ");
                        }
                        if ((number % 100) / 10 == 1) {
                            switch ((number % 100) % 10) {

                                case 0:
                                    System.out.printf("and Ten");
                                    break;
                                case 1:
                                    System.out.printf("and Eleven");
                                    break;
                                case 2:
                                    System.out.printf("and Twelve");
                                    break;
                                case 3:
                                    System.out.printf("and Thirteen");
                                    break;
                                case 4:
                                    System.out.printf("and Fourteen");
                                    break;
                                case 5:
                                    System.out.printf("and Fifteen");
                                    break;
                                case 6:
                                    System.out.printf("and Sixteen");
                                    break;
                                case 7:
                                    System.out.printf("and Seventeen");
                                    break;
                                case 8:
                                    System.out.printf("and Eighteen");
                                    break;
                                case 9:
                                    System.out.printf("and Nineteen");
                                    break;
                                default:
                                    System.out.printf(" ");
                            }
                        } else {
                            switch ((number % 100) / 10) {
                                case 2:
                                    System.out.printf("and tᴡentу");
                                    break;
                                case 3:
                                    System.out.printf("and thirtу");
                                    break;
                                case 4:
                                    System.out.printf("and fortу");
                                    break;
                                case 5:
                                    System.out.printf("and fiftу");
                                    break;
                                case 6:
                                    System.out.printf("and ѕiхtу");
                                    break;
                                case 7:
                                    System.out.printf("and ѕeᴠentу");
                                    break;
                                case 8:
                                    System.out.printf("and eightу");
                                    break;
                                case 9:
                                    System.out.printf("and ninetу");
                                    break;
                                default:
                                    System.out.printf("");
                            }
                            switch ((number % 100) % 10) {
                                case 1:
                                    System.out.printf(" One");
                                    break;
                                case 2:
                                    System.out.printf(" Two");
                                    break;
                                case 3:
                                    System.out.printf(" Three");
                                    break;
                                case 4:
                                    System.out.printf(" Four");
                                    break;
                                case 5:
                                    System.out.printf(" Five");
                                    break;
                                case 6:
                                    System.out.printf(" Six");
                                    break;
                                case 7:
                                    System.out.printf(" Seven");
                                    break;
                                case 8:
                                    System.out.printf(" Eight");
                                    break;
                                case 9:
                                    System.out.printf(" Nine");
                                    break;
                                default:
                                    System.out.printf(" ");
                            }
                        }
                    }
                }
            }
        }
    }
}
