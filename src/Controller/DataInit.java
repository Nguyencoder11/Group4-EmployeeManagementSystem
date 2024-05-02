/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ADMIN
 */
public class DataInit {

    public static void main(String args[]) {
        try {
            DataConnection.writeObjectToFile("F:\\IT_Field_Learning\\Developer\\Java\\Group4-EmployeeManagementSystem\\data\\employee.txt", "");
            DataConnection.writeObjectToFile("F:\\IT_Field_Learning\\Developer\\Java\\Group4-EmployeeManagementSystem\\data\\department.txt", "");
            DataConnection.writeObjectToFile("F:\\IT_Field_Learning\\Developer\\Java\\Group4-EmployeeManagementSystem\\data\\position.txt","");
            System.out.println("KHOI TAO DU LIEU THANH CONG!");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
