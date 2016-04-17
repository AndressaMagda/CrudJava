package CadastroViews;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CadMemb extends JFrame{
    
    private JLabel tipMem;
    private JComboBox boxMem; 
    private JButton bAvancar, bVoltar;
    private GridBagLayout layout;
    private GridBagConstraints cons;
    
    public CadMemb(){
        this.tela();
    }
    
    public void tela(){
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Gerenciamento de Membros");
        
        this.tipMem = new JLabel("Tipos Membros: ");
        
        this.boxMem = new JComboBox();
        this.boxMem.addItem("");
        this.boxMem.addItem("Usuario");
        this.boxMem.addItem("Cliente");
        this.boxMem.addItem("Membro");
        this.boxMem.setEditable(false);
        
        this.bAvancar = new JButton("Avancar");
        this.bVoltar = new JButton("Voltar");
        
        this.cons.insets = new Insets(10, 10, 10, 10);
        
        this.setGrid(0, 0);
        this.layout.setConstraints(this.tipMem, this.cons);
        this.tipMem.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(this.tipMem);
        
        this.setGrid(0, 1);
        this.layout.setConstraints(this.boxMem, this.cons);
        this.boxMem.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(this.boxMem);
        
        this.setGrid(1, 0);
        this.layout.setConstraints(this.bAvancar, this.cons);
        this.bAvancar.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(this.bAvancar);
        
        this.setGrid(1, 1);
        this.layout.setConstraints(this.bVoltar, this.cons);
        this.bVoltar.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(this.bVoltar);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);  
        
    }
    
    
    public void setGrid(int linha, int coluna){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
    }
    
}
