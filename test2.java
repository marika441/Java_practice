import java.io.*;

public class Exercise
{
    public static void main( String[] args ) throws IOException
    {
      // 練習4-11
      System.out.println( "数値を入力して下さい" );
      BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
      int count = Integer.parseInt( br.readLine() );
      for(int i = 0; i < count; i++)
      System.out.println( i % 10 );

      // 練習4-12
      System.out.println( "数値を入力して下さい" );
      int sum = 0;
      while( sum <= 100 )
        sum += Integer.parseInt( br.readLine() );
      System.out.println( "合計は " + sum );

      // 練習4-13
      int strike = 0;
      int ball = 0;

      while( strike < 3 && ball < 4 )
      {
      System.out.print( "ストライク=1 or ボール=2 ？" );

      int judge = Integer.parseInt( br.readLine() );

      if( judge == 1 )
        strike++;
      else if( judge == 2 )
        ball++;
      }

      System.out.println( ball + "ボール," + strike + "ストライク" );

      // 練習4-14
      // 4-13に修正を加える
      int strike = 0;
      int ball = 0;

      while( strike < 3 && ball < 4 )
      {
        System.out.print( "ストライク=1 or ボール=2 or ファウル=3？" );

        int judge = Integer.parseInt( br.readLine() );

        if( judge == 1 )
            strike++;
        else if( judge == 2 )
            ball++;
        else if( judge == 3 && strike < 2 )
            strike++;
      }

      System.out.println( ball + "ボール," + strike + "ストライク" );

      // 練習4-15
      System.out.println( "数値を入力して下さい" );
      int value = Integer.parseInt( br.readLine() );
      int n;

      for( n = 2 ; n <= ( value / 2 ) ; n++ ){
          if( ( value % n ) == 0 )
              break;
      }

      if( n > ( value / 2 ) )
          System.out.println( value + "は素数です" );
      else
          System.out.println( value + "は素数ではありません" );
      
      // 練習4-16
      // 素因数分解
      System.out.println( "2以上の数値を入力して下さい" );
      int n = Integer.parseInt( br.readLine() );

      for( int x = 2 ; n > 1 ; x++ ){
          while( ( n % x ) == 0 ){
              System.out.print( x + " " );
              n /= x;
          }
      }

      // 練習4-17
      // 九九の表
      for( int p = 1 ; p <= 9 ; p++ )
      {
          for( int q = 1 ; q <= 9 ; q++ )
              System.out.printf(" %2d", p * q );

          System.out.println();
      }
      // 練習4-18
      int sum = 0;

      for( ; ; )
      {
          int value = Integer.parseInt( br.readLine() );

          if( value == 0 )
              break;

          sum += value;
      }

      System.out.println( "合計は" + sum );
    }
}