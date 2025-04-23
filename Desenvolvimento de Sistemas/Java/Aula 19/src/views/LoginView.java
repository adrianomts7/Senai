package src.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import src.controller.controleLogin;

public class LoginView extends JFrame {

    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private controleLogin controle;

    public LoginView() {
        super("Tela de Login");
        controle = new controleLogin(); // Cria o controlador

        // Layout de 3 linhas e 2 colunas
        setLayout(new GridLayout(3, 2, 10, 10));

        campoLogin = new JTextField();
        campoSenha = new JPasswordField();
        botaoEntrar = new JButton("Entrar");

        add(new JLabel("Login:"));
        add(campoLogin);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(new JLabel(""));
        add(botaoEntrar);

        // Ação do botão "Entrar"
        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = campoLogin.getText();
                String senha = new String(campoSenha.getPassword());

                // Verifica se os campos estão vazios
                if (login.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha ambos os campos.");
                    return;
                }

                // Chama o controller para autenticar
                if (controle.autenticar(login, senha)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login inválido.");
                }
            }
        });

        // Configurações da janela
        setSize(300, 150);
        setLocationRelativeTo(null); // Centraliza a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // Mostra a janela
    }

    public static void main(String[] args) {
        // Cria a interface de login
        new LoginView();
    }
}
