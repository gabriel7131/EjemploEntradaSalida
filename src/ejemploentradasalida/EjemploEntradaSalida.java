/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploentradasalida;
import java.io.BufferedReader;
import java.io.InputStreamReader ;
import java.io.IOException;
//import java.io.
/**
 *
 * @author sopra steria
 */
public class EjemploEntradaSalida {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("escribe la variable :"+s);
    }
    
}
