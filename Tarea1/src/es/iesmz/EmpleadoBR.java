package es.iesmz;

public class EmpleadoBR {

    static float calcularSalarioBruto(TipoEmpleado tipus, float ventaMes, float horasExtra) {
        int salarioBase = 0, prima = 0;
        float salarioBruto, thoras = 0;

        if (tipus == TipoEmpleado.venedor) {
            salarioBase = 1000;
        } else if (tipus == TipoEmpleado.encarregat) {
            salarioBase = 1500;
        } else if (tipus == null || ventaMes < 0 || horasExtra < 0) {
            return -1;
        }

        if (ventaMes >= 1500) {
            prima = 200;
        } else if (ventaMes >= 1000) {
            prima = 100;
        }

        if (horasExtra > 0) {
            thoras = horasExtra * 20;
        }

        salarioBruto = salarioBase + prima + thoras;


        return salarioBruto;
    }

    static float calcularSalarioNeto(float salarioBruto) {
        float retencion = 0;
        if (salarioBruto > 0) {
            if (salarioBruto >= 1000 && salarioBruto < 1500) {
                retencion = 16.0f;
            } else if (salarioBruto >= 1500) {
                retencion = 18.0f;
            }

            salarioBruto = salarioBruto * (1 - (retencion / 100.0f));

        } else {
            System.err.println("Error, el salario es menor a 0");
            return -1;
        }
        return salarioBruto;
    }
}