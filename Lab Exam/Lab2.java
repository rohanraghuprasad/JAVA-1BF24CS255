import java.util.Scanner;
class WrongAgeException extends Exception{
    WrongAgeException(int i){
        if(i==1)
        {
            System.out.println("Age cannot be less than or equal to zero");
        }
    }
}

class Age{
    Age() throws WrongAgeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        if(age<=0){
            throw new WrongAgeException(1);
        }
    }
}
class Lab2{
    public static void main(String[] args){
        try{
            Age obj=new Age();
            System.out.println("Valid age");
        }
        catch(WrongAgeException e){
            System.out.println(e);
        }
    }
}