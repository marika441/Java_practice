import java.io.*;

public class Exercise
{
    public static void main( String[] args ) throws IOException
    {
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

      // 練習4-6
      System.out.println("0か1を10回入力してください");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int win = 0;
      for(int i = 1; i < 10; i++) {
        int result = Integer.parseInt( br.readLine() );
        if( result == 1 )
        win += 1;
      }
        System.out.println("勝ち：" + win + "回、負け：" + (10 - win) + "回");

      // 練習4-7
      int giants = 0;
      int tigers = 0;
      for(int i = 1; i <= 9; i++) {
        System.out.println( i +"回表、巨人の得点は？");
        giants += Integer.parseInt( br.readLine() );
        System.out.println( i + "回裏、阪神の得点は？");
        tigers += Integer.parseInt( br.readLine() );
      }
      if ( giants > tigers ) {
        System.out.println("得点：" + giants + "対" + tigers + "で巨人の勝ち");
      } else if ( giants < tigers ) {
        System.out.println("得点：" + giants + "対" + tigers + "で阪神の勝ち");
      } else {
        System.out.println("引き分け");
      }

      // 練習4-8
      System.out.println("自然数を10回入力してください");
      int max = 0;
      for(int i = 0; i < 10; i++) {
        int value = Integer.parseInt( br.readLine() );
        if (max < value) {
          max = value;
        }
      }
      System.out.println("最大値は" + max);

      // 練習4-9
      System.out.println("自然数を10回入力してください");
      int max_value = 0;
      int min_value = 0;
      for(int i = 0; i < 10; i++) {
        int value = Integer.parseInt( br.readLine() );
        if(i == 0 || max_value < value){
          max_value = value;
        }
        if(i == 0 || min_value > value) {
          min_value = value;
        }
      }
      System.out.println("最大値：" + max_value + "最小値：" + min_value);

      // 練習4-10
      System.out.println("数値を入力してください");
      int value = Integer.parseInt( br.readLine() );
      for(int i = 0; i < value; i++) {
        System.out.println("*");
      }
  }
}