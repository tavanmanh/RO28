package entity.Exercise3;

public class MyException extends Exception{
    private String err;

    public MyException(String err) {
        super(err);
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }
}
