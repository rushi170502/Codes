class Quiz {
    public static void main(String[] args) {
        int[] var1 = new int[3];
        var1[1] = 1;
        var1[2] = 2;
        var1[3] = 3;

        System.out.println(var1[1] +" "+ var1[2] +" "+ var1[3]);
    }
}
/*
    error :  runtime error
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

 */