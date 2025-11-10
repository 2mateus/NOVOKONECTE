import DAO.UsuarioDAO;
import entity.Usuario;

public class App {

    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Mateus");
        u.setLogin("mateus");
        u.setSenha("Deadpool123.");
        u.setEmail("mateus@gmail.com");
        
        new UsuarioDAO().cadastrarUsuario(u);


        
    }
}