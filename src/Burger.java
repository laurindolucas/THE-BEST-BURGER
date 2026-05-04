public class Burger {
    private String burgerName;
    private String estabelecimentoBurger;

    public Burger(String burgerName, String estabelecimentoBurger) {
        this.burgerName = burgerName;
        this.estabelecimentoBurger = estabelecimentoBurger;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public String getEstabelecimentoBurger() {
        return estabelecimentoBurger;
    }

    public void setEstabelecimentoBurger(String estabelecimentoBurger) {
        this.estabelecimentoBurger = estabelecimentoBurger;
    }

    @Override
    public String toString() {
        return
                burgerName +
                "| Local: " + estabelecimentoBurger + '\n';
    }
}
