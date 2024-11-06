package implementacion.concepto.encapsulacion.nivelclase;

import implementacion.concepto.encapsulacion.nivelmetodo.model.Orden;

public class Pedido {

    public double obtenerTotalPedido(Orden orden){
        double total = 0.0;
        CalculadorImpuestos ci = new CalculadorImpuestos();

        for (Orden.Articulo articulo: orden.getArticulos()) {
            total = articulo.getCantidad() * articulo.getValor();
            total = total + ci.calculaImpuesto(orden.getPais(),orden.getEstado(),total);
        }
        return total;
    }
}
