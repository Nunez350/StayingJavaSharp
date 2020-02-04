/*Write a program with the following classes:
    - Student
    - GraduateStudent
    - UndergraduateStudent
along with a main class. The GraduateStudent and UndergraduateStudent classes must extend the Student class.
1) The Student class must have String variable named id intialized to an empty String. This variable must only be visible to the Student class and its subclasses. Hint: protected access modifier
2) Each class (excluding the main class) must have a generateID method that accepts an int and returns void.
3) In the Student class, this method simply assigns the int argument to the id variable.
4) In the GraduateStudent class, this method assigns the int argument to the id variable with a "g" prepended to the int. 
5) In the UndergraduateStudent class, this method assigns the int argument to the id variable with a "u" prepended to the int.
6) The Student class must also have a getID method that returns the id.
7) In the main class, create an array of Students that contains an UndergraduateStudent, a GraduateStudent, and another UndergraduateStudent (in that order!).
8) For each student, call the generateID method with the student's corresponding index in the
   student array as the argument.
9) For each student, print out the student's ID and their student status. Hint: instanceof
Output:
Student u0 is an undergraduate student
Student g1 is an graduate student
Student u2 is an undergraduate student
*/
class Student {
    protected String id = " ";
    void generateID(int a) {
        id =a;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
}

class GraduateStudent extends Student{
    void generateID(int a) {
        this.id ="g"+ a;
    }
}

class UndergraduateStudent extends Student{
    void generateID(int a) {
        this.id = "u"+a;
    }
}
class Lee{
    public static void main(String args[]){
        Student[] arr = new Student[3];
        arr[0]= new UndergraduateStudent();
        arr[1]= new GraduateStudent();
        arr[2]= new UndergraduateStudent();
        //     Student obj= new Student();
    for ( int i =0; i < arr.length; i++){
         arr[i].generateID(i);
         //System.out.println(arr[i]);//how do you print our the elements
        }
        for (Student s : arr) {
          //  System.out.print("Student " + s.getID() + " is an ");
            if (s instanceof UndergraduateStudent) {
                System.out.println("undergraduate student");
            }
            else {
                System.out.println("graduate student");
            }
        }
    }
}