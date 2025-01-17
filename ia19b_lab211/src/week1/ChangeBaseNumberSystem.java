/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author ASUS
 */
public class ChangeBaseNumberSystem {

    private String number;

    public ChangeBaseNumberSystem(String number) {
        this.number = number;
    }

    StringBuilder convertDecimalToBinary() {
        int num = Integer.parseInt(number);
        StringBuilder str = new StringBuilder();

        int a = 0;
        while (num != 0) {
            str.insert(a, Integer.toString(num % 2));
            a++;
            num /= 2;
        }
        return str.reverse();
    }

    int convertBinaryToDecimal() {
        int bi = Integer.parseInt(number);
        int base = 1, res = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '1') {
                res += base;
            }
            base *= 2;
        }
        return res;
    }

    StringBuilder convertDecimalToHex() {
        int num = Integer.parseInt(number);
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            int remainder = num % 16;
            char hexChar;

            if (remainder < 10) {
                hexChar = (char) (remainder + '0');
            } else {
                hexChar = (char) (remainder - 10 + 'A');
            }

            str.insert(0, hexChar);
            num /= 16;
        }
        return str;
    }

    int convertHexToDecimal() {
        int base = 1, res = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);
            int digit;

            if (Character.isDigit(c)) {
                digit = c - '0';
            } else {
                digit = Character.toUpperCase(c) - 'A' + 10;
            }

            res += digit * base;
            base *= 16;
        }
        return res;
    }
    StringBuilder convertBinaryToHex(){
        this.number = Integer.toString(convertBinaryToDecimal());
        return convertDecimalToHex();
    }
    StringBuilder convertHexToBinary(){
        this.number = Integer.toString(convertHexToDecimal());
        return convertDecimalToBinary();
    }

   

}
