package br.uniesp.si.techback.controller;

import br.uniesp.si.techback.model.Genero;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/generos")

public class GeneroController {

    private static List<Genero> Lista = new ArrayList<>();

    @PostMapping
    public Genero criar(@RequestBody Genero genero){
        Lista.add(genero);
        return genero;
    }

    @GetMapping
    public List<Genero> listar(){
        return Lista;
    }

    @PutMapping("/{id}")
    public String atualizar(@PathVariable int id, @RequestBody Genero genero){
        return "Atualizado id " + id;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return "Deletado id " + id;
    }
}