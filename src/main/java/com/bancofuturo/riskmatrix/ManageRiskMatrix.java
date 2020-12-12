package com.bancofuturo.riskmatrix;

import com.bancofuturo.riskmatrix.web.controller.Risk;
import org.springframework.stereotype.Component;

@Component
public class ManageRiskMatrix {

    private String[][] riskMatrix= new String[4][3];
    private Boolean firsTime=Boolean.TRUE;

    public String[][] addRiskToMatrix(Risk risk){
        if(Boolean.TRUE.equals(firsTime)){
            fillMatrix();
            firsTime=Boolean.FALSE;
        }
       riskMatrix[risk.getUrgency()][risk.getImpact()]=riskMatrix[risk.getUrgency()][risk.getImpact()]+" \n"+risk.getDriver();
       return riskMatrix;
    }

    public void  fillMatrix(){
        for(int i=0;i<riskMatrix.length;i++){
            for(int j=0;j<riskMatrix[0].length;j++){
                riskMatrix[i][j]="";
            }
        }
    }
}
