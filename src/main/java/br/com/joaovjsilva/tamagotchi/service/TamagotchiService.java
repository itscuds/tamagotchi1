package br.com.joaovjsilva.tamagotchi.service;

import org.springframework.stereotype.Service;

import br.com.joaovjsilva.tamagotchi.model.Animal;
import br.com.joaovjsilva.tamagotchi.model.Cachorro;
import br.com.joaovjsilva.tamagotchi.model.Dragao;
import br.com.joaovjsilva.tamagotchi.model.Gato;

@Service
public class TamagotchiService {

    private final Animal gato = new Gato();
    private final Animal cachorro = new Cachorro();
    private final Animal dragao = new Dragao();

    public Animal getGato() {
         return gato;
     }

     public Animal getCachorro() {
         return cachorro;
     }

     public Animal getDragao() {
         return dragao;
     }
    
}
