package todoApp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;
import java.util.*;

public class ListTasks {
  String path = "todoApp/list.txt";
  List<String> tasks = new ArrayList<>();
  boolean completed;

  public List<String> readFile(){
    Path filePath = Paths.get(path);
    try{
      tasks = Files.readAllLines(filePath);
    }catch (IOException e){
      System.out.println(e);
    }
    return tasks;
  }

  public void listTheTasks(List<String> readFile){
    if (tasks.size() == 0){
      System.out.println("No todos for today :)");
    }else {
      for (int i = 1; i <= tasks.size() ; i++) {
        System.out.println(i + " - " + tasks.get(i - 1));
      }
    }
  }
}
