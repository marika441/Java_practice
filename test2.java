import java.io.*;

public class Exercise
{
    public static void main( String[] args ) throws IOException
    {
      // 練習4-11
      BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
      int count = Integer.parseInt( br.readLine() );
      for(int i = 0; i < count; i++)
      System.out.println( i % 10 );
  }
}