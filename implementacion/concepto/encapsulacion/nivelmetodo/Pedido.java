package implementacion.concepto.encapsulacion.nivelmetodo;

import implementacion.concepto.encapsulacion.nivelmetodo.model.Orden;

public class Pedido {


    //se rompe el principio de responsabilidad unica porque
    // se esta realizando mas de 1 tarea
    public double obtenerTotalPedido(Orden orden){
        double total = 0.0;

        for (Orden.Articulo articulo: orden.getArticulos()) {
            total = articulo.getCantidad() * articulo.getValor();
            if(orden.getPais().equals("USA")){

                total += total * 0.07;
            }else if(orden.getPais().equals("MX")){
                total += total * 0.17;
            }else{
                System.out.println("error");
            }
        }
    //   no se puede mutar variables externas de una expresion lambda
    //    Esta restricción existe porque las expresiones lambda pueden ejecutarse de forma
    //    asincrónica o en otro momento del tiempo, por lo que Java necesita asegurarse de que
    //    el valor de las variables capturadas no cambie de manera inesperada.
        /*    orden.getArticulos().forEach(x->{
                total = x.getCantidad() * x.getValor();
                if(orden.getPais().equals("USA")){

                  total += total * 0.07;
                }else if(orden.getPais().equals("MX")){
                    total += total * 0.17;
                }else{
                    System.out.println("error");
                }
            });*/
    return total;
    }


    // metodo encapsulando a nivel de metodo, separando responsabilidades
    // mediante la creacion de un nuevo metodo llamado obtenerImpuesto
    public double obtenerTotalPedidoRefact(Orden order){
    double total = 0.0;
            for(Orden.Articulo articulo: order.getArticulos()){
                total = articulo.getValor() * articulo.getCantidad() + obtenerImpuesto(order.getPais());
            }
    return total;
    }

    private double obtenerImpuesto(String pais){
        var total = 0.0;
        if(pais.equals("USA")){

            total += total * 0.07;
        }else if(pais.equals("MX")){
            total += total * 0.17;
        }else{
            System.out.println("error");
        }
        return total;
    }
}
