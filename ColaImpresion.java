public class ColaImpresion {
    private String[] documentos = new String[10];
    private int frente = 0;
    private int fin = -1; // fin indica el último documento encolado

    public void enqueue(String doc) {
        fin++;                 // avanzo el final
        documentos[fin] = doc; // guardo el documento al final
    }

    public String dequeue() {
        String doc = documentos[frente]; // tomo el del frente
        frente++;                        // el frente pasa al siguiente
        return doc;
    }

    public void imprimirTodo() {
        while (frente <= fin) {
            System.out.println("Imprimiendo: " + dequeue());
        }
    }

    public static void main(String[] args) {
        ColaImpresion c = new ColaImpresion();
        c.enqueue("Factura");
        c.enqueue("Recibo");
        c.enqueue("Pedido");
        c.imprimirTodo();
    }
}
