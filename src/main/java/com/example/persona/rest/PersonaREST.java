package com.example.persona.rest;

import com.example.persona.model.Persona;
import com.example.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaREST {

    @Autowired
    private PersonaService personaService;
    @GetMapping
    private ResponseEntity<List<Persona>>getAllPersonas(){
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
        try{
            Persona personaGuardada=personaService.save(persona);
            return ResponseEntity.created(new URI("/persona/"+personaGuardada.getId())).body(personaGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
