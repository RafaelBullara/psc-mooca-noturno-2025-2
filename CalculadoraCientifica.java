import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora {

        
    
    public CalculadoraCientifica(){
        modelo = " ix35";

        JOptionPane.showMessageDialog(null, "Calculadora Cientifica" + modelo);

    }
    
     public void mensagem(){
        JOptionPane.showMessageDialog(null, "O modelo dessa calculadora é" + modelo);
        
       
     }

     public void subtracao(){

     }
      @Override
     public double subtracao(double a, double b){
        double resultado = a - b;
        return resultado;
     }

}
