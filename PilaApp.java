public class PilaApp 
{
    public static void main(String[] args) 
    {
        Pila pila=new Pila(5);
        pila.insertar("Verde");
        pila.insertar("Azul");
        pila.insertar("Amarillo");
        
        System.out.println("Elementos insertados en la pila");
        pila.mostrarElementosPila();
        System.out.println("Elementos eliminados de la pila");
        while(!pila.pilaVacia())
        {
            Object valor=pila.quitar();
            System.out.println("Valor eliminado "+valor);
        }
        System.out.println("\n");
        
        pila.insertar("Rojo");
        pila.insertar("Morado");
        
        System.out.println("Elementos insertados en la pila");
        pila.mostrarElementosPila();
        while(!pila.pilaVacia())
        {
            Object valor=pila.quitar();
            System.out.println("Valor eliminado "+valor);
        }
        System.out.println("\n");
        pila.insertar("Amarillo");
        System.out.println("Cantidad de elementos en la pila: "+pila.tamano());
        pila.mostrarElementosPila();
    }
}
