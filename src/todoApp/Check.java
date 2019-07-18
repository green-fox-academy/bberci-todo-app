package todoApp;

import java.util.ArrayList;

public class Check extends ListTasks{

  public ArrayList<String> sizeOfList(){
    ArrayList<String> isItComplete = new ArrayList<>();
    for (int i = 0; i < tasks.size(); i++) {
      assert isItComplete.add("[ ]");
    }
    return isItComplete;
  }
  public
}
