package exceptions;

public class Implementation {
    
    // ������ � ��������� Exception
    static void exception(){
        // ��������� throw ��������� ������ ������
        try{
            // ����������� ����������
            throw new NullPointerException("t = null");
        }
        // ���������� ���������� NullPointerException
        catch (NullPointerException e){
            e.printStackTrace(System.err);
        }  // ���������� ���������� Exception
        catch (Exception e){
            
        } // ����������� ����� ������ �� try. ����������� �����.
        finally {
            System.out.println("FINAL");
        }
    }
    
    // ��� Exception
    static void myException(){
        try{
            throw new MyException();
        }
        catch (NullPointerException e){
            System.err.println("Exception appeared: " + e);
        }
        catch (Exception e){
            System.err.println("Exception appeared: " + e);
        }
    }
    // throws ���������� ��� ��������� �������������� ���� ����������
    static void unhandeledException() throws MyException{
        throw new MyException();
    }
    
    static void myLoggedException(){
        try{
            int qi = 1000 / 0;
        }
        catch (ArithmeticException e){
//            MyException.logException(e);
            System.err.println(e.getMessage() + e.getLocalizedMessage());
            e.printStackTrace(System.err);
            for (StackTraceElement s : e.getStackTrace()){
                System.err.println(s);
            }
        // ��������� ����������� ���������
        throw(e);
        }
        catch (Exception e){
            MyException.logException(e);
        }

    }

}
