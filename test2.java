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
  }
}