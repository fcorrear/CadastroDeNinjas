package com.springboot.exercises.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas") //no endpoint /boas vindas irá retornar o return desse método
    public String boasVindas(){
        return "Minha primeira menssagem nessa rota.";
    }


}
