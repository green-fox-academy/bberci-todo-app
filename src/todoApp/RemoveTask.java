package todoApp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoveTask extends ListTasks {

  public void removeTasks(int taskWhatWeWantToRemove){
    readFile().remove(taskWhatWeWantToRemove - 1);
    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, tasks);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
