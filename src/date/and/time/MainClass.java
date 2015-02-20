/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date.and.time;

import java.util.Calendar;
import java.util.Formatter;

/**
 *
 * @author Ilija
 */
public class MainClass {
public static void main(String args[]){
Formatter fmt= new Formatter();
Calendar cal= Calendar.getInstance();
fmt= new Formatter();
fmt.format("%tc",cal);
System.out.println(fmt);



 }
    
}
