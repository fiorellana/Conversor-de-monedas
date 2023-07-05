import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Conversor1 {
public static void main(String[]args) {
	double cantidad;
	double resultado;
	boolean repetir=true;
	do {
		cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que usted desea convertir"));
	String[] opcion= {"De pesos a dolar","de pesos a euro","de pesos a libras","de pesos a Yen","De pesos a Won Coreano","De dolar a pesos","De euro a pesos","De libra a pesos"}; 
	String seleccion=(String)JOptionPane.showInputDialog(null, "Selecciona una opcion","Lista de opciones",JOptionPane.QUESTION_MESSAGE,null,opcion,opcion[0]);
	if(seleccion!=null) {
		String seleccionaste = null;
		System.out.println(seleccionaste +seleccion);
		}else {
			System.out.println("No selecciono ninguna opcion");
		
		}if(seleccion==opcion[0]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/18.11;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Tienes"+ numero+"$pesos");
			
		} if(seleccion==opcion[1]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/20.11;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero + "$dolar");
			
		} if (seleccion==opcion[2]) {
			DecimalFormat df= new DecimalFormat("###");
			resultado=cantidad/19.11;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero +"$euros");
			
		} if (seleccion==opcion[3]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/20.9;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero + "$Libras");
		} if(seleccion==opcion[4]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/16.1;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero + "$Yen");
		} if(seleccion==opcion[5]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/20.1;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero + "$Won coreano");
		} if(seleccion==opcion[6]) {
			DecimalFormat df=new DecimalFormat("###");
			resultado=cantidad/26.1;
			String numero=df.format(resultado);
			JOptionPane.showMessageDialog(null,"Usted tiene"+ numero + "$Pesos argentinos");
		}
	
	String opcion1=JOptionPane.showInputDialog(null, "Desea continuar?","Cancelar",JOptionPane.YES_NO_OPTION);
	String opcion3=JOptionPane.showInputDialog(null,"Usted salio del sitio",JOptionPane.YES_OPTION);
	System.out.println("Usted selecciono que no");

	}while(repetir);
}
}
