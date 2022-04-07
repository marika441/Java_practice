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

    // 練習5-2
    int     values[] = new int[10];

    for( int i = 0 ; i < 10 ; i++ )
        values[i] = Integer.parseInt( br.readLine() );

    System.out.println();

    for( int i = 9 ; i >= 0 ; i-- )
        System.out.println( values[i] );

    // 練習5-3
    int     values[] = new int[10];

    for( int i = 0 ; i < 10 ; i++ )
        values[i] = Integer.parseInt( br.readLine() );

    System.out.print( "\n偶数:" );

    for( int n : values )
        if( ( n % 2 ) == 0 )
            System.out.print( n + " " );

    System.out.print( "\n奇数:" );

    for( int n : values )
        if( ( n % 2 ) != 0 )
            System.out.print( n + " " );

    // 練習5-4
    int     values[] = new int[10];
    int     cnt, sum;

    for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ )
    {
        values[cnt] = Integer.parseInt( br.readLine() );
        sum += values[cnt];
    }

    for( int i = 0 ; i < cnt ; i ++ )
        System.out.print( "\n" + values[i] );

    // 練習5-5
    int value = Integer.parseInt( br.readLine() );

    int binary[] = new int[16];

    for( int i = 15 ; i >= 0 ; i--, value /= 2 )
        binary[i] = value % 2;

    for( int i = 0 ; i < 16 ; i++ )
        System.out.print( binary[i] );

    // 練習5-6
        for( int i = 0 ; i < 9 ; i++ )
    {
        kuku[i] = new int[9];

        for( int j = 0 ; j < 9 ; j++ )
            kuku[i][j] = ( i + 1 ) * ( j + 1 );
    }

    for( int i = 0 ; i < 9 ; i++ )
    {
        for( int j = 0 ; j < 9 ; j++ )
            System.out.printf( " %2d", kuku[i][j] );

        System.out.println();
    }

    // 練習5-7
    int kuku[][] = new int[9][9];

    for( int i = 0 ; i < 9 ; i++ )
        for( int j = 0 ; j < 9 ; j++ )
            kuku[i][j] = ( i + 1 ) * ( j + 1 );

    int p = Integer.parseInt( br.readLine() );
    int q = Integer.parseInt( br.readLine() );

    System.out.println( kuku[p-1][q-1] );

    // 練習5-8
    int values[] = new int[10];

    for( int i = 0 ; i < 10 ; i++ )
        values[i] = Integer.parseInt( br.readLine() );

    for( int i = 0 ; i < 10 ; i++ )
    {
        for( int j = i + 1 ; j < 10 ; j++ )
        {
            if( values[i] > values[j] ){
                int t = values[i];
                values[i] = values[j];
                values[j] = t;
            }
        }
    }

    for( int i = 0 ; i < 10 ; i++ )
        System.out.print( values[i] + " " );
    }
}