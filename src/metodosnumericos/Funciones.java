
package metodosnumericos;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;


public class Funciones {

    JEP j = new JEP();
    JEP g = new JEP();
/**
 * 
 * @param def  la funcion ingresada como String de la que se desea btener la raiz
 */
    public Funciones(String def,String gx) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
         j.setImplicitMul(true);
        j.parseExpression(def);
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        
         g.addVariable("x", 0);
        g.addStandardConstants();
        g.addStandardFunctions();
         g.setImplicitMul(true);
        g.parseExpression(gx);
        if (g.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }  
    
    }
    
    /**
     * 
     * @param x punto en el que se evaluara la funcion
     * @return retorna el valor de la funcion evaluada en el punto x
     */
    public double eval(double x){
        double r;
        j.addVariable("x",x);
        r=j.getValue();
        if (j.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        return r;     
    }
    
   
    /**
     * el metodo evaluar_gx evalua el valor de la funcion redefinina g(x) en el punto x
     * @param x 
     * @return  
     */    
     public double evaluar_gx(double x){
        double r;
        g.addVariable("x",x);
        r=g.getValue();
        if (g.hasError()) {
            JOptionPane.showMessageDialog(null, " error  al convertir la funcion");
        }
        return r;     
    }
    
}
