package br.com.joaovjsilva.tamagotchi.model;

public abstract class Animal {
    private int energia = 100;
    private int fome = 0;
    private int felicidade = 100;

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    public int getFelicidade() {
        return felicidade;
    }

    protected void alterarEnergia(int valor){
        energia = limitar(energia + valor);
    }

    protected void alterarFome(int valor){
        fome = limitar(fome + valor);
    }

    protected void alterarFelicidade(int valor){
        felicidade = limitar(felicidade + valor);
    }

    private int limitar(int valor){
        return Math.max(0, Math.min(100, valor));
    }

    public abstract void brincar();
    public abstract void comer();
    public abstract void dormir();
    public abstract void turno();

}
