

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
public class Emp_Main_Method {
    public static void main(String[] args){
    Employees employees = new Employees("Susan Meyers",47899,"Accounting","Vice President");
        System.out.println(employees);
        Employees employees1 = new Employees("Mark Jones",39119,"IT","Programmer");
        System.out.println(employees1);
        Employees employees2 = new Employees("Joy Rogers",81774,"Manufacturing","Engineer");
        System.out.println(employees2);
    
}
}
