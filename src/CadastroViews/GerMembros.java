package CadastroViews;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GerMembros extends JFrame{
    
    private JButton bCadMem, bRemUsu, bVoltar;
    private GridBagLayout layout;
    private GridBagConstraints cons;

    public GerMembros() {
        this.tela2();
    }
    
    public void tela2(){
        this.layout = new GridBagLayout();
        this.cons = new GridBagConstraints();
        
        super.getContentPane().setLayout(this.layout);
        super.setTitle("Gerenciamento de Membros");
        
        this.cons.insets = new Insets(5, 5, 5, 5);
        
        this.bCadMem = new JButton("Cadastrar Membro");
        this.bRemUsu = new JButton("Remover Usuario");
        this.bVoltar = new JButton("Voltar");
        
        
        this.insBotao(0, this.bCadMem);
        this.insBotao(1, this.bRemUsu);
        this.insBotao(2, this.bVoltar);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.pack();
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);  
        
    }
    
    public void insBotao(int linha, JButton bot){
        this.cons.gridy = linha;
        this.cons.gridx = 0;
        this.layout.setConstraints(bot, this.cons);
        bot.setPreferredSize(new Dimension(300, 35));
        super.getContentPane().add(bot);
    }
}
