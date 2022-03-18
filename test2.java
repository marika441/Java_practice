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

      // 練習4-2
      System.out.println( "数値を入力して下さい" );
      int sum = 0;
      while( sum <= 100 )
        sum += Integer.parseInt( br.readLine() );
      System.out.println( "合計は " + sum );
  }
}