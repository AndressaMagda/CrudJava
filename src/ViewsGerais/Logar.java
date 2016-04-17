package ViewsGerais;
import Pessoa.PessoaException;
import Usuario.UsuarioController;
import Usuario.UsuarioException;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Logar extends JFrame implements ActionListener{
    private GridBagLayout layout;
    private GridBagConstraints cons;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton blogar, blimpar;
    private JLabel lbLogin, lbSenha;
    
    public Logar(){
        this.tela1();
    }
    
    public void tela1(){
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Area de Login");
        this.cons.insets = new Insets(10, 10, 10, 10);
        
        this.lbLogin = new JLabel("Login: ");
        this.lbSenha = new JLabel("Senha: ");
        
        this.txtLogin = new JTextField();
        this.txtSenha = new JPasswordField();
        
        this.blogar = new JButton("Logar");
        this.blimpar = new JButton("Limpar");
        
        this.insTela(0, 0, this.lbLogin);
        this.insTela(0, 1, this.txtLogin);
        
        this.insTela(1, 0, this.lbSenha);
        this.insTela(1, 1, this.txtSenha);
        
        this.insTela(2, 0, this.blimpar);
        this.insTela(2, 1, this.blogar);
        
        this.blimpar.addActionListener(this);
        this.blogar.addActionListener(this);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.blimpar){
            this.txtLogin.setText(null);
            this.txtSenha.setText(null);
        }
        else if(e.getSource()==this.blogar){
            System.out.println("Apertou botao logar!!");
            try {
                String senha = new String(this.txtSenha.getPassword());
                System.out.println("Senha: "+senha);
                UsuarioController cont = new UsuarioController();
                super.setVisible(false);
                cont.validaLog(this.txtLogin.getText(), senha);
            } catch (PessoaException ex) {
                Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UsuarioException ex) {
                Logger.getLogger(Logar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insTela(int linha, int coluna, JLabel lb){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        cons.anchor = GridBagConstraints.WEST;
        this.layout.setConstraints(lb, this.cons);
        //lb.setPreferredSize(new Dimension(110, 15));
        super.getContentPane().add(lb);
    }
    
    public void insTela(int linha, int coluna, JTextField txt){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        this.layout.setConstraints(txt, this.cons);
        txt.setPreferredSize(new Dimension(170, 30));
        super.getContentPane().add(txt);
    }
    public void insTela(int linha, int coluna, JPasswordField txt){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        this.layout.setConstraints(txt, this.cons);
        txt.setPreferredSize(new Dimension(170, 30));
        super.getContentPane().add(txt);
    }
    
    public void insTela(int linha, int coluna, JButton but){
        this.cons.gridy = linha;
        this.cons.gridx = coluna;
        cons.anchor = GridBagConstraints.EAST;
        this.layout.setConstraints(but, this.cons);
        but.setPreferredSize(new Dimension(100, 25));
        super.getContentPane().add(but);
    }

}
