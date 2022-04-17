// 練習7-1

public class Exercise
{
    public static void main( String[] args )
    {
        Dog MyDog = new Dog();

        MyDog.SetName( "ぽち" );
        MyDog.ShowProfile();
    }
}

class Dog
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
    }
}
