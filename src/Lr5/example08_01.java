package Lr5;



public class example08_01 {
    public static void main(String[] args) {

        PrivatChar PrivatChar1 = new PrivatChar();
        PrivatChar1.viewCode();

        PrivatChar1.Set('r');
        PrivatChar1.viewCode();
        System.out.println("код символа: " + PrivatChar1.getCodeSymbol() );
    }

    static class PrivatChar {

        private char xxx;

        public void Set(char xxx1) {
            this.xxx = xxx1;
        }

        public int getCodeSymbol() {
            return (int) xxx;
        }

        public void viewCode() {
            System.out.println("Символ  = " + xxx);
        }
    }
}