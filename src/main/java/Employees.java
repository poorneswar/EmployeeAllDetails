/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
public class Employees {
    
    private String emp_name;
    private int emp_id;
    private String emp_department;
    private String emp_position;

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_department() {
        return emp_department;
    }

    public void setEmp_department(String emp_department) {
        this.emp_department = emp_department;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public Employees(String emp_name, int emp_id, String emp_department, String emp_position) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.emp_department = emp_department;
        this.emp_position = emp_position;
    }

    public Employees(String emp_name, int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    public Employees() {
        this.emp_name= "";
        this.emp_id = 0;
        this.emp_department ="";
        this.emp_position = "";
    }

    @Override
    public String toString() {
        return "Employees{" + "emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_department=" + emp_department + ", emp_position=" + emp_position + '}';
    }
    
    
    
    
}
