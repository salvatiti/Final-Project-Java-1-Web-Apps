package proyectolibreria;

import Clases.Carrito;
import Clases.Cliente;
import Clases.Libro;
import Clases.Vendedor;
import Clases.Venta;
import Interfaz.ventanaLibreria;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import milibreria.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoLibreria {

    public static GestionUsuarios usuarios = new GestionUsuarios();
    public static int cantidadLibroMasVendido = 0;

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Carrito> carrito = new ArrayList<>();
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        ArrayList<Venta> listaVentas = new ArrayList<>();

        listaClientes = leerFicheroClientes();
        escribirFicheroClientes(listaClientes);

        listaLibros = leerFicheroLibros();
        escribirFicheroLibros(listaLibros);

        listaVentas = leerFicheroVentas();
        escribirFicheroVentas(listaVentas);

        ventanaLibreria ventanaPrincipal = new ventanaLibreria(listaClientes, listaLibros, carrito, listaVendedores, listaVentas);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);

    }

    public static ArrayList<Cliente> leerFicheroClientes() {
        File ficheroClientes = new File("datosClientes.txt");
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        if (ficheroClientes.exists()) {
            try {
                FileInputStream fIn = new FileInputStream(ficheroClientes);
                ObjectInputStream entrada = new ObjectInputStream(fIn);

                listaClientes = (ArrayList<Cliente>) entrada.readObject();

                entrada.close();
                fIn.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException i) {
                System.out.println(i);
            }
        } else {
            try {
                ficheroClientes.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ProyectoLibreria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return (listaClientes);

    }

    public static void escribirFicheroClientes(ArrayList<Cliente> listaClientes) {
        try {
            FileOutputStream fOut = new FileOutputStream("datosClientes.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fOut);

            salida.writeObject(listaClientes);
            salida.close();

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public static ArrayList<Libro> leerFicheroLibros() {
        File ficheroLibros = new File("datosLibros.txt");
        ArrayList<Libro> listaLibros = new ArrayList<>();

        if (ficheroLibros.exists()) {
            try {
                FileInputStream fIn = new FileInputStream(ficheroLibros);
                ObjectInputStream entrada = new ObjectInputStream(fIn);

                listaLibros = (ArrayList<Libro>) entrada.readObject();

                entrada.close();
                fIn.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException i) {
                System.out.println(i);
            }
        } else {
            try {
                ficheroLibros.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ProyectoLibreria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return (listaLibros);

    }

    public static void escribirFicheroLibros(ArrayList<Libro> listaLibros) {
        try {
            FileOutputStream fOut = new FileOutputStream("datosLibros.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fOut);

            salida.writeObject(listaLibros);
            salida.close();

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public static ArrayList<Venta> leerFicheroVentas() {
        File ficheroVentas = new File("datosVentas.txt");
        ArrayList<Venta> listaVentas = new ArrayList<>();

        if (ficheroVentas.exists()) {
            try {
                FileInputStream fIn = new FileInputStream(ficheroVentas);
                ObjectInputStream entrada = new ObjectInputStream(fIn);

                listaVentas = (ArrayList<Venta>) entrada.readObject();

                entrada.close();
                fIn.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (ClassNotFoundException i) {
                System.out.println(i);
            }
        } else {
            try {
                ficheroVentas.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ProyectoLibreria.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return (listaVentas);

    }

    public static void escribirFicheroVentas(ArrayList<Venta> listaVentas) {
        try {
            FileOutputStream fOut = new FileOutputStream("datosVentas.txt");
            ObjectOutputStream salida = new ObjectOutputStream(fOut);

            salida.writeObject(listaVentas);
            salida.close();

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    public static void libroMasVendido(ArrayList<Libro> listaLibros, ArrayList<Venta> listaVentas) {

        int contador = 0;
        Libro l = new Libro();
        for (int i = 0; i < listaLibros.size(); i++) {
            for (int j = 0; j < listaVentas.size(); j++) {
                if (listaLibros.get(i).getIsbn() == listaVentas.get(j).getLibroLineaVenta().getIsbn()) {
                    contador = contador + listaVentas.get(j).getCantidad();
                }

            }
            if (contador > cantidadLibroMasVendido) {
                cantidadLibroMasVendido = contador;
                l = listaLibros.get(i);
            }
            contador = 0;

        }

        FuncionesGraficas.mostrarDatos("Libro mas vendido", "El libro más vendido es:  " + l.getTitulo() + "\n "
                + "  Se ha vendido un total de : " + cantidadLibroMasVendido + " veces");
    }

    public static void generoMasVendido(ArrayList<Libro> listaLibros, ArrayList<Venta> listaVentas) {

        int contador = 0;
        Libro l = new Libro();
        for (int i = 0; i < listaLibros.size(); i++) {
            for (int j = 0; j < listaVentas.size(); j++) {
                if (listaLibros.get(i).getGenero() == listaVentas.get(j).getLibroLineaVenta().getGenero()) {
                    contador = contador + listaVentas.get(j).getCantidad();
                }

            }
            if (contador > cantidadLibroMasVendido) {
                cantidadLibroMasVendido = contador;
                l = listaLibros.get(i);
            }
            contador = 0;

        }

        FuncionesGraficas.mostrarDatos("Genero mas vendido", "El Genero más vendido es:  " + l.getGenero() + "\n "
                + "  Se ha vendido un total de : " + cantidadLibroMasVendido + " veces");
    }

    public static boolean BackUpClientes() {
        File origen = new File("datosClientes.txt");
        File destino = new File("CopiaDatosClientes.txt");
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);

                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                FuncionesGraficas.mostrarDatos("Backup", "Copia de seguridad de Clientes realizada con éxito");

                return true;

            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }

        } else {
            return false;

        }

    }

    public static boolean BackUpLibros() {
        File origen = new File("datosLibros.txt");
        File destino = new File("CopiaDatosLibros.txt");
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);

                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                FuncionesGraficas.mostrarDatos("Backup", "Copia de seguridad de Libros realizada con éxito");

                return true;

            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }

        } else {
            return false;

        }

    }
    
      public static boolean BackUpVentas() {
        File origen = new File("datosVentas.txt");
        File destino = new File("CopiaDatosVentas.txt");
        if (origen.exists()) {
            try {
                InputStream in = new FileInputStream(origen);
                OutputStream out = new FileOutputStream(destino);

                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                FuncionesGraficas.mostrarDatos("Backup", "Copia de seguridad de Ventas realizada con éxito");

                return true;

            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }

        } else {
            return false;

        }

    }

}
