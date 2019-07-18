package todoApp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddTasks extends ListTasks {

  public void addTasks(String newTask) {
    readFile().add(newTask);
    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, tasks);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

