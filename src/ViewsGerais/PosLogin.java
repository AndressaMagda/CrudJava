package ViewsGerais;
import CadastroViews.GerMembros;
import VendasViews.GerVenda;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PosLogin extends JFrame implements ActionListener{

    private GridBagLayout layout;
    private GridBagConstraints cons;
    private JButton bCadastro, bVenda, bSair;
    private String nome;
    
    public PosLogin(String login) {
        this.nome = login;
        this.tela2();
        JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema "); //Concatenar com o nome do usuario
    }
    
    public void tela2(){
        
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Bem vindo(a): " + this.nome); //Concatenar com o nome do usuario
        this.cons.insets = new Insets(10, 10, 10, 10);
        
        this.bCadastro = new JButton("Cadastro");
        this.bVenda = new JButton("Vendas");
        this.bSair = new JButton("Sair");
        
        this.insTela(0, this.bCadastro);
        this.insTela(1, this.bVenda);
        this.insTela(2, this.bSair);
        
        this.bCadastro.addActionListener(this);
        this.bVenda.addActionListener(this);
        this.bSair.addActionListener(this);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setResizable(false);
    }
    
    @Override
     public void actionPerformed(ActionEvent e) {
         if(e.getSource()==this.bCadastro){
             super.setVisible(false);
             GerMembros gm = new GerMembros();
         }
         else if(e.getSource()==this.bVenda){
             super.setVisible(false);
             GerVenda gv = new GerVenda();
         }
         else if(e.getSource()==this.bSair){
             System.exit(0);
         }
     }
    
    public void insTela(int coluna, JButton but){
        this.cons.gridy = 0;
        this.cons.gridx = coluna;
        this.layout.setConstraints(but, this.cons);
        but.setPreferredSize(new Dimension(100, 25));
        super.getContentPane().add(but);
    }
    
}
