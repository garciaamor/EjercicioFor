
package ejerciciofor;

import javax.swing.JOptionPane;

public class ClaseFor {
    public float PonerNota(){
        String res= JOptionPane.showInputDialog("Introduce la nota : ");
        float nota1= Float.parseFloat(res);
        return nota1;    
    }
     
     
     public void NotaMedia(){
         ClaseFor obx=new ClaseFor();
         int i;
         float nota1,nota2,nota3;
         for (i=0;i<30;i++){
         nota1=obx.PonerNota();
         nota2=obx.PonerNota();
         nota3=obx.PonerNota();
         JOptionPane.showMessageDialog(null, "La nota media es : "+ (nota1+nota2+nota3)/3);    
         }
         
     }
          
     
}
