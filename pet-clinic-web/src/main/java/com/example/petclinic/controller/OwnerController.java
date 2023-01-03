package com.example.petclinic.controller;

import com.example.petclinic.model.service.map.OwnerMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    final
    OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping("")
    public String showOwners(Model model){
        model.addAttribute("owners",ownerMapService.findAll());
        return "owners/index";
    }
}
