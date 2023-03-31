package LAB10;
public class q1{
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            int value = array[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
