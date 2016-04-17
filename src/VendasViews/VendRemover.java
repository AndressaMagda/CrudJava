package VendasViews;
import javax.swing.JOptionPane;

public class VendRemover {
    
    private String id;
    
    public VendRemover() {
        this.tela();
    }
    
    public void tela(){
        this.id = null;
        this.id = JOptionPane.showInputDialog("Digite o ID da Venda");
    }
}
