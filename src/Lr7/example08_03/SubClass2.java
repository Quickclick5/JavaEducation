package Lr7.example08_03;

public class SubClass2 extends SubClass1 {
    String str;
    SubClass2 (char ch, int num, String str){
        setValue(ch, num, str);
    }

    void setValue(char ch , int num, String str) {
        super.setValue(ch,num);
        this.str = str;
    }

    public String getStr(){
        return str;
    }

    public String toString() {
        String Field =
                "\n" + this.getStr();
        return super.toString()+Field;
    }
}
