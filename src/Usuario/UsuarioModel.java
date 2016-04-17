package Usuario;
import Pessoa.Pessoa;
import Pessoa.PessoaException;

public class UsuarioModel extends Pessoa{
    
    private String nome, cpf, dNascimento, login, senha;

    public UsuarioModel(String nome, String cpf, String dNascimento, String login, String senha) throws PessoaException{
        super(nome, cpf, dNascimento);
        this.setLogin(login);
        this.setSenha(senha);
    }
    
    public UsuarioModel(String nome, String cpf, String login, String senha) throws PessoaException {
        super(nome, cpf);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
    
    
}
