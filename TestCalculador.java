import javax.swing.JOptionPane;

public class TestCalculador extends Calculadora {
    public static void main(String[] args) {
         Calculadora calc = new Calculadora();
         CalculadoraCientifica cc = new CalculadoraCientifica();
         
         

         int op = Integer.parseInt(JOptionPane.showInputDialog
         ("1-soma(2 numeros)\n2-soma(3 numeros)\n3-Subtração\n4-Multiplicação\n5-Divisão"));

         double operando1 = Double.parseDouble(JOptionPane.
         showInputDialog("Qual é o primeiro operando"));

         double operando2 = Double.parseDouble(JOptionPane.
         showInputDialog("Qual é o segundo operando"));


         double resultado;

         if (op == 1){ 
            resultado = calc.soma(operando1, operando2); 
            JOptionPane.showMessageDialog(null,"O Resultado da soma é " + resultado);
         }
         else if (op == 2){ double operando3 = Double.parseDouble(JOptionPane.
            showInputDialog("Qual é o terceiro operando"));
            resultado = calc.soma(operando1, operando2, operando3); 
            JOptionPane.showMessageDialog(null,"O Resultado da soma é " + resultado);}

         else if (op == 3){
            resultado = calc.subtracao(operando1, operando2); 
            JOptionPane.showMessageDialog(null,"O Resultado da subtração é " + resultado);
         }
         else if (op == 4){
            resultado = calc.multiplicao(operando1, operando2); 
            JOptionPane.showMessageDialog(null,"O Resultado da multiplicação é " + resultado);
         }
         else if (op == 5){ 
            resultado = calc.divisao(operando1, operando2); 
            JOptionPane.showMessageDialog(null,"O Resultado da divisão é " + resultado);         
         }

         else{
            JOptionPane.showMessageDialog(null, "operaçao invalida");
         }
    }
}
