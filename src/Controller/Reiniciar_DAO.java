/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author mathe
 */
public class Reiniciar_DAO {
    public static void Reload() {
        Controller.Gerar_senha_DAO.commonKeys.clear();
        Controller.Gerar_senha_DAO.preferentialKeys.clear();
        
        View.Inicio_GUI.common_key_txt.setText("");
        View.Inicio_GUI.preferential_key_txt.setText("");
    }
}
