package br.com.joaovjsilva.tamagotchi.model;

public class Dragao extends Animal{
    @Override
    public void brincar() {
        alterarFelicidade(12);
        alterarEnergia(-15);
        alterarFome(15);
    }

    @Override
    public void comer() {
        alterarFome(-30);
        alterarEnergia(20);
    }

    @Override
    public void dormir() {
        alterarEnergia(10);
        alterarFome(10);
    }

    @Override
    public void turno() {
        alterarEnergia(-15);
        alterarFome(10);
        alterarFelicidade(-7);
    }
}
