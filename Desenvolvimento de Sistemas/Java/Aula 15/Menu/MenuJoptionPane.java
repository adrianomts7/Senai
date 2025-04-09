package Menu;
import javax.swing.JOptionPane;

public class MenuJoptionPane {
    public static void main(String[] args) {
        boolean executando = true;

        Cadastro c1 = new Cadastro();

        while (executando) {
            String opcao = JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:\n1 - Cadastrar\n2 - Listar\n3 - Sair",
                "Menu Principal",
                JOptionPane.QUESTION_MESSAGE
            );

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                break;
            }

            switch (opcao) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar.");
                    c1.cadastrar();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Você escolheu Listar.");
                    c1.listar();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        }
    }
}