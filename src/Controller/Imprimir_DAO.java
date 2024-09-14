/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author mathe
 */
public class Imprimir_DAO {

    public static void ImprimirSenha() {
        String ultimatePreferentialKey = Controller.Gerar_senha_DAO.ultimatePreferentialKey;
        String ultimateCommonKey = Controller.Gerar_senha_DAO.ultimateCommonKey;

        /*Arrumando o sistema de Data*/
        Date now = new Date();
        String recebe = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);

        Frame f = new Frame("Imp");
        Toolkit tk = f.getToolkit();
        PrintJob pj = tk.getPrintJob(f, "Recibo", null);
        if (pj != null) {
            Graphics m = pj.getGraphics();
            /*Alterando dados da impressão*/
            m.drawString("CEAP - 3SIT - Sistema de senhas", 1, 60);
            m.drawString("Senha Preferencial:" + ultimatePreferentialKey, 1, 80);
            m.drawString("Senha:" + ultimateCommonKey, 1, 100);
            m.drawString("Data: " + recebe, 0, 120);
            m.drawString("Feito por Matheus Faustino e Pedro Cabral", 1, 140);

            m.dispose();
            m.finalize();
            pj.end();
            pj.finalize();
        }
        f.dispose();
    }
}
