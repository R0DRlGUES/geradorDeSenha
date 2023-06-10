package com.mycompany.geradordesenha;

import java.util.Random;

/**
 *
 * @author PEDRO
 */
public class SenhasMedias extends Senhas {

    @Override
    void senhasMedia(int tamanho) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-=/;.?!@#$%&*";
        Random r = new Random();
        if (verificaTamanho(tamanho)) {
            StringBuilder senha = new StringBuilder();
            for (int i = 0; i < tamanho; i++) {
                int posicao = r.nextInt(chars.length());
                senha.append(chars.charAt(posicao));
            }
            System.out.println("Senha Gerada: "+senha.toString());
        }
    }
    public boolean verificaTamanho(int tamanho) {
        boolean retunrVerificaTamanho = false;
        if (tamanho >= 8) {
            retunrVerificaTamanho = false;
            System.out.println("Tamanho de senha Não compativel com o Item selecionado");
        } else if (tamanho <= 4) {
            retunrVerificaTamanho = false;
            System.out.println("Tamanho de senha Não compativel com o Item selecionado");

        } else {
            retunrVerificaTamanho = true;
        }

        return retunrVerificaTamanho;
    }

}
