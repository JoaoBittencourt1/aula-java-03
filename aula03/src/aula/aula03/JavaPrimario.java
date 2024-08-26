package aula.aula03;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class JavaPrimario {
    public static void main(String[] args) {
        JavaTeste j1 = new JavaTeste();
        JOptionPane.showMessageDialog(null, "digite o nome, desconto, e preco");
        j1.nome = JOptionPane.showInputDialog("qual nome");
        j1.desconto = Double.parseDouble(JOptionPane.showInputDialog("qual desconto(ex:0.15)"));
        j1.preco = Double.parseDouble(JOptionPane.showInputDialog("qual o preco normal"));

        Double TotalDesconto = j1.preco *(1 - j1.desconto );

        JOptionPane.showMessageDialog(null,"seu valor normal: "+ j1.preco+ "\no valor com desconto: "+TotalDesconto);
    }
}
