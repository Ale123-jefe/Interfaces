public class Main {
    public static void main(String[] args) {
        /*

        //polimorfismo
        Producto producto = new Producto("whdabda","Genius G128+");

        Producto lj750 = new Impresora("8876","Canon LaserJet 750",30);
        //System.out.println(lj750);
        Producto s200 = new Monitor("723423","Samsung s200 plus",15,"4k");
        //System.out.println(s200);
        Producto m500 = new  DiscoDuro("m500","Maxtor m500",10,500);
        //System.out.println(m500);

        Impresora Impresora = (Impresora) lj750;
        //System.out.println(Impresora);
        Monitor monitor = (Monitor) s200;
        //System.out.println(monitor);
        DiscoDuro discoDuro = (DiscoDuro) m500;
        //System.out.println(discoDuro);

        Producto[] productos = new Producto[3];
        productos[0] = Impresora;
        productos[1] = monitor;
        productos[2] = discoDuro;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

         */

        Monitor Lg1080 = new Monitor("lg1080","Monitor LG+", 12,"Hd");
        Lg1080.reset();

        DiscoDuro s1000 = new DiscoDuro("s1000", "Samsung s1000",20,1000);
        s1000.reset();

        Impresora m2000 = new Impresora("m200","Lg m2000",50);
        m2000.reset();

        DiscoDuro m3000 = new DiscoDuro("m3000","alcatel m3000",23,64);
        m3000.reset();
    }
}
