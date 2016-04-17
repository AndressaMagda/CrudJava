package CadastroViews;

import javax.swing.JOptionPane;

public class CadRemover {
    private String login;

    public CadRemover() {
        this.tela();
    }
    
    public void tela(){
        this.login = null;
        this.login = JOptionPane.showInputDialog("Digite um login a ser deletado");
    }
}
