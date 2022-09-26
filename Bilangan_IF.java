/**
 * 
 * @author 21343011 - Nur Chintia Ningsih
 */
package JS6;
import javax.swing.JOptionPane;
public class Bilangan_IF {

	public static void main(String[] args) {
		String angka="";
		  angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
		  int z = Integer.valueOf(angka).intValue();
		  
		  String hasil ="";
		  if (z>=1&&z<=10){
		   hasil += "Valid number";
		  }
		  else{
		   hasil += "Invalid Number";
		  }
		 JOptionPane.showMessageDialog(null, hasil);

	}

}
