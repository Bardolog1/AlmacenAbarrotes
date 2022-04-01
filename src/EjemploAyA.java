public class EjemploAyA {
    public static void main(String[] args) {

        Producto [] productos = new Producto[8];

        productos[0]= new Fruta("Melon",1200,1.5,"Naranja");
        productos[1]= new Fruta("Manzana",3000,1.0,"Verde");
        productos[2]= new Lacteo("Kumis",1500,400,6);
        productos[3]= new Lacteo("Queso",4000,1,40);
        productos[4]= new NoPerecible("Arroz",2100,500,240);
        productos[5]= new NoPerecible("Spagueti",1500,250,220);
        productos[6]= new Limpieza("Desinfectante",5400,"Hipoclorito de sodio",0.750);
        productos[7]= new Limpieza("Jabon Liquido",8000,"Hidroxido de sodio y grasas saponificadas",0.500);

        for (Producto pro : productos){
            System.out.println(
                    "\n================================"+
                    pro
                    +"\n================================"
            );
        }
    }
}
