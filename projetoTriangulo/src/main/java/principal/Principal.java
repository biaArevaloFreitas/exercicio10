
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;


public class Principal {
    public static void main(String arge[]){
        Triangulo tril = new Triangulo();
        
      
        tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("digite o valor da base do triangulo ")));
        tril.setBase(Double.parseDouble(JOptionPane.showInputDialog("digite o valor da altura do triangulo ")));
      
        JOptionPane.showMessageDialog(null, "A area do tringulo é:" + tril.getArea());
    }
}
