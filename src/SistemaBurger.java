import java.util.ArrayList;
import java.util.Comparator;

public class SistemaBurger {
    private  ArrayList<User> usuarios =  new ArrayList<User>();
    private  ArrayList<Avaliacao> avaliacoes =  new ArrayList<Avaliacao>();

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void cadastrarUsuario(User usuario){
        usuarios.add(usuario);
    }

    public void cadastrarAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }

    public void todasAvaliacoes(){
        for (Avaliacao avaliacao : avaliacoes){
            System.out.println(avaliacao);
        }
    }
    
    public void rankingBurgers(){
        avaliacoes.sort(Comparator.comparing(Avaliacao::getNotaBuger).reversed());
        for (int i = 0; i < avaliacoes.size(); i++) {
            System.out.printf(i+1 + "º Lugar: " + avaliacoes.get(i) + "\n");

        }
    }

}
