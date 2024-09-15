/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Program {

    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }                
        }
    }
}
