public class metodos {

    private int num = 5;
    private float gravity = 9.8f;

    public static int getNum(int num) { //Metodos para tomar y utilizar el atributo/variable num
        return num;
    }

    public void setNum(int num) { //le da un valor al atributo/variable num
        this.num = num;
    }

    public float getGravity() { //Metodo para tomar y utilizar el atributo/variable Gravity
        return gravity;
    }

    public void setGravity(float gravity) { //le da un valor al atributo/variable Gravity
        this.gravity = gravity;
    }

    public static void main(String[] args) {
        
        System.out.println("El numero es: " + getNum(5));
        System.out.println("La gravedad es de: " + getGravity());

        /*Hay un error en el que impide poder imprimir el resultado de los metodos get aunque aparentemente este todo en orden y deberia de funcionar correctamente.
        Tanto chatgpt como el IDE Visual studio code dicen de hacer los metodos get estaticos, pero eso da un error en el retorno del valor.
        La "unica" forma que he encontrado de solucionarlo es volver el metodo set statico, agregarle un parametro y pasarle un parametro en la llamada pero con eso ya pierde su 
        proposito original, dejare el metodo getNum con esa "solucion" para tener un ejemplo visual de a que me refiero en comparacion con getGravity.*/

    }
    
}
