package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;

    }

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    public int sumarConRetorno() {
        //  int resultado = a + b;
        //  return resultado;
        return this.a + this.b;

    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
        // cuando tenemos this. sabemos que hace referencia a un atributo de nuestra clase
    }
}
