package ejemploInterfaces;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto [] productos = new Producto[8];

        productos[0] = new Iphone(900,"Apple", "13 MAX", "Lila");
        productos[1] = new Iphone(1200,"Apple", "14","Negro");
        productos[2] = new TvLcd(800,"Samsung",65);
        productos[3] = new TvLcd(1200,"Sony",55);
        productos[4] = new Libro(25, new Date(0 - 17,10,14), "Robert Louis Stevenson","La isla del tesoro", "Prensa Popular");
        productos[5] = new Libro(20,new Date(109,10,18), "Gabriel Garcia de Oro", "La torre del tiempo", "EDB INFALTIL FICCION");
        productos[6] = new Comics(17,new Date(121,11,16), "Dan Slott","Marvel Must-Hava. Spiderman: Universo Spiderman", "Panini", "Spiderman");
        productos[7] = new Comics(10, new Date(112,10,13), "Brian Buccellato", "The Flash Vol.1", "DC", "Flash");


        for (IProducto producto : productos) {
            System.out.println(producto.toString());
        }
    }
}
