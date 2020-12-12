package com.bancofuturo.riskmatrix.web.controller;


import com.bancofuturo.riskmatrix.ManageRiskMatrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RiskMatrixController {


    ManageRiskMatrix manageRiskMatrix;


    @Autowired
    public RiskMatrixController(ManageRiskMatrix manageRiskMatrix ){
        this.manageRiskMatrix=manageRiskMatrix;
    }

    @GetMapping("/risk")
    public String greetingForm(Model model) {
        model.addAttribute("risk", new Risk());
        return "risk";
    }

    @PostMapping("/risk")
    public String greetingSubmit(@ModelAttribute Risk risk, Model model) {
        model.addAttribute("riskMatrix", manageRiskMatrix.addRiskToMatrix(risk));
        return "matrix";
    }

}
