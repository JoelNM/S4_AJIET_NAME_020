class large{
    public static void main(String[] args) {
        int[] k = {1, 2, 3, 4, 5};
        int largest = k[0];
        for (int i = 1; i < k.length; i++) {
            if (k[i] > largest) {
                largest = k[i];
            }
        }
        System.out.println("Largest = " + largest);
    }
}
