
package bol12.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class BOL122 {

   
    public static void main(String[] args) {
        Garajes obx=new Garajes();
        Factura obx2=new Factura();
        
        int respuesta;
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Sale o entra en el garaje?\nMarque 1 si quiere entrar\nMarque 2 si quiere salir.\nSi quiere cerrar el programa marque 3."));
        if (respuesta == 1) {

                obx.numeroPlazas();
            } else if (respuesta == 2) {
                obx.pedirMatricula();
                JOptionPane.showMessageDialog(null, "El precio es de: " +factura());
                cartosDevoltos();
                JOptionPane.showMessageDialog(null, "" + obx.toString());
                
            }
        } while (respuesta != 3);

    }
      
    }
    



            