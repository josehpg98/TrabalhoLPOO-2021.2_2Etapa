/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cc.lpoo.cv.gui.funcionario;

import br.edu.ifsul.cc.lpoo.cv1.Controle;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author José Henrique PG
 */
public class JPanelFuncionario extends JPanel {

    private CardLayout cardLayout;
    private Controle controle;

    public JPanelFuncionario(Controle controle) {

        this.controle = controle;
        initComponents();
    }

    private void initComponents() {

        cardLayout = new CardLayout();
        this.setLayout(cardLayout);

    }

    public void showTela(String nomeTela) {

        cardLayout.show(this, nomeTela);
    }

    /**
     * @return the controle
     */
    public Controle getControle() {
        return controle;
    }
}
