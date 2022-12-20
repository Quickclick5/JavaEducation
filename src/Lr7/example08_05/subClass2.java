package Lr7.example08_05;

public class subClass2 extends superClass {

    final char ch;

    public subClass2(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    char getChar (){
        return ch;
    }

    public String toString() {
        String Field;
        Field =
                 this.getClass().getSimpleName() + "\n" + this.getStr() + "\n" + getChar();
        System.out.println(Field);
        return super.toString() + Field;
    }
}