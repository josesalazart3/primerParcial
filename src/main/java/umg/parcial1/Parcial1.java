/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.parcial1;

import java.util.Scanner;

/**
 *
 * @author josesalazar
 */
public class Parcial1 {

    public static void main(String[] args) {
        
        
        //programa para convertir de decimal a binario
       


// se solicita un numero en binario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binaryNumber = scanner.nextLine();

        BinarioDecimal converter = new BinarioDecimal(binaryNumber);
        int decimalNumber = converter.convertToDecimal();

        System.out.println("Número binario: " + binaryNumber);
        System.out.println("Número decimal: " + decimalNumber);
    }
}
// se declara la clase binarioDecimal la cual hace la conversion
class BinarioDecimal {
    private String numeroBinario;

    public BinarioDecimal(String binaryNumber) {
        this.numeroBinario = binaryNumber;
    }

    public int convertToDecimal() {
        int decimalNumber = 0;
        int power = 0;
        int index = numeroBinario.length() - 1;

        while (index >= 0) {
            char digitChar = numeroBinario.charAt(index);

            if (digitChar == '0' || digitChar == '1') {
                int digit = Character.getNumericValue(digitChar);
                decimalNumber += digit * Math.pow(2, power);
                power++;
            } else {
                System.out.println("Error: El número binario contiene caracteres no válidos.");
                return -1; 
            }

            index--;
        }

        return decimalNumber;
    }

    public String getNumeroBinario() {
        return numeroBinario;
    }

    public void setNumeroBinario(String numeroBinario) {
        this.numeroBinario = numeroBinario;
    }
}

    

