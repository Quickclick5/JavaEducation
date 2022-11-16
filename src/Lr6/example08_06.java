package Lr6;

public class example08_06 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        array = test.getArray(array, 5);
        for (int i=0; i < test.getArray(array, 5).length; i++) {
            System.out.println(array[i]);
        }
    }
}
 class test{
    public static int [] getArray (int[] array, int size){
        if(array.length < size) {
            return array;
        }
        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            newArray[i]= array[i];
        }
return newArray;
    }
}