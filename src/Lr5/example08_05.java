package Lr5;

public class example08_05 {
    public static void main(String[] args) {

        Example example1 = new Example(20);
        System.out.println("Значение присвоенное через конструктор: " + example1.PrintInt());

        example1.Set(50);
        System.out.println("Значение присвоенное через метод с аргументом в пределах 0-100: " + example1.PrintInt());

        example1.Set(101);
        System.out.println("Значение присвоенное через метод с аргументом больше 100: " + example1.PrintInt());

        example1.Set(-1);
        System.out.println("Значение присвоенное через метод с аргументом меньше 0: " + example1.PrintInt());

        example1.Set();
        System.out.println("Значение присвоенное через метод без аргумента: " + example1.PrintInt());
    }
    static class Example {
        private int int1;
        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            if (n >= 100) {int1 = 100;}
            if (n <= 0) {int1 = 0;}
        }
        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }
        public int PrintInt() {
            return int1;
        }
        Example(int int1) {
            System.out.println("Example() ");
            this.Set(int1);
        }
    }
}
