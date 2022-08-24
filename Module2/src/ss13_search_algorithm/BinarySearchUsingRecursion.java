package ss13_search_algorithm;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public int binarySearch(int arr[],int left,int right,int value){
        while (left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==value){
                return mid;
            }else {
                if (value>arr[mid]){
                    return binarySearch(arr ,mid+1,right,value);
                }else {
                    return binarySearch(arr,left,mid-1,value);
                }
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        BinarySearchUsingRecursion binary= new BinarySearchUsingRecursion();
        int arrBinary[]={1,4,6,9,12,16,20,24,35,46};
        for (int i:arrBinary) {
            System.out.print(" "+i );
        }
        System.out.println();
        System.out.println("vt 16 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,16 ));
        System.out.println("vt 1 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,1 ));
        System.out.println("vt 24 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,24 ));
        System.out.println("vt 46 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,46 ));
        System.out.println("vt 0 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,0 ));
        System.out.println("vt 50 : "+binary.binarySearch(arrBinary,0,arrBinary.length-1,50 ));


    }
}
