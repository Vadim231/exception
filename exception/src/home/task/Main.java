package home.task;


public class Main {
    public static void main(String[] args) {
        try{
            String word = null;
            System.out.println(word.length());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        try{
            getDivision(1,0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }

        try{
            int[] array = new int[4];
            int i = array[4];
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    public static int getDivision(int first, int second){
        return first/second;
    }
}
