/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_3;

/**
 *
 * @author ASUS
 */
public class Number {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Number(String value) {
        this.value = value;
    }

    public Number addTwoNum(Number other) {
        return new Number(addLargeNum2(this.value, other.value));
    }

    public Number multiplyTwoNum(Number other) {
        return new Number(mutiplyLargeNum(this.value, other.value));
    }

    //Gia su hai so co doi dai bang nhau
    private String addLargeNum(String so1, String so2) {
        StringBuilder res = new StringBuilder();
        int remainder = 0;
        for (int i = so1.length() - 1; i >= 0; i--) {
            int s = (so1.charAt(i) - '0') + (so2.charAt(i) - '0');
            res.append(s % 10 + remainder);
            remainder = s / 10;
        }

        if (remainder > 0) {
            res.append(remainder);
        }

        return res.reverse().toString();
    }

    //Gia su hai so co do dai khac nhau:
    private String addLargeNum2(String so1, String so2) {
        int max = Math.max(so1.length(), so2.length());
        so1 = String.format("%" + max + "s", so1).replace(' ', '0');
        so2 = String.format("%" + max + "s", so2).replace(' ', '0');
        StringBuilder res = new StringBuilder();
        int remainder = 0;
        for (int i = so1.length() - 1; i >= 0; i--) {
            int s = (so1.charAt(i) - '0') + (so2.charAt(i) - '0');
            res.append(s % 10 + remainder);
            remainder = s / 10;
        }

        if (remainder > 0) {
            res.append(remainder);
        }

        return res.reverse().toString();
    }

    static private String mutiplyLargeNum(String n1, String n2) {
        int[] result = new int[n1.length() + n2.length()];
        String tem = "";
        for (int i = n1.length() - 1; i >= 0; i--) {
            int digit1 = n1.charAt(i) - '0';
            for (int j = n2.length() - 1; j >= 0; j--) {
                int digit2 = n2.charAt(j) - '0';
                int product = digit1 * digit2;
                int index = i + j + 1;
                int sum = product + result[index];
                result[index] = sum % 10;
                result[index - 1] += sum / 10;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(tem);
            tem = tem + result[i];
            System.out.println(tem);
        }
        return tem;

    }
    
}
