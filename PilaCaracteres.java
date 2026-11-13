public class PilaCaracteres {
    private char[] pila = new char[20];
    private int tope = -1; // -1 significa pila vacía

    public void push(char c) {
        tope++;            // subo el tope
        pila[tope] = c;    // guardo el carácter arriba
    }

    public char pop() {
        char c = pila[tope]; // tomo el de arriba
        tope--;              // bajo el tope
        return c;
    }

    public String revertir(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            push(texto.charAt(i));
        }
        while (tope >= 0) {
            resultado += pop();
        }
        return resultado;
    }

    public static void main(String[] args) {
        PilaCaracteres p = new PilaCaracteres();
        System.out.println(p.revertir("MUNDO")); // ODNUM
    }
}
