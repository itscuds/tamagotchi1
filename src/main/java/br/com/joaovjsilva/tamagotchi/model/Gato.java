package br.com.joaovjsilva.tamagotchi.model;

public class Gato extends Animal {
    @Override
    public void brincar() {
        alterarFelicidade(10);
        alterarEnergia(-5);
        alterarFome(5);
    }

    @Override
    public void comer() {
        alterarFome(-15);
        alterarEnergia(10);
    }

    @Override
    public void dormir() {
        alterarEnergia(20);
        alterarFome(5);
    }

    @Override
    public void turno() {
        alterarEnergia(-5);
        alterarFome(5);
        alterarFelicidade(-3);
    }




}
