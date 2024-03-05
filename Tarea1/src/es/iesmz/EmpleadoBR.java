package es.iesmz;

public class EmpleadoBR {

    float caculaSalarioBruto(TipoEmpleado tipus, float ventaMes, float horasExtra){
        int salarioBase, prima;
        float salarioBruto, thoras;

        if (tipus == TipoEmpleado.venedor){
            salarioBase = 1000;
        }

        else if (tipus == TipoEmpleado.encarregat){
            salarioBase = 1500;
        }

            if (ventaMes >= 1000){
                prima = 100;
            } else if (ventaMes >= 1500){
                prima = 200;
            }

            if (horasExtra > 0){
                thoras = horasExtra * 20;
            }

            salarioBruto = salarioBase + prima + thoras;

        else if (tipus == null || ventaMes < 0 || horasExtra < 0){
            return -1;
        }
        return salarioBruto;
    }

    
}
