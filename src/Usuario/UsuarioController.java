package Usuario;

import Pessoa.PessoaException;
import ViewsGerais.Logar;
import ViewsGerais.PosLogin;
import java.util.ArrayList;

public class UsuarioController{
    private static ArrayList<UsuarioModel> usuarios = new ArrayList<>();
    private Logar log;

    public UsuarioController() throws PessoaException{
        this.setAdmin();
        this.log = new Logar();
        
    }
    
    public void setAdmin() throws PessoaException{
        UsuarioModel admin;
        admin = new UsuarioModel("Andressa", "01234567890", "23/06/1992", "And", "123");
        UsuarioController.usuarios.add(0, admin);
    }
    
    public void addUsuario(UsuarioModel user) throws UsuarioException{
        int index=1;
        if(this.noRepeat(user.getLogin())){
            usuarios.add(index, user);
            index++;
        }
        else
            throw new UsuarioException("Login ja existente, tente novamente");
    }
    
    public void remUsuario(int id) throws UsuarioException{
        if(UsuarioController.usuarios.size()>=id)
            UsuarioController.usuarios.remove(id);
        else
            throw new UsuarioException("ID invalido!!");
    }
    
    public void validaLog(String login, String senha) throws UsuarioException{
        System.out.println("Inicio do Valida controle");
        int pos = this.buscLogin(login);
        System.out.println("Posição do Login"+pos);
        if(pos >=0){
            if(login.equals(UsuarioController.usuarios.get(pos).getLogin()) && senha.equals(UsuarioController.usuarios.get(pos).getSenha())){
                System.out.println("Login e senha verificados");
                log.setVisible(false);
                PosLogin ps;
                ps = new PosLogin(UsuarioController.usuarios.get(pos).getNome());
            }
            else
                throw new UsuarioException("Impossivel logar, tente novamente");
        }
    }
    
    public int buscLogin(String login) throws UsuarioException{ // retorna a posição do dado login
        System.out.println("Inicio BuscLogin");
        if(!UsuarioController.usuarios.isEmpty()){
            for(int i=0; i<UsuarioController.usuarios.size(); i++){
                if(login.equals(UsuarioController.usuarios.get(i).getLogin())) return i;                  
            }
        }
        else
            throw new UsuarioException("Login invalido!!");
        return -1;
    }
    
    public boolean noRepeat(String login){
       if(UsuarioController.usuarios.isEmpty()) return true;
       else{
           for(int i=0; i<UsuarioController.usuarios.size(); i++){
               if(login.equals(UsuarioController.usuarios.get(i).getLogin())) return false;
            }
       }
       return true;
   }
}
