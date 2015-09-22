/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class KATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("...");
        Person p1;
        //Date f; 
        //f = new Date(64, 7, 3);
        
        Calendar f;
        f = GregorianCalendar.getInstance();
        f.set(1964,7,3);
        
        p1 = new Person("Enrique", "Ramón", f);
        
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println(p1.getAge());
        System.out.println("...");
        System.out.println("Fin");
    }
}
