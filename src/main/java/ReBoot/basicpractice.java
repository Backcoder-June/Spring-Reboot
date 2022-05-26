package ReBoot;

import java.util.Scanner;

        /*System.out.println("Hello BackCoder");



        System.out.println("Welcome Tom! This is Tom's own house. Have a good day Tom!".replace("Tom","June"));


        String insert = "Backcoder";

        System.out.println("Welcome " + insert +"! Have a good day "+ insert );

        System.out.println("Welcome "+insert+"! What a nice day "+insert+"! Bye "+insert);


        String age = "24";

        System.out.println("만 나이는 " + (Integer.parseInt(age)-2) +"세 입니다.");

        int ageid = 30;

        int age2 = 40;
        long sequnce = 0L;
        System.out.println(Integer.toString(ageid) + ++sequnce );

        System.out.println(age2 + ++sequnce);
        System.out.println(age2 + ++sequnce);
*/

/*

        for (int x = 1; x < 20; x++) {
            System.out.println(x);
            x = x * 2;
        }
        //1,3,7,15

            }
        }
*/


/*

*/
class memberlogin {
    String loginid;
    int password;

    public void logging(String loginid, int password) {

        if (loginid.equals("backcoder")) {
            if (password == 3123) {
                System.out.println("Succeed login");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Wrong id");
        }
    }

    public void logging2(String id, int pw) {
        if (id.equals("skystom2") && pw == 3123) {
            System.out.println("Login completed");
        } else {
            System.out.println("id or pw is wrong. check again.");
        }

    }
}

public class basicpractice {
    public static void main(String[] args) {

        memberlogin memberLogin = new memberlogin();
        memberLogin.logging("backcoder", 3123);

        memberlogin mem = new memberlogin();
        mem.logging2("skystom3", 3123);


        int age = 20;
        if(age<=13){
            System.out.println("초딩");
        } else if (13<age && age<21) {
            System.out.println("학생");}
        else if (21<=age && age <30) {
            System.out.println("청춘");
        }
        else {
            System.out.println("아재");
        }



        String id = args[0];
        if(id==("skystom2")){
            System.out.println("Right!");}else{
            System.out.println("Wrong");}


        for (int y=2; y<20; y++){
            for (int z = 1; z<5; z=z*2) {
                System.out.println(Integer.toString(y) + Integer.toString(z));
            }}

        Scanner parrot = new Scanner(System.in);
        String whatever = parrot.nextLine();
        System.out.println(whatever);

    }
}

/*
public class basicpractice{

        public static void main(String[] args) {

}}
*/


//











