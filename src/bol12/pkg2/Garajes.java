
package bol12.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Garajes {
    int numeroCoches;
    int matricula;
    public long tiempoEntrada;
    public long tiempoSalida;
    public long tiempo;
    
    public boolean numeroPlazas(){
     if(numeroCoches < 5){
         JOptionPane.showMessageDialog(null,"Hay" +(5-numeroCoches)+ "PLAZAS DISPONIBLES");
    return true;
    
    }else{
         JOptionPane.showMessageDialog(null,"COMPLETO");
         return false;
     }
}
    public void pedirMatricula(){
        matricula=Integer.parseInt(JOptionPane.showInputDialog("Introduce Matrícula"));
        
    }
    public long Entrada(){
        if(numeroPlazas()==true){
            tiempoEntrada=System.currentTimeMillis();
        }
        return tiempoEntrada;
    }

    public long Salida(){
        tiempoSalida=System.currentTimeMillis();
        return tiempoSalida;
    
}
    public long tiempo(){
    tiempo=(tiempoSalida-tiempoEntrada);
    return tiempo;
}

    @Override
    public String toString() {
        return "Garajes{" + "numeroCoches=" + numeroCoches + ", matricula=" + matricula + ", tiempoEntrada=" + tiempoEntrada + ", tiempoSalida=" + tiempoSalida + ", tiempo=" + tiempo + '}';
    }

  

        
        
    }
