
package imc;

/**
 *
 * @author Usuario
 */
public class IMC {
   public IMC(){
   
 }  
   public double resultadoIMC(double peso, double estatura){
       double resultado = peso/Math.pow(estatura,2);
       return resultado;
   }
   public String obsIMC(double imc){
       String diagnostico = "";
       if(imc < 15){
           diagnostico = "delgadez muy severa";
       }else if(imc <= 15.9){
           diagnostico = "delgadez muy severa";
       }else if(imc <=18.4){
           diagnostico = "delgadez";
       }else if(imc <=24.9){
           diagnostico = "peso saludable";
       }else if(imc < 30){
           diagnostico = "sobrepeso";
       }else if(imc <40){
           diagnostico = "obesidad severa";
       }else{
           diagnostico = "obesidad morbida y perturbadora";
       }
       return diagnostico;
   }
}
