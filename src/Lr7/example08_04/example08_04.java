package Lr7.example08_04;

public class example08_04 {
    public static void main(String[] args) {
        superClass superClass = new superClass('З');
        System.out.println(superClass.toString());
        subClass1 subClass1 = new subClass1('р',"строчка");
        System.out.println(subClass1 .toString());
        subClass2 subClass2 = new subClass2('щ',"строчка2",1);
        System.out.println(subClass2 .toString());
    }
}
