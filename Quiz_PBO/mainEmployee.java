/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz_PBO;

/**
 *
 * @author LUTVI
 */

public class mainEmployee {
    public static void main(String[] args) {
        
        Employee emp = new Employee(1, "Muhammad", "Lutvi", 5000000);

      
        System.out.println("Data Awal: " + emp.toString());

        
        System.out.println("Gaji Setahun: " + emp.getAnnualSalary());

       
        emp.raiseSalary(10);
        System.out.println("Setelah Naik Gaji: " + emp.toString());
    }
}
