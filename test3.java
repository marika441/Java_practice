import java.io.*;

public class Exercise
{
    public static void main( String[] args ) throws IOException
    {
      // 練習5-1
      // 10個の数値を入力・各数値を倍にして表示
      BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
      int     values[] = new int[10];

      for( int i = 0 ; i < 10 ; i++ )
          values[i] = Integer.parseInt( br.readLine() );

      System.out.println();

      for( int i = 0 ; i < 10 ; i++ )
          System.out.println( values[i] * 2 );
    }
}