package ss13_search_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LongestAscendingSequence {
    String string;

    public void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        string=kb.nextLine();
    }
    public void ascendingSeries(){
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character>linkedList = new LinkedList<>();
            linkedList.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if(string.charAt(j)>linkedList.getLast()){
                    linkedList.add(string.charAt(j));
                }
            }
            if(linkedList.size()>max.size()){
                max.clear();
                max.addAll(linkedList);
            }
            linkedList.clear();
        }
        for (Character e:max) {
            System.out.print(" " + e);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LongestAscendingSequence longestAscendingSequence= new LongestAscendingSequence();
        longestAscendingSequence.input();
        longestAscendingSequence.ascendingSeries();
    }
}
