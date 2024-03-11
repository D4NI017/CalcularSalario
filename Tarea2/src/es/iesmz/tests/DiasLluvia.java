package es.iesmz.tests;

public class DiasLluvia {
    static boolean[][] calendario = new boolean[12][31];

    static boolean registroDia(int dia, int mes, boolean lluvia){
        if (dia >= 1 && dia <= 31 && mes > 1 && mes <= 12){
            calendario [mes][dia] = lluvia;
            return true;
        }else {
            return false;
        }
    }

    static boolean consultarDia (int mes, int dia){
        return calendario[mes][dia];
    }

    int contarDiasLluvia(){
        int cantidad = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario.length; j++) {
                if (calendario[i][j]){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }

    static int trimestreLluvioso(){
        int trim1 = 0;
        int trim2 = 0;
        int trim3 = 0;
        int trim4 = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario.length; j++) {
                if (i < 3){
                    if (calendario[i][j]){
                        trim1++;
                    }
                }
                else if (i < 6){
                    if (calendario[i][j]){
                        trim2++;
                    }
                }

                else if (i < 9){
                    trim3++;
                }

                else if (i < 12){
                    trim4++;
                }
            }
        }

        if (trim1 > trim2 && trim1 > trim3 && trim1 > trim4){
            return trim1;
        } else if (trim2 > trim1 && trim2 > trim3 && trim2 > trim4){
            return trim2;
        } else if (trim3 > trim1 && trim3 > trim2 && trim3 > trim4){
            return trim3;
        }else {
            return trim4;
        }
    }

    static int primerDiaLluvia(){
        int diasTotales = 0;

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario.length; j++) {
                if (calendario[i][j]){

                    if (i == 0){ //CALCULAR ENERO
                        diasTotales = j;
                    }

                    if (i == 1){ //CALCULAR FEBRERO
                        diasTotales = 31 + j;
                    }

                    if (i == 2 ){ //CALCULAR MARZO
                        diasTotales = 31+ 28 + j;
                    }

                    if (i == 3){ //CALCULAR ABRIL
                        diasTotales = 28 + (31*2) + j;
                    }

                    if (i == 4){ //CALCULAR MAYO
                        diasTotales = 28 + (31 * 2) + 30 + j;
                    }

                    if (i == 5){ //CALCULAR JUNIO
                        diasTotales = 28 + (31 * 3) + 30 + j;
                    }

                    if (i == 6){ //CALCULAR JULIO
                        diasTotales = 28 + (31 * 3) + (30*2) + j;
                    }

                    if (i == 7){ //CALCULAR AGOSTO
                        diasTotales = 28 + (31 * 4) + (30*2) + j;
                    }

                    if (i == 8){ //CALCULAR SEPTIEMBRE
                        diasTotales = 28 + (31 * 4) + (30*3) + j;
                    }

                    if (i == 9){ //CALCULAR OCTUBRE
                        diasTotales = 28 + (31 * 4) + (30*4) + j;
                    }

                    if (i == 10){ //CALCULAR NOVIEMBRE
                        diasTotales = 28 + (31 * 5) + (30*4) + j;
                    }

                    if (i == 11){ //CALCULAR DICIEMBRE
                        diasTotales = 28 + (31 * 5) + (30*5) + j;
                    }
                }
            }
        }
        return diasTotales;
    }
}
