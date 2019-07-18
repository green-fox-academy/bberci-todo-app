package todoApp;

import java.util.ArrayList;

public class MainTodo {

  public static void main(String[] args) {
    ArrayList<String> commands = new ArrayList<>();
    commands.add("todo");
    commands.add("-r");
    commands.add("-a");
    commands.add("-c");
    commands.add("-l");
    PrintUsage startScreen = new PrintUsage();
    ListTasks tasks = new ListTasks();
    AddTasks addsomething = new AddTasks();
    RemoveTask remove = new RemoveTask();
    Check check = new Check();

    if (!commands.contains(args[0]))
      System.out.println("Unsupported argument");
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
    //if (args[0].equals("-c")){
    //  System.out.println(check.makeAnX(Integer.parseInt(args[1])));
    //}
    if (args[0].equals("-r")) {
      if (args.length == 1){
        System.out.println("Unable to remove: no index provided");
      }else if(!remove.isParsable(args[1])){
        System.out.println("Unable to remove: index is not a number");
      }else if(Integer.parseInt(args[1]) > remove.tasks.size()){
        System.out.println("Unable to remove: index is out of bound");
      }else
      remove.removeTasks(Integer.parseInt(args[1]));
    }
  }
}
