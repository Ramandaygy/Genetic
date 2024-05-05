/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ADMIN
 */
public class MyGenericTest {
    public static void main(String[] args) {
    MyGeneric<Integer> iOb = new MyGeneric<>(88);
    iOb.showType();
    int v = iOb.getob();
    System.out.println("value : "+v); 
    System.out.println();
    MyGeneric<String> strOb = new MyGeneric<>("Generic Test");
    String v2 = strOb.getob();
    strOb.showType();
    System.out.println("value: "+ v2);
    System.out.println(); 
    //Integer i = (Integer) strOb.getob(); 
    //Error: cannot cast from String to Integer
    }
    
}

