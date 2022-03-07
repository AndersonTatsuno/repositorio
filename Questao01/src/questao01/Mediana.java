/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import java.util.Arrays;

/**
 *
 * @author AndersonTatsuno
 */
public class Mediana { 
    int[] arr = {9,2,1,4,6};
    int m;
    
    void  mediana(){
        
        Arrays.sort(arr);
        m = arr.length / 2;
        
        System.out.println("Saída: " + arr[m]);
    }
    
}
