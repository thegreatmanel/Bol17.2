/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin172 {
   private int [] notas={7,8,5,3};
    private String [] nomes= {"Pablo","Alex","Brais","Adrian"};

   
   
   
   public  void llenararray(){
       for(int a=1; a<3;a++)
       {notas[a]=Integer.parseInt(JOptionPane.showInputDialog(null,"Nota del alumno"));
       nomes[a]=JOptionPane.showInputDialog(null, "Nombre del alumno");
       }
       
   }
   public void mostrar(){
       for(int a=1;a<3;a++)
       System.out.println(notas[a]+" "+nomes[a]);}
   
    public static void main(String[] args) {
        Boletin172 bol=new Boletin172();
        bol.llenararray();
        bol.mostrar();
        
    }
    
}
