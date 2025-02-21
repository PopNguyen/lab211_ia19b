/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author ASUS
 */
public class Teacher extends Person {

    private int yearProfession;  //0-age current
    private String contractType;   // Long or Short
    private double salaryCoefficient;  // >=0
    
    public Teacher(){
        super();
        yearProfession = 0;
        contractType = "";
        salaryCoefficient = 0.0;
        
    }

    public int getYearProfession() {
        return yearProfession;
    }

    public void setYearProfession(int yearProfession) {
        this.yearProfession = yearProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }
    
    
    @Override
    public void inputAll(){
        super.inputAll();
        // nhap data cho 3 thuoc tinh of teacher class
        yearProfession = Utils.checkYearProfession("Enter year profession:");
        contractType = Utils.checkContract("Enter contract type ( Long or Short) :");
        salaryCoefficient = Utils.checkSalary("Enter salary:");
    }

    @Override
    public String toString() {
        return super.toString() + "yearProfession=" + yearProfession + ", contractType=" + contractType + ", salaryCoefficient=" + salaryCoefficient;
    }


    
    
    
    
}
