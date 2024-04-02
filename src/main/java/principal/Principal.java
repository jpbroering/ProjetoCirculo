package principal;

import javax.swing.JOptionPane;
import model.Circulo;

public class Principal { 
    public static void main(String[] args) {
        Circulo cirl = new Circulo();
        
        cirl.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Qual a area do circulo?")));
        JOptionPane.showMessageDialog(null,"A área do circulo é "+cirl.getArea());
    }
}