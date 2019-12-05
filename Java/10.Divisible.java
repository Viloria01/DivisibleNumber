/*Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
la computadora indique si el mayor es divisible por el menor. Ejemplo:
Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
que los números ingresados se encuentren entre 0 y 100.*/


package divisiblenumber1;
import java.util.Scanner;


public class DivisibleNumber {

   
    public static void main(String[] args) {
        
        int ramdonNumberFirst, ramdonNumberSecont;
	float moduleSmallNumber;

	Scanner readNumber = new Scanner(System.in);
	System.out.print("Put the first number: ");
	ramdonNumberFirst = readNumber.nextInt();
	if(ramdonNumberFirst < 0 || ramdonNumberFirst > 100){
		System.out.println("Not it possible put this number"); 
                return;}
	System.out.print("Put the second number: ");
	ramdonNumberSecont = readNumber.nextInt();
	if(ramdonNumberSecont < 0 || ramdonNumberSecont > 100){
		System.out.print("Not it possible put this number");
                return;}
	if(ramdonNumberFirst > ramdonNumberSecont)
	{
		moduleSmallNumber = (float) (ramdonNumberFirst % ramdonNumberSecont);
		if(moduleSmallNumber == 0)
			System.out.print(ramdonNumberFirst + " is divisible for " + ramdonNumberSecont);
		else
			System.out.print(ramdonNumberFirst + " not is divisible for " + ramdonNumberSecont);
	}

	if(ramdonNumberFirst < ramdonNumberSecont)
	{
		moduleSmallNumber = (float) (ramdonNumberSecont % ramdonNumberFirst);
		if(moduleSmallNumber == 0)
			System.out.print(ramdonNumberSecont + " is divisible for " + ramdonNumberFirst);
		else
			System.out.print(ramdonNumberSecont + " not is divisible for " + ramdonNumberFirst);
       
        }
    }
}
