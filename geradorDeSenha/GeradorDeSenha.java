package com.mycompany.geradordesenha;

import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO
 */
public class GeradorDeSenha extends Senhas {

    public static void main(String[] args) {
        int opcao = -1;
        while (opcao != 0) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "===== Gerador de senhas do Pedro ======\n"
                    + "1 - Senha Pequena (3 a 5  caracteres)\n"
                    + "2 - Senha Media   (5 a 7  caracteres)\n"
                    + "3 - Senha Longa   (7 a 10 caracteres)\n"
                    + "0 - Sair"));

            if (opcao == 1) {
                int tamnhaSenhas;
                tamnhaSenhas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha entre uma senha de 3 a 5 caractesr"));

                Senhas senha = new SenhasSimples();
                senha.senhasSimples(tamnhaSenhas);

            } else if (opcao == 2) {
                int tamnhaSenhas;
                tamnhaSenhas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha entre uma senha de 5 a 7 caractesr"));
                Senhas senha = new SenhasMedias();
                senha.senhasMedia(tamnhaSenhas);
            } else if (opcao == 3) {
                int tamnhaSenhas;
                tamnhaSenhas = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha entre uma senha de 7 a 10 caractesr"));
                Senhas senha = new SenhasLongas();
                senha.senhasLonga(tamnhaSenhas);
            } else if (opcao == 0) {
                System.out.println("Volte Sempre! Ü");
                break;
            }

        }
    }
}
