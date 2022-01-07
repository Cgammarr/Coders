package coder.navidad.gestioncoder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import coder.navidad.gestioncoder.repositories.Coder;
import coder.navidad.gestioncoder.repositories.CoderRepository;

import java.util.List;

@Controller
public class CoderController {

    private CoderRepository coderRepository;

    @Autowired
    public CoderController(CoderRepository coderRepository) {
        this.coderRepository = coderRepository;
    }

    @GetMapping("/coders")
    String listCoders(Model model) {
        List<Coder> coders = (List<Coder>) coderRepository.findAll();
        model.addAttribute("nombre", "Coder list");
        model.addAttribute("coders", coders);
        return "coders/all";
    }
}