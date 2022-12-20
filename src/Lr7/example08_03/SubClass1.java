package Lr7.example08_03;

class SubClass1 extends superClass {
    public char ch;
    SubClass1 (char ch, int num) {
        setValue(ch,num);
    }

    SubClass1() {
    }

    void setValue (char ch, int num) {
        this.ch = ch;
        super.setValue(num);
    }
    char getCh () {
        return ch;
    }

    public String toString() {
        String Field =
                "\n" + this.getCh();
        return super.toString()+Field;
    }
}

