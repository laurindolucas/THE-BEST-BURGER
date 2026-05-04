public class Avaliacao {
    private User usuario;
    private Burger burger;
    private int notaBuger;
    private String comentarioBurger;

    public Avaliacao(User usuario, Burger burger, int notaBuger, String comentarioBurger) {
        this.usuario = usuario;
        this.burger = burger;
        this.notaBuger = notaBuger;
        this.comentarioBurger = comentarioBurger;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public int getNotaBuger() {
        return notaBuger;
    }

    public void setNotaBuger(int notaBuger) {
        this.notaBuger = notaBuger;
    }

    public String getComentarioBurger() {
        return comentarioBurger;
    }

    public void setComentarioBurger(String comentarioBurger) {
        this.comentarioBurger = comentarioBurger;
    }

    @Override
    public String toString() {
        return  "------------------------------------------" + '\n'+
                "Usuário: " + usuario +
                " | Burger: " + burger +
                " | Nota: " + notaBuger +
                " | Comentário: " + comentarioBurger + '\n'+
                "------------------------------------------";
    }
}
