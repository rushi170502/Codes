class Quiz {
    public static void main(String[] args) {
        Core2web[] var1 = new Core2web[5];

        for (int var2 = 0; var2 < var1.length; var2++) {
            System.out.println(" " + var1[var2]);
        }
    }
}
/* error : 
    error: cannot find symbol
        Core2web[] var1 = new Core2web[5];
        ^
  symbol:   class Core2web
  location: class Quiz
   error: cannot find symbol
        Core2web[] var1 = new Core2web[5];
                              ^
  symbol:   class Core2web
  location: class Quiz
2 errors

 */