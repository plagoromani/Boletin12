
package bol12.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Factura {
     
    private float factura;
    private float cartosRecibidos;
    private float cartosDevoltos;
    
    public Factura(float factura,float cartosRecibidos,float cartosDevoltos){
        this.factura=factura;
        this.cartosRecibidos=cartosRecibidos;
        this.cartosDevoltos=cartosDevoltos;
    }
    Garaje obx=new Garaje();
    
    public float factura(){
        tiempo1 obx=new tiempo();
        
        if(tiempo<=3){
            factura=1.5f;
        }else{
            float tiempo2 = (tiempo1-3);
            factura = (float) (1.5+(0.2*tiempo2));
        }
        return factura;
    }
    public float cartosRecibidos(){
        return cartosRecibidos=Float.parseFloat(JOptionPane.showInputDialog("Introduzca cartos"));
    }
    public float cartosDevoltos(){
        return cartosDevoltos=Factura-cartosRecibidos;
    }
}
