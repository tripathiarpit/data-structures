package exceptions;

public class ExceptionsHandle {
    public static void show() throws  RuntimeException {
        try{
            System.out.println("Hi");
            throw  new RuntimeException();
        } catch (Exception e) {
            System.out.println("Exception Occours");
        }

    }

    public static void main(String[] args) {
        try {
            show();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException ");
        }
        System.out.println("end");
    }
}
