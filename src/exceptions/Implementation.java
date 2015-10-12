package exceptions;

public class Implementation {

    // Выброс и обработка Exception
    static void exception(){
        // запрещает throw завершать работу метода
        try{
            // возбуждение исключения
            throw new NullPointerException("t = null");
        }
        // обработчик исключения NullPointerException
        catch (NullPointerException e){
            e.printStackTrace(System.err);
        }  // обработчик исключения Exception
        catch (Exception e){

        } // Выполняется после выхода из try. Завершающий метод.
        finally {
            System.out.println("FINAL");
        }
    }

    // Мой Exception
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

    // throws отображает все возможные необработанные типы исключений
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
            // Повторное возбуждение эксепшена
        throw(e);
        }
        catch (Exception e){
            MyException.logException(e);
        }

    }

}
