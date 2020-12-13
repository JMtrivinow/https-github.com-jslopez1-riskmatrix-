package com.bancofuturo.riskmatrix;

import com.bancofuturo.riskmatrix.web.controller.Risk;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class ManageRiskMatrixTest {


    @Test
    public void addRiskToMatrix() {
        ManageRiskMatrix manageRiskMatrix= new ManageRiskMatrix();
        Risk risk= new Risk();
        risk.setDriver("Test Driver");
        risk.setImpact(1);
        risk.setUrgency(1);
        String[][] riskMatrix= manageRiskMatrix.addRiskToMatrix(risk);
        Assertions.assertEquals(" \nTest Driver",riskMatrix[1][1]);
    }
}
