import javax.swing.JOptionPane;

//Crear un programa en java en el cual se pida al usuario ingresar su nombre, 
//apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, 
//luego deberá mostrarse por consola los datos ingresados.
 
public class App {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido");
        
		String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido");
        String edad = JOptionPane.showInputDialog(null, "Ingrese edad");
        int ed = Integer.parseInt(edad);
        String hobbie = JOptionPane.showInputDialog(null, "Ingrese hobbie");
        String edc = JOptionPane.showInputDialog(null, "Ingrese editor de código preferido");
        String siso = JOptionPane.showInputDialog(null, "Ingrese sistema operativo");
        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + ed);
        System.out.println("Hobbie: " + hobbie);
        System.out.println("Editor preferido: " + edc);
        System.out.println("Sistema operativo: " + siso);
        					
	}

}
