package bank;

public class PermissionException extends Exception{
    public PermissionException(String errMessage){
        super(errMessage);
    }
}
