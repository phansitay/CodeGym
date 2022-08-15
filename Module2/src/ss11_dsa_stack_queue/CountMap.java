package ss11_dsa_stack_queue;

import java.util.*;

public class CountMap {
    Map<Character, Integer> treeMap = new TreeMap<>();
    String string;


    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        string = kb.nextLine();
    }

    public void output() {
        System.out.println("Chuôi la : " + string);
    }

    public void countMap() {
        string = string.toLowerCase(Locale.ROOT);
        int newvalue = 1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                if (treeMap.containsKey(string.charAt(i))) {
                    treeMap.put(string.charAt(i), treeMap.get(string.charAt(i)) + 1);
                } else {
                    treeMap.put(string.charAt(i), newvalue);
                }
            }
        }
    }

    public void outputTreeMap() {
        Set<Character> keys = treeMap.keySet();
        for (Character key : keys) {
            System.out.println("Key: " + key + ": " + treeMap.get(key));
        }
    }

    public static void main(String[] args) {
        CountMap countMap = new CountMap();
        countMap.input();
        countMap.output();
        countMap.countMap();
        countMap.outputTreeMap();
    }
}
