/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ADMIN
 */
public class GeneicType {
    public static <E extends Comparable<E>> void bubbleSort(E[] list){
        boolean flag = true;
        E temp;
        while (flag) { 
            flag = false;
            for (int j = 0; j < list.length-1; j++) {
                if(list[j].compareTo(list[j+1]) > 0){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    flag = true;
                } 
            }
        }
    } 
    public static <E> void showData(E[] list){
        for (E e : list) {
            System.out.println(e);
        } 
    } 
    public static void main(String[] args) {
        Integer[] numbers = {3,6,1,12,8,9,16,2,7};
        GeneicType.bubbleSort(numbers); 
        showData(numbers);
    }
    
}
