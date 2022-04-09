import java.io.*;

public class Exercise
{
  // 練習6-1
  public static void main( String[] args )
  {
    System.out.println( "3の2乗=" + pow2( 3 ) );
  }

  static int pow2( int n )
  {
      return n * n;
  }

  // 練習6-2
  public static void main( String[] args )
  {
      System.out.println( "4と9の平均=" + average( 4, 9 ) );
  }

  static int average( int x, int y )
  {
      return ( x + y ) / 2;
  }
}