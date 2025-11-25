import java.util.Scanner;

class WrongAge extends Exception{
    public WrongAge(int i){
        if(i==1){
            System.out.println("Age cannot be negative or zero.");
        }
        else if(i==2){
            System.out.println("Father's age cannot be less than son's age.");
        }
        else if(i==3){
            System.out.println("Son's age cannot be that close to father's.");
        }
    }  
}

class Father{
    int fatherAge;
    Scanner sc=new Scanner(System.in);
    Father() throws WrongAge{
        System.out.print("Enter father's age: ");
        fatherAge=sc.nextInt();
        sc.nextLine();

        if(fatherAge<=0){
            throw new WrongAge(1);
        }
    }
    void display(){
        System.out.println("Father's age: "+fatherAge);
    }
}

class Son extends Father{
    int sonAge;
    
    Son() throws WrongAge{
        System.out.print("Enter son's age: ");
        sonAge=sc.nextInt();
        sc.nextLine();

        if(sonAge<=0){
            throw new WrongAge(1);
        }
        else if(sonAge>=fatherAge){
            throw new WrongAge(2);
        }
        int gap=fatherAge-sonAge;
       if(gap<18){
            throw new WrongAge(3);
        }
    }
    void display(){
        System.out.println("Son's age: "+sonAge);
        super.display();
    }
}

public class program7 {
    public static void main(String[] args) {
        try{
            Son s=new Son();
            System.out.println("Valid ages.");
            s.display();
        }
        catch(WrongAge e){
            System.out.println(e.getMessage());
        }
    }
}