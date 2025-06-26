package oops;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name="Ajay",project="Bank")
class AnnoDemo 
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}

public class UserDefinedAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
