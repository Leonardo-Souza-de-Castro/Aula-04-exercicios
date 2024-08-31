package com.mycompany.aula04ex02;

public class Matematica {
    public static int max3(int v1, int v2, int v3){
        if (v1 > v2 && v1 > v3) {
            return v1;
        }
        else if(v2 > v1 && v2 > v3){
            return v2;
        }
        else{
            return v3;
        }
    }
    
    public static String impar(boolean v1, boolean v2, boolean v3){
        int count = 0;
        
        if (v1) {
            count = count + 1;
        }
        if (v2) {
            count = count + 1;
        }
        if (v3) {
            count = count + 1;
        }
        
        return count % 2 != 0? "Verdadeiro" : "Falso";
    }
    //Professor permitiu a utilização de comparador ternario neste método
    public static String maioria(boolean v1, boolean v2, boolean v3){
        return  v1 && v2? "Verdadeiro" : v1 && v3? "Verdadeiro" : 
                v2 && v3? "Verdadeiro": "Falso";
    }
}
