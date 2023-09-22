/* Chimaltenango 11-08-2023
 * Programador: Eleazar Yoc
 * Utilizando el Lenguaje de Programación de su preferencia, desarrolle un programa,
 * utilizando FICHEROS que a través de un menú principal permita administrar productos del inventario, 
 * por lo debes de INVESTIGAR para solucionar dicho requerimiento
 */
package PARCIAL_1.LaboratorioFicheros2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author EEY TM
 */
public class LaboratorioFicherosProgra2 {
    public static void main(String[] args) {
        FerreteriaJeedApp2 app = new FerreteriaJeedApp2();
        app.run();
    }
}

class FerreteriaJeedApp2 {
    private static final String FILE_PATH = "C:\\Users\\DELL\\Documents\\1Mariano\\4 - Programacion ll/FerreteriaJeed1.txt";
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("---------------------------------------------");
            System.out.println("------ FRERRETERIA Y HERRAMIENTAS JEED ------");
            System.out.println("---------------------------------------------");
            System.out.println("------------------- Menú --------------------");
            System.out.println("1. Registrar Producto en el Inventario ------");
            System.out.println("2. Mostrar Productos del Inventario ---------");
            System.out.println("3. Actualizar Producto en el Inventario -----");
            System.out.println("4. Ingresar Producto al Inventario ----------");
            System.out.println("5. Extraer Producto del Inventario ----------");
            System.out.println("6. Mostrar Producto con Mayor Existencia ----");
            System.out.println("7. Mostrar Producto con Menor Existencia ----");
            System.out.println("8. Salir ------------------------------------");
            System.out.println("---------------------------------------------");

            int choice = 0; // Inicializamos choice para que el compilador no marque un error
            boolean validChoice = false;
            
            do {
            try {
                System.out.print("Elija una opción: ");
                
                choice = scanner.nextInt();
                scanner.nextLine();// Consumir el caracter de nueva lina
                validChoice = true; // Si no ocurre una excepción, la opción es válida
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Ingrese un número.");
                scanner.nextLine(); // Consume la entrada incorrecta para evitar un bucle infinito
            }
                } while (!validChoice);
            
                    switch (choice) {
            case 1:
                registrarProducto();
                break;
            case 2:
                mostrarInventario();
                break;
            case 3:
                actualizarProducto();
                break;
            case 4:
                ingresarProducto();
                break;
            case 5:
                extraerProducto();
                break;
                
            case 6: // Nuevo caso para mostrar el producto con mayor cantidad en existencia
                mostrarCantidadExtrema(true);
                break;
                
            case 7: // Nuevo caso para mostrar el producto con menor cantidad en existencia
                mostrarCantidadExtrema(false);
                break;
                
            case 8:
                exit = true;
                break;
           
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }

        }

        scanner.close();
    }

    
    private void mostrarInventario() {
    try {
        FileReader entrada = new FileReader(FILE_PATH);
        BufferedReader reader = new BufferedReader(entrada);
        List<String[]> productos = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            productos.add(parts);
        }

        if (!productos.isEmpty()) {
            ordenarInventario(productos);

            // Ajustar las longitudes de las columnas para evitar que los datos se salgan
            String format = "%-15s %-25s %-10s %-10s%n"; 
            
            System.out.format(format, "Código", "Nombre", "Cantidad", "Precio");
            System.out.println("------------------------------------------------------------");

            for (String[] producto : productos) {   //iteracion para mostrar los detalles en cadena almacenados en productos
                String codigo = producto[0];
                String nombre = producto[1];
                String cantidad = producto[2];
                String precio = producto[3];

                System.out.format(format, codigo, nombre, cantidad, precio);
            }
            System.out.println("------------------------------------------------------------");
            granTotal(productos);
        } else {
            System.out.println("El inventario está vacío.");
        }

        entrada.close();
    } catch (IOException e) {
        System.out.println("No se ha encontrado el archivo");
    }
}

    

    private void ordenarInventario(List<String[]> productos) {
        Collections.sort(productos, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
    }
    

private void granTotal(List<String[]> productos) {
    double total = 0.0;

    for (String[] producto : productos) {
        double precio = Double.parseDouble(producto[3]);
        double cantidad = Double.parseDouble(producto[2]);
        total += precio * cantidad;
    }

    System.out.println("Gran Total del Inventario:     " + total);
}


    
    
    private void registrarProducto() {
    try {
        FileReader entrada = new FileReader(FILE_PATH);
        BufferedReader reader = new BufferedReader(entrada);
        
        System.out.println("Ingrese el codigo del producto: ");
        String codigo = scanner.next();
        scanner.nextLine();// Consumir el caracter de nueva línea
        
        // Verificar si el código ya existe en el inventario
        boolean codigoExistente = false;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length > 0 && parts[0].trim().equalsIgnoreCase(codigo)) {
                codigoExistente = true;
                break;
            }
        }
        reader.close();
        
        if (codigoExistente) {
            System.out.println("El código ya está en uso. No se puede agregar el producto.");
            return; // Salir de la función sin agregar el producto
        }

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la cantidad del producto: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();// Consumir el caracter de nueva línea

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();// Consumir el caracter de nueva línea

        FileWriter salida = new FileWriter(FILE_PATH, true);
        BufferedWriter writer = new BufferedWriter(salida);

        String productoNuevo = codigo + "," + nombre + "," + cantidad + "," + precio + System.lineSeparator();
        writer.write(productoNuevo);

        writer.close();
        System.out.println("Producto agregado con éxito.");
    } catch (IOException e) {
        System.out.println("Error al agregar el producto.");
    }
}




    private void actualizarProducto() {
    try {
        File inputFile = new File(FILE_PATH);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        System.out.println("Ingrese el codigo del producto a actualizar: ");
        String productoActualizar = scanner.nextLine();

        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String codigo = parts[0].trim();

            if (codigo.equalsIgnoreCase(productoActualizar)) {
                System.out.print("Ingrese el nuevo nombre del producto: ");
                String nuevoNombre = scanner.nextLine();
                
                System.out.print("Ingrese la nueva cantidad del producto: ");
                double nuevaCantidad = scanner.nextDouble();
                
                System.out.print("Ingrese el nuevo precio del producto: ");
                double nuevoPrecio = scanner.nextDouble();

                line = codigo + "," + nuevoNombre + "," + nuevaCantidad + "," + nuevoPrecio;
                found = true;
            }

            writer.write(line + System.lineSeparator());
        }

        reader.close();
        writer.close();

        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Producto actualizado con éxito.");
        } else {
            tempFile.delete();
            System.out.println("Producto no encontrado en el inventario.");
        }
    } catch (IOException e) {
        System.out.println("Error al actualizar el producto.");
    }
}

    private void ingresarProducto() {
    try {
        System.out.println("Ingrese el codigo del producto: ");
        String codigoBuscado = scanner.nextLine();

        FileReader entrada = new FileReader(FILE_PATH);
        BufferedReader reader = new BufferedReader(entrada);

        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String codigo = parts[0].trim();

            if (codigo.equalsIgnoreCase(codigoBuscado)) {
                found = true;

                String nombre = parts[1];
                double cantidad = Double.parseDouble(parts[2]);
                double precio = Double.parseDouble(parts[3]);

                System.out.println("Producto encontrado:");
                String format = "%-15s %-25s %-10s %-10s%n";
                System.out.format(format, "Código", "Nombre", "Cantidad", "Precio");
                System.out.println("------------------------------------------------------------");
                System.out.format(format, codigo, nombre, cantidad, precio);
                System.out.println("------------------------------------------------------------");

                break;
            }
        }

        reader.close();

        if (!found) {
            System.out.println("El producto no existe.");
        }

    } catch (IOException e) {
        System.out.println("Error al buscar el producto.");
    }
}


private void mostrarCantidadExtrema(boolean maximo) {
    try {           //maneja cualquier posible excepcion durante la lectura del archivo
        FileReader entrada = new FileReader(FILE_PATH);   //abre el archivo especificado en FILE_PATH
        BufferedReader reader = new BufferedReader(entrada); //lee lineas del archivo de manera eficiente
        
        List<String[]> productos = new ArrayList<>(); //crea una lista dividida por comas
        String line;
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            productos.add(parts);
        }
        
        if (!productos.isEmpty()) { //si la lista no esta vacia...
            Comparator<String[]> comparator = Comparator.comparingDouble(parts -> Double.parseDouble(parts[2])); //compara los productos en funcion de su cantidad
            
            if (maximo) { //si maximo es true se invierte el comparador de mayor a menor
                comparator = comparator.reversed(); // Ordenar de mayor a menor
            }
            
            productos.sort(comparator);
            
            String extremo = maximo ? "mayor" : "menor"; //expresion ternaria para escribir if-else en una sola linea evaluando si maximo es true o false
            System.out.println("Producto con la cantidad " + extremo + " en existencia:");
            
            String format = "%-15s %-25s %-10s %-10s%n";
            System.out.format(format, "Código", "Nombre", "Cantidad", "Precio");
            System.out.println("------------------------------------------------------------");
            
            String[] producto = productos.get(0); //extrae el primer producto segun el orden previamente establecido
            String codigo = producto[0];
            String nombre = producto[1];
            String cantidad = producto[2];
            String precio = producto[3];
            
            System.out.format(format, codigo, nombre, cantidad, precio);
            System.out.println("------------------------------------------------------------");
        } else {
            System.out.println("El inventario está vacío.");
        }
        
        entrada.close();
    } catch (IOException e) {
        System.out.println("No se ha encontrado el archivo.");
    }
}


    private void extraerProducto() {
    try {
        File inputFile = new File(FILE_PATH);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        System.out.print("Ingrese el codigo del producto a extraer: ");
        String codigoExtraer = scanner.nextLine();

        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String codigo = parts[0].trim();

            if (codigo.equalsIgnoreCase(codigoExtraer)) {
                found = true;
            } else {
                writer.write(line + System.lineSeparator());
            }
        }

        reader.close();
        writer.close();

        if (found) {
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Producto extraido con éxito.");
        } else {
            tempFile.delete();
            System.out.println("Producto no encontrado en el inventario.");
        }
    } catch (IOException e) {
        System.out.println("Error al extraer el producto.");
    }
}

}
