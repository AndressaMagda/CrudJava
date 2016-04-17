package CadastroViews;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadCliente extends JFrame{
    
        private GridBagLayout layout;
        private GridBagConstraints cons;
        private JButton butIns, butVolt;
        private JLabel lbNome, lbCpf, lbDNasc, lbTipo;
        private JTextField txtNome, txtCpf, txtDNasc;
        private JComboBox comBox, combTip;

        public CadCliente() {
            this.tela();
        }

        public void tela(){
            this.layout = new GridBagLayout();
            this.cons = new GridBagConstraints();

            super.getContentPane().setLayout(this.layout);
            super.setTitle("Gerenciamento de Membros");

            this.cons.insets = new Insets(10, 10, 10, 10);

            this.comBox = new JComboBox();
            this.comBox.addItem("");
            this.comBox.addItem("Usuario");
            this.comBox.addItem("Cliente");
            this.comBox.addItem("Funcionario");
            this.comBox.setSelectedIndex(2);
            this.comBox.setEnabled(false);
            //Deixar-lo com a opcão marcada como USUARIO da tela anterior


            this.lbNome = new JLabel("Nome: ");
            this.lbCpf = new JLabel("CPF: ");
            this.lbDNasc = new JLabel("Data Nascimento: ");
            this.lbTipo = new JLabel("Tipo: ");

            this.txtNome = new JTextField();
            this.txtCpf = new JTextField();
            this.txtDNasc = new JTextField("dd/MM/yyyy");
            
            this.combTip = new JComboBox();
            this.combTip.addItem("");
            this.combTip.addItem("Prospect"); // cliente que possua a intenção de comprar da sua empresa
            this.combTip.addItem("Shopper"); // visitam seu estabelecimento pelo menos 1 vez.
            this.combTip.addItem("Eventual"); // Compram sem fidelidade, com um ou mais produtos em situações de necessidade ou necessidade ocasional.
            this.combTip.addItem("Regular"); // próximos da fidelidade, compram determinado produto periodicamente;
            this.combTip.addItem("Defensor"); // Seja por satisfação ou insatisfação, divulgam a marca da empresa e sua experiência com o produto para terceiros.

            this.butVolt = new JButton("Voltar");
            this.butIns = new JButton("Inserir");

            this.insTela(0, 0, this.comBox);

            this.insTela(1, 0, this.lbNome);
            this.insTela(1, 1, this.txtNome);

            this.insTela(2, 0, this.lbCpf);
            this.insTela(2, 1, this.txtCpf);
            
            this.insTela(3, 0, this.lbDNasc);
            this.insTela(3, 1, this.txtDNasc);

            this.insTela(4, 0, this.lbTipo);
            this.insTela(4, 1, this.combTip);

            this.insTela(5, 0, this.butVolt);
            this.insTela(5, 1, this.butIns);

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
            lb.setPreferredSize(new Dimension(110, 15));
            super.getContentPane().add(lb);
        }

        public void insTela(int linha, int coluna, JTextField txt){
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
