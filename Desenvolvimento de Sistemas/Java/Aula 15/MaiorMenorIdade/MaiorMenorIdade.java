package MaiorMenorIdade;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {
    public static void main(String[] args) {
        String i = JOptionPane.showInputDialog("Digite a sua idade: ");

        int idade = Integer.parseInt(i);

        if(idade < 18){
            JOptionPane.showMessageDialog(null, "Menor de idade", "Maior ou menor de idade", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Maior de idade", "Maior ou menor de idade", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
