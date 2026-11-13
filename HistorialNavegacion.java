public class HistorialNavegacion {
    private String[] paginas = new String[15];
    private int tamaño = 0; // cuántas páginas hay guardadas

    public void add(String url) {
        paginas[tamaño] = url; // guardo al final
        tamaño++;
    }

    public void remove(String url) {
        for (int i = 0; i < tamaño; i++) {
            if (paginas[i].equals(url)) {
                // recorro a la izquierda las que siguen
                for (int k = i; k < tamaño - 1; k++) {
                    paginas[k] = paginas[k + 1];
                }
                paginas[tamaño - 1] = null;
                tamaño--;
                return;
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion h  = new HistorialNavegacion();
        h.add("museo.com");
        h.add("correo.com");
        h.add("deportes.com");
        System.out.println("Antes de borrar:");
        h.mostrarHistorial();
        h.remove("museo.com");
        System.out.println("Después de borrar museo.com:");
        h.mostrarHistorial();
   }
}
