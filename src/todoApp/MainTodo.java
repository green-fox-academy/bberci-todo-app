package todoApp;

public class MainTodo {
  public static void main(String[] args) {
    PrintUsage startScreen = new PrintUsage();

    if (args[0].equals("todo")){
      startScreen.makeunderline();
    }
  }
}
