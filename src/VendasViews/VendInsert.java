package VendasViews;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VendInsert extends JFrame{
    
    private GridBagLayout layout;
    private GridBagConstraints cons;
    private JButton bVoltar, bCadVenda;
    private JLabel nomeFun, nomeCli, nomePro, pagam;
    private JComboBox combFun, combCli;
    private JTextField txtProd, txtPag;

    public VendInsert() {
        this.tela4();
    }
    
    public void tela4(){
        
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Gerencia de Vendas");
        this.cons.insets = new Insets(10, 10, 10, 10);
        
        this.nomeFun = new JLabel("Nome do Funcionario: ");
        this.nomeCli = new JLabel("Nome do Cliente: ");
        this.nomePro = new JLabel("Nome do Produto: ");
        this.pagam = new JLabel("Pagamento: ");
        
        this.combFun = new JComboBox();
        // Colocar no comboBox os nomes dos funcionario cadastrados
        
        this.combCli = new JComboBox();
        // Colocar no comboBox os nomes dos clientes cadastrados
        
        this.combFun.setEditable(false);
        this.combCli.setEditable(false);
        
        this.txtProd = new JTextField();
        this.txtPag = new JTextField();
        
        this.bVoltar = new JButton("Voltar");
        this.bCadVenda = new JButton("Cadastrar Venda");
        
        this.insTela(0, 0, this.nomeFun);
        this.insTela(0, 1, this.combFun); //Lista o nome dos func cadastrados
        this.insTela(1, 0, this.nomeCli);
        this.insTela(1, 1, this.combCli); //Lista o nome dos clien cadastrados
        this.insTela(2, 0, this.nomePro);
        this.insTela(2, 1, this.txtProd);
        this.insTela(3, 0, this.pagam);
        this.insTela(3, 1, this.txtPag);
        this.insTela(4, 0, this.bVoltar);
        this.insTela(4, 1, this.bCadVenda);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);  
    }
    
    public void insTela(int linha, int coluna, JLabel lb){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        this.layout.setConstraints(lb, this.cons);
        lb.setPreferredSize(new Dimension(130, 15));
        super.getContentPane().add(lb);
    }
    
    public void insTela(int linha, int coluna, JTextField txt){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        this.layout.setConstraints(txt, this.cons);
        txt.setPreferredSize(new Dimension(300, 30));
        super.getContentPane().add(txt);
    }
    public void insTela(int linha, int coluna, JPasswordField txt){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        this.layout.setConstraints(txt, this.cons);
        txt.setPreferredSize(new Dimension(300, 30));
        super.getContentPane().add(txt);
    }
    
    public void insTela(int linha, int coluna, JButton but){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        cons.anchor = GridBagConstraints.SOUTHEAST;
        this.layout.setConstraints(but, this.cons);
        but.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(but);
    }
    
    public void insTela(int linha, int coluna, JComboBox comb){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        cons.anchor = GridBagConstraints.WEST;
        this.layout.setConstraints(comb, this.cons);
        comb.setPreferredSize(new Dimension(130, 25));
        super.getContentPane().add(comb);
    }
    
}
