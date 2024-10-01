import java.util.Scanner;

public class main {
    public static String[] todos = new String[3];
    public static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] ergs) {
        addTodoList("Mewarnai");
        addTodoList("Mewarnai");
        addTodoList("Mewarnai");
        showTodoList();

    }
    public static void showTodoList() {
        System.out.println("TODO LIST");
        for (int i = 0; i < todos.length; i++);
        String todo = todos[i];
        if (todo != null) {
            System.out.println(i + 1) + ", " + todo);
        }
    }
    public static void addTodoList(String todo) {
        for(int i = 0; i < todos.length; i++){
            if(todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
    }
    public static void resizeIffull() {
        // cek whather todos is full
        Boolean isFull = true;
        // isFull = isArrayFull(isFull);

        // if full, resize current array to two times bigger
        if (isFull) {
            //resizeArrayTotwoTimesBigger
        }
    }

    public static Boolean isArrayFullaa(){
        for (int  i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                return false;
            }
        }
        return true;
    }
    public static void resizeArrayToTwoTimesBigger(){
        String[] temp = todos;
        todos =new  String[todos.length * 2];
        for (int i = 0; i < temp.length; i++){
            todos[i] = temp[i];
        }
    }

}