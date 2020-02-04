/*Create a program that demonstrates the following:
1. generates the absolute value of a negative number.
2. uses subclasses to output a sautéed onion.
Output:
1. The absolute value of -n is n
2. I have cut the onion! I have fried the onion! Together, we have cooked onion!
*/


class Absolute{
    void abso(int i){
    System.out.println("The absolute value of -n is "+Math.abs(i));
    }
}

class Cut{
    String food = "onion";
    void cutM(){
        System.out.print("I have cut the "+ food+"! ");
    }
}

class Fry extends Cut {

    void cutM(){
        System.out.print("I have fry the "+ food+"! ");
    }
}

class Team extends Fry{
    void cutM(){
        System.out.println("Together I have fry the "+ food+"!");
    }
}

class Omron{
    public static void main(String[] args) {
        int i = -6;
        Absolute st = new Absolute();
        st.abso(i);
        Cut cut =new Cut();
        Fry fry = new Fry();
        Team team = new Team();
        cut.cutM();
        fry.cutM();
        team.cutM();
    } 
}

