package implementacion.concepto.encapsulacion.nivelclase;

public class CalculadorImpuestos {

    public double calculaImpuesto(String pais, String estado, double totalProducto){

            if(pais.equals("USA") && estado.equals("CAL") ){
                return totalProducto*0.12;
            }else if (pais.equals("USA") && estado.equals("CAL") ){
                return totalProducto*0.12;
            }else {
                System.out.println("no se encontro tarifa");
                return totalProducto*0;
            }
    }
}
