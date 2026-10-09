package br.com.joaovjsilva.tamagotchi.model;

public class Cachorro extends Animal{

    @Override
    public void brincar() {
        alterarFelicidade(15);
        alterarEnergia(-10);
        alterarFome(10);
    }

    @Override
    public void comer() {
        alterarFome(-20);
        alterarEnergia(15);
    }

    @Override
    public void dormir() {
        alterarEnergia(15);
        alterarFome(10);
    }

    @Override
    public void turno() {
        alterarEnergia(-10);
        alterarFome(10);
        alterarFelicidade(-5);
    }
}
