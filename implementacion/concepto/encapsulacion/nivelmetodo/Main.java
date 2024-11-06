package implementacion.concepto.encapsulacion.nivelmetodo;

import implementacion.concepto.encapsulacion.nivelmetodo.model.Orden;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Orden orden = new Orden();
                orden.setPais("USA");
        Orden.Articulo a1 = new Orden.Articulo();
        a1.setCantidad(2);
        a1.setValor(23.00);
                ArrayList<Orden.Articulo> articulos = new ArrayList<>();
                articulos.add(a1);;
        pedido.obtenerTotalPedidoRefact(orden);

    }
}
