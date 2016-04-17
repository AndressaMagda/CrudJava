package VendasViews;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GerVenda extends JFrame{

    private GridBagLayout layout;
    private GridBagConstraints cons;    
    private JButton bInserir, bRemover, bListar, bVoltar;
    
    public GerVenda() {
        this.tela3();
    }
    
    public void tela3(){
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Gerencia de Vendas");
        this.cons.insets = new Insets(10, 10, 10, 10);
        
        this.bInserir = new JButton("Inserir");
        this.bRemover = new JButton("Remover");
        this.bListar = new JButton("Listar");
        this.bVoltar = new JButton("Voltar");
        
        this.insTela(0, this.bInserir);
        this.insTela(1, this.bRemover);
        this.insTela(2, this.bListar);
        this.insTela(3, this.bVoltar);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setResizable(false);
        
    }
    
    public void insTela(int coluna, JButton but){
        this.cons.gridy = 0;
        this.cons.gridx = coluna;
        this.layout.setConstraints(but, this.cons);
        but.setPreferredSize(new Dimension(100, 25));
        super.getContentPane().add(but);
    }
    
}
