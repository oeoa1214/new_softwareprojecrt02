package service;

public class file_printer {
    private static String string;

    public void buffer(String string)
    {
        this.string=string;

    }

    public void choice()
    {
        IO.println(this.string);
    }


}
