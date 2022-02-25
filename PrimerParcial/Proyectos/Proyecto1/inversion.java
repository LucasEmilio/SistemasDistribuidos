/*Inversiones. Calcular cuánto dinero tendría en una cuenta de ahorro al final de 20 años si al
inicio de cada año añado 500 dólares (solo de los años 1 al 10), el rendimiento anual es de 5% y
reinvierto las ganancias*/


public class inversion {
    
    public static void main(String[] args) {

        double ahorro = 0;
    
        for (int i = 0; i < 20 ; i++) {
            
            if(i >=0 || i < 10){
                ahorro = ahorro + 500;
            }
             
            double rendimiento = ahorro * 0.5;

            ahorro = ahorro + rendimiento;
        
        }

        System.out.println("El ahorro es de: " + ahorro);
    }
}
