/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Gerar_senha_DAO {

    public static ArrayList<String> commonKeys = new ArrayList<>();
    public static ArrayList<String> preferentialKeys = new ArrayList<>();
    public static String ultimateCommonKey = "";
    public static String ultimatePreferentialKey = "";

    public static void SenhaComum() {
        /* Número Aleatório de 0 à 999 */
        Random key = new Random();
        String newKey = "  AC-" + (key.nextInt(999)) + "\n\r";

        /*Adicionando a senha à lista de senhas*/
        commonKeys.add(newKey);
        String arrayKeys = "";

        /*Salvando a senha para a impressão*/
        ultimateCommonKey = newKey;

        for (String k : commonKeys) {
            arrayKeys += k;

        }

        /*Mostrando na tela*/
        View.Inicio_GUI.common_key_txt.setText(arrayKeys);

    }

    public static void SenhaPreferencial() {
        /* Número Aleatório de 0 à 999 */
        Random key = new Random();
        String newKey = "  AP-" + (key.nextInt(999)) + "\n\r";

        /*Salvando a senha para a impressão*/
        ultimatePreferentialKey = newKey;

        /*Adicionando a senha à lista de senhas*/
        preferentialKeys.add(newKey);
        String arrayKeys = "";

        for (String k : preferentialKeys) {
            arrayKeys += k;
        }

        /*Mostrando na tela*/
        View.Inicio_GUI.preferential_key_txt.setText(arrayKeys);

    }
}
