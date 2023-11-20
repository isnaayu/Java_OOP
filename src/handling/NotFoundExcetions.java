package handling;

public class NotFoundExcetions extends Exception{
    public NotFoundExcetions(String messages) {
        super("not Found = "+messages+"(Ini Custom Error)");
    }
}
