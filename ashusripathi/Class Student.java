public class Student {
    int roll;
        String name;
        String branch;
        Student(int roll, String name, String branch){
            this.roll = roll;
            this.name = name;
            this.branch = branch;
        }
        void display() {
            System.out.println("Roll: " + roll);
                        System.out.println("Name: " + name);
                                    System.out.println("Branch: " + branch);
        }
        public static void main (String args[]) {
            Student s1 = new Student(101, "ASHU", "EEE");
            Student s2 = new Student(102, "LAVS", "CIVIL");
            Student s3 = new Student(103, "ASH", "ECE");
            
            s1.display();
            s2.display();
            s3.display();
        }
    }
}

    
}
