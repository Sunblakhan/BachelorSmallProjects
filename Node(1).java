/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author ucs
 */
public class Node {
    int data;
    Node left; 
    Node right;
    
    Node(int data){
    this.data = data;
    left = right = null;
    }
}
