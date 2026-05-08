class Main {
    public static void main(String[] args) {
        int[] k = {1, 2, 3, 4, 5};
        int temp = 0;
        for (int i = 0; i < k.length; i++) {
            temp = temp + k[i];
        }
        System.out.println("Sum of array elements = " + temp);
    }
}
