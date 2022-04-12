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

  // 練習6-3
  public static void main( String[] args ) throws IOException
  {
      BufferedReader br = new BufferedReader(
                              new InputStreamReader( System.in ) );

      int x = Integer.parseInt( br.readLine() );
      int y = Integer.parseInt( br.readLine() );
      int z = Integer.parseInt( br.readLine() );

      System.out.println( MaxValue( x, MaxValue( y, z ) ) );
  }

  static int MaxValue( int n1, int n2 )
  {
      if( n1 > n2 )
          return n1;
      else
          return n2;
  }

  // 練習6-4
  public static void main( String[] args )
  {
      DrawTriangle( 3 );
      System.out.println();
      DrawTriangle( 4 );
      System.out.println();
      DrawTriangle( 5 );
  }

  static void DrawTriangle( int size )
  {
      for( int i = 0 ; i < size ; i++ )
      {
          for( int j = 0 ; j <= i ; j++ )
              System.out.print( "$" );

          System.out.println();
      }
  }

  // 練習6-5
  public static void main( String[] args )
  {
      DrawTriangle2( 3, '%' );
      System.out.println();
      DrawTriangle2( 5, '#' );
      System.out.println();
      DrawTriangle2( 7, '@' );
  }

  static void DrawTriangle2( int size, char ch )
  {
      for( int i = 0 ; i < size ; i++ )
      {
          for( int j = 0 ; j <= i ; j++ )
              System.out.print( ch );

          System.out.println();
      }
  }
}