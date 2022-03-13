class Main {
  public static void main(String[] args) {
      // 練習4-1
      for (int i = 0; i < 10; i++) {
        System.out.println("SPAM");
      }
      // 練習4-2
      for (int i = 1; i <= 9; i++) {
        System.out.println((3 * i) + "");
      }
      // 練習4-3
      for(int n = 1, x = 2; n <= 9; n++, x *= 2) {
        System.out.println("2の" + n + "乘=" + x);
      }
      // 練習4-4
      int x = 1;
      for(int i = 2; i <= 7; i++) {
        x *= i;
        System.out.println( x );
      }
      // 練習4-5
        int sum = 0;
        for(int i = 1; i <= 10; i++){
          sum = sum + i;
        }
        System.out.println("平均：" + sum / 10.0);
  }
}
