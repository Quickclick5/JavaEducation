package Lr7.example08_05;

public class example08_05 {
    public static void main(String[] args) {
        superClass superClass = new superClass("Супер класс");
        superClass.toString();
        subClass1 subClass1 = new subClass1("Первый подкласс", 7);
        subClass1.toString();
        subClass2 subClass2 = new subClass2("Второй подкласс", 'Ч');
        subClass2.toString();
    }
}
