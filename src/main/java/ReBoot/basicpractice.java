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

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.SQLOutput;
import java.util.*;

/*
    private int rank;

    public int uprank() {
        return this.rank;}

    Company(int rank){
        this.rank = rank;
    }
}
*//*
class name {
    String usinglanguage;

    public name(String usinglanguage){
        this.usinglanguage = usinglanguage;
    }
}
*/
/*

class company<T, S>{
    public T name;
    public S rank;

    public company(T name, S rank){
        this.name = name;
        this.rank = rank;}
}
*/



//public class basicpractice{
    /*static void iteratorUsingIterator(HashMap map) {
        Set<HashMap.Entry<String, Integer>> entries = map.entrySet();    //마찬가지로 entrySet() 메소드 이용 entries 에 담고
        Iterator<HashMap.Entry<String, Integer>> i = entries.iterator();  // iterator() 메소드로 출력한 값들을 (entries)


        while (i.hasNext()) {
            System.out.println(i.next());
        }}*/
/*
    static void foreachiterator(HashMap mep){
        Set A = mep.entrySet();
        Iterator i = A.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

    }*/




/*

        while (i.hasNext()){Map.Entry<String, Integer> entry = i.next();    // i 를 hasNext 와 next 로 출력한다.
            System.out.println(entry.getKey() + ":" + entry.getValue()); }
*/

/*

    static void IteratorUsingiterator(HashMap map){
        Set<Map.Entry<Integer, String>> getmap = map.entrySet();
        Iterator<Map.Entry<Integer, String>> gm = getmap.iterator();
        while (gm.hasNext()){Map.Entry<Integer, String> B = gm.next();
            System.out.println(B.getKey() + ":" + B.getValue());
        }

    }
*/


  /*      public static void main(String[] args) {


            HashMap<Integer, String> A = new HashMap<>();

            A.put(1, "Apple");
            A.put(2, "Banana");
            A.put(3, "Carrot");

            System.out.println("바로" + A.get(2));
            for (String fruits: A.values()
                 ) {
                System.out.println(fruits);}


*/
/*

            Iterator FE = (Iterator) A.values().iterator();
            while (FE.hasNext()){
                System.out.println(FE.next());
            }


            IteratorUsingiterator(A);


*/


//            iteratorUsingIterator(A);

//            foreachiterator(A);





class computer implements Comparable {                   // .sort 사용하려면 필수조건
    int number;
    String owner;
    computer(int number, String owner) {
        this.number = number;
        this.owner = owner;
    }
    public int compareTo(Object o) {                       // Comparable 인터페이스를 implements 하면
        return this.number - ((computer) o).number;        // 필수적으로 compareTo 를 구현해야함
    }                                                   // A.compareTo(B) => 양수 > / 음수 < / 0 =
    // this.number = A
    // ((computer) o) = Object o  <= 괄호로 두번 묶어준다 (일단 알아두자)
    public String toString() {                       //overriding 해서 써먹을 method 로 정의.
        return number + "" + owner;
    }
}
public class basicpractice {
    public static void main(String[] args) {                  //ArrayList al = new ArrayList();  기본형
        List<computer> comp = new ArrayList<computer>();      // 객체 computer 를 Data type 으로 쓸 수 있다.
        comp.add(new computer(500, "June"));    // 객체 computer 를 ArrayList 로 만듬
        comp.add(new computer(200, "Tom"));    // 객체를 .add 할때는 "new 객체()" 로 해줘야 하네.
        comp.add(new computer(1000, "Luna"));
        System.out.println(comp.toString());              // 정렬 안됨




        Collections.sort(comp);



        System.out.println(comp.toString());             //정렬 된 값으로 출력

        Iterator i = comp.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}

        //System.out.println(A.get(2));

/*
        for (String Fuit: A.values()
             ) {
            System.out.println(Fuit);}
*/


        /*
        Iterator FE = (Iterator) A.values().iterator();
        while(FE.hasNext()){
            System.out.println(FE.next());
        }*/





        /*

        HashSet<Integer> A = new HashSet<>();
        A.add(10);
        A.add(20);
        A.add(30);

        HashSet<Integer> B = new HashSet<>();
        B.add(30);
        B.add(40);

        ArrayList<Integer> C = new ArrayList<>();
        C.add(10);
        C.add(20);
*/

        /*for (Integer age: A
             ) {
            System.out.println("User age : " + age);
        }
            System.out.println(A.containsAll(B));
            System.out.println(A.containsAll(C));

        Iterator FE = (Iterator) A.iterator();
        while (FE.hasNext()){
            System.out.println(FE.next());}


        System.out.println(A.size());
*/

        /*A.addAll(B);
        System.out.println(A.size());

        Iterator adl = (Iterator) A.iterator();
        while (adl.hasNext()){
            System.out.println(adl.next());}

        */
  /*      A.removeAll(C);
        Iterator reA = (Iterator) A.iterator();
        while (reA.hasNext()){
            System.out.println(reA.next());}
*/
/*

        A.retainAll(B);
        Iterator FE = (Iterator) A.iterator();
        while (FE.hasNext()){
            System.out.println(FE.next());}

        System.out.println(A.size());
*/
//        A.retainAll(C);
/*
        Iterator FE = (Iterator) A.iterator();
        while (FE.hasNext()){
            System.out.println(FE.next());}
*/

/*
        for (Integer age : A
             ) {
            System.out.println(age);

        }

        System.out.println(A.size());


*/
        //(A.addAll(B)
        //(A.addAll(B));



        /*ArrayList<String> al = new ArrayList<String>();

        al.add("Apple");
        al.add("Banana");
        al.add("Carrot");

        String Fruit = al.get(2);
        System.out.println(Fruit);

        for (String Fruits:al) {
            System.out.println("Fruits are : " + Fruits);}

*/




        /*name name1 = new name("java");
        Integer ranking = new Integer(1);

        company<name, Integer> c1 = new company<>(name1, ranking );

        System.out.println(c1.name.usinglanguage);

        System.out.println(c1.rank.intValue());

        */

















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











