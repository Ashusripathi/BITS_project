import java.util.Scanner;
public class Employee {
    int id;
    String name;
    int salary;
    void setId(int no) {
        id = no;
        void setname(String n){
            name = n;
            void setSalary(int a){
                salary = a;
            }
            void getEmployeeDetails(){
                System.out.println("Name: "+name + " , = Salary is: "+ salary ");
            }
            public static void main(String args[]){
                Employee e1 = new Employee();
                e1.setId(221);
                e1.setName("Ashu");
                e1.setSalary(400000);
            e1.getEmployeeDetails();            }
        }
    }

