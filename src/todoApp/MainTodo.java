package todoApp;

public class MainTodo {

  public static void main(String[] args) {
    PrintUsage startScreen = new PrintUsage();
    ListTasks tasks = new ListTasks();
    AddTasks addsomething = new AddTasks();
    RemoveTask remove = new RemoveTask();

    if (args[0].equals("todo")) {
      startScreen.makeunderline();
    }
    if (args[0].equals("-l")) {
      tasks.listTheTasks(tasks.readFile());
    }
    if (args[0].equals("-a")) {
      if (args.length == 1) {
        System.out.println("no task provided");
      } else {
        addsomething.addTasks(args[1]);
      }
    }
    if (args[0].equals("-r")) {
      remove.removeTasks(Integer.parseInt(args[1]));
    }
  }
}
