package service;

public class file_printer {
    private static String string;

    public void buffer(String string)
    {

        this.string=string;

    }

    public void choice()
    {
        if(string==null)
        {
            IO.println("빈 파일입니다.");
        }
        IO.println(this.string);
    }


}
