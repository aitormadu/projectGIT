/*
* Author: Madu 04/02/2020
*/
package projectgit;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Projectgit {

    public static void main(String[] args) {
    int dni = 12345678;
    char letter =  DNIletter(dni);
        System.out.println(dni+ ":"+letter);
    
    }
    
    private static char DNIletter(int dni){
        char letter='T';
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res=dni%23;
        letter = letters.charAt(res);
        return letter;
    }
    
    private static char DNIletter1(int dni){
        return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
    }
    
}
