/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_05_4_poo;

import java.util.Scanner;

/**
 *
 * @author USER 17
 */
public class Ejemplo_05_4_POO {

  public static void main(String[] args) {
        // TODO code application logic here
        // se declara la variable para leer datos del teclado
        Scanner leer = new Scanner(System.in);
        int cant; // cantidad de estudiantes
        String nom, cod; // variables para nombre y codigo
        int eda, edm, edd; // variable para edad
        Edad ed;

        while (true) {  // ingreso de la cantidad que debe ser positiva
            System.out.print("Ingrese la cantidad de estudiantes: ");
            cant = leer.nextInt(); // se lee del teclado
            if (cant > 0) // si la cantidad es positiva se sale del ciclo
            {
                break;
            } else {
                System.out.println("ERROR... la cantidad debe ser positiva");
            }
        } // fin de while de ingresar cantidad
        leer.nextLine(); // se consume el ENTER del numero ingresado
        
        Estudiante est[] = new Estudiante[cant]; // se crea el array de objetos con la cantidad de estudiantes
        // ingreso de datos
        for (int x = 0; x < cant; x++) {
            System.out.print("Ingrese nombre: ");
            nom = leer.nextLine();
            System.out.print("Ingrese codigo: ");
            cod = leer.nextLine();
            while (true) { // ciclo para que la edad en años sea positiva
                System.out.print("Inrese la edad en años: ");
                eda = leer.nextInt();
                if (eda >= 0) // si la cantidad es positiva se sale del ciclo
                {
                    break;
                } else {
                    System.out.println("ERROR... la edad en años debe ser mayor o igual a CERO");
                }
            } //fin de ingreso de edad en meses
             while (true) { // ciclo para que la edad en meses sea positiva
                System.out.print("Inrese la edad en meses: ");
                edm = leer.nextInt();
                if (edm >= 0 && edm<=12 ) // si la cantidad es positiva se sale del ciclo
                {
                    break;
                } else {
                    System.out.println("ERROR... la edad en meses debe ser mayor o igual a CERO");
                }
            } //fin de ingreso de edad en dias
              while (true) { // ciclo para que la edad en dias sea positiva
                System.out.print("Inrese la edad en dias: ");
                edd = leer.nextInt();
                if (edd >= 0&& edd<=31) // si la cantidad es positiva se sale del ciclo
                {
                    break;
                } else {
                    System.out.println("ERROR... la edad debe ser mayor o igual a CERO");
                }
            } //fin de ingreso de edad en dias
            leer.nextLine(); // se consume el ENTER del numero ingresado
            // se almacenan los datos ingresado en los objetos
            //ed = new Edad(eda, edm, edd);
            //est[x] = new Estudiante(nom, cod, ed); // se crea el objeto con los datos ingresados
            est[x] = new Estudiante(nom, cod, new Edad(eda, edm, edd));
            
        } // fin de for de ingreso de datos
        
        //salida de datos
        System.out.println("LOS DATOS INGRESADOS SON");
    for (int x = 0; x < cant; x++) {
            System.out.println(" "+est[x]);
        } // fin de salida de datos
   
        }
    
        }
    
  
    
