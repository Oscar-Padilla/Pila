public class Pila 
{
    private Object[] arregloPila;
    private int tamanoPila;
    private int cima;
    
    public Pila(int tamano)
    {
        this.tamanoPila=tamano;
        cima=-1;
        arregloPila=new Object[tamanoPila];
    }
    public void insertar(Object elemento)
    {
        cima+=1;
        arregloPila[cima]=elemento;
    }
    public Object quitar()
    {
        Object temp=arregloPila[cima];
        cima-=1;
        return temp;
    }
    public Object cimaPila()
    {
        return arregloPila[cima];
    }
    public boolean pilaVacia()
    {
        return cima==-1;
    }
    public boolean pilaLLena()
    {
        return cima==tamanoPila-1;
    }
    public int tamano()
    {
        return cima+1;
    }
    public void mostrarElementosPila()
    {
        for (int i = 0; i < tamano(); i++) 
        {
            System.out.print(arregloPila[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }
}
