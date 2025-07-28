public class Program {
    public static void main(String[] args) {
        int a = 11;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}