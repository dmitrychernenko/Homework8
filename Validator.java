import java.util.regex.*;

public class Validator
{
    public Validator() { }

    public static boolean IdValidation(String input)
    {
        //id книги должен быть 9 символов, если меньше - бросится эксепшн
        return Pattern.matches("[a-z0-9]{9}", input);
    }
}
