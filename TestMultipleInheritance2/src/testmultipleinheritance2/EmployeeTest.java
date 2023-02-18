/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmultipleinheritance2;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 17/02/2023
 */
public class EmployeeTest {
    public static void main (String[] args){
        Sortable[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2400000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2100000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        Sortable.shell_sort(staff);
        for (i = 0; i < 3; i++) staff[i].print();
    }
}
