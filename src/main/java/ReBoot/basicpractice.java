package ReBoot;

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

 *//*
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
*/


/*class calcul {
    public int carc(int a, int b) {

        return a+b;
    }

    public void cacal(int c, int d){
        System.out.println(c+d);
    }


}*/
/*
    class calcul {
        static int a;
        int b;

        public static void sum(int a, int b) {
            System.out.println( a + b);
        }
        public void subtract(int a, int b) {
            System.out.println(a-b);
        }
        }*/

/*
        class check {
        static int a = 1;
        int b= 2;

        static void sum(int c, int d){
            System.out.println(c+d);
        }
            static void sta_sta() {
                System.out.println(a);}

            //            static void sta_ins() {
  //              System.out.println(b);}
            void ins_sta() {
                System.out.println(a);}
            void ins_ins() {
                System.out.println(b);}
        }
*/
/*

enum Fruit {Apple, Banana, Carrot}

enum Company {
    Apple(1), Banana(2), Carrot(3);

*/

/*
    private int rank;

    public int uprank() {
        return this.rank;}

    Company(int rank){
        this.rank = rank;
    }
}
*/
class name {
    String usinglanguage;

    public name(String usinglanguage){
        this.usinglanguage = usinglanguage;
    }
}


class company<T, S>{
    public T name;
    public S rank;

    public company(T name, S rank){
        this.name = name;
        this.rank = rank;}
}



public class basicpractice{
    public static void main(String[] args) {
        name name1 = new name("java");
        Integer ranking = new Integer(1);

        company<name, Integer> c1 = new company<>(name1, ranking );

        System.out.println(c1.name.usinglanguage);

        System.out.println(c1.rank.intValue());


    }
}














        //

/*
        Company type = Company.Apple;
        switch (type){
            case Apple:
                System.out.println("Apple is ranked "+Company.Apple.uprank());break;
            case Banana:
                System.out.println("Banana is ranked "+Company.Banana.uprank());break;
            case Carrot:
                System.out.println("Carrot is ranked "+Company.Carrot.uprank());break;

            default: break;

        }

        for ( Company companylist: Company.values()
             ) {
            System.out.println( companylist +"  ranked  " + companylist.uprank());

        }*/



        /*

        Fruit A = Fruit.Banana;
        switch (A){
            case Apple:
                System.out.println("Apple!"); break;
            case Banana:
                System.out.println("Banana!");break;
            case Carrot:
                System.out.println("Carrot!");break;
        }
*/









        //calcul.sum(3, 6 );   - static 필요


/*
        check.sum(10, 20);
        check c1 = new check();

        check.sta_sta();
        c1.ins_ins();
        c1.ins_sta();

*/




        //



        /*
        int a = 3;
        int d = 5;
        String b = "12";
//        a += Integer.parseInt(b);
         String c = Integer.toString(a);
        System.out.println(b+c);

        System.out.println(args.length);

        for (String e : args) {
            System.out.println(e);}
        */
/*
        Scanner parrot = new Scanner(System.in);

        while(parrot.hasNextLine()){
            System.out.println(parrot.nextLine()+"라고 말했습니다.");}
        parrot.close();
*/
/*

        File idset = new File("outsource.txt");
        try {
            Scanner superparrot = new Scanner(idset);
            while (superparrot.hasNextLine()){
                System.out.println(superparrot.nextLine() + "라구요?");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
*/



    /*static class agemachine {
        String output;public String agg(int init, int limit) {
            String out = "age = ";
            for (int a = init; a < limit; a++) {

                out+=a;}
            return out;
        }
    }







    public static void main(String[] args) {

        agemachine c1 = new agemachine();

        System.out.println(c1.agg(13,17));
*/
/*
        calcul c1 = new calcul();

        System.out.println(c1.carc(2, 4)*2);

        int P = c1.carc(3, 3);
        System.out.println(P*10);

        c1.cacal(3, 5);

*/



        /*
        int c = (int) 3.14;

        int d = (int) 3.14;

        String aa = "333";
        String g = Integer.toString(c);

        int ff = Integer.parseInt(aa);
        System.out.println(ff + 222);


        String pp = "First hint : Circle\n";
        String jf = "Second hint : Time\n";
        String pa = "Final hint : TicTok\n";

        String hints = pp + jf + pa;
        System.out.println(hints);

        String qpa = "June";
        String pma = new String("June");
        System.out.println(qpa.equals(pma));
*/

/*

        switch (4) {

            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("목록에 없습니다.");
        }
*/

/*
        int init = 1; int limit = 10;
        for (int a= init; a<=limit; a++){
            if (a==5){continue;}
            System.out.println("coding everybody"+a);
            if (a==9){break;}

        }
*/

        /*String[] memeList = new String[4];
        memeList[0] = "June";
        memeList[1] = "Tom";
        memeList[2] = "Luna";
        memeList[3] = "Teraa";


        int memberid = 0;

        for (int b = 0; b<memeList.length; b++){
            System.out.println(memeList[b]);
        }

        for (String mem : memeList
             ) {
            System.out.println(mem);

        }


        int[] age = new int[3];
        age[0] = 13;
        age[1] = 22;
        age[2] = 33;

        for (int agelist: age
             ) {
            System.out.println(agelist); }

        */















/*
public class basicpractice{

        public static void main(String[] args) {

}}
*/


//











