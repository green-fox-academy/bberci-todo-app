package todoApp;

import java.util.Arrays;

public class PrintUsage {
  String name = "Command Line Todo application";
  String underLineStyle = "=";
  String option1 = "\t-l   List all the tasks\n";
  String option2 = "\t-a   Adds a new task\n";
  String option3 = "\t-r   Removes a task\n";
  String option4 = "\t-c   Comletes a task";


  public void pintStartSreen(){
    String finalunderline = "";
    String underline[] = new String[name.length()];
    for (int i = 0; i < name.length(); i++) {
      underline[i] = underLineStyle;
    }
    finalunderline = Arrays.toString(underline);
    System.out.println(name);
    System.out.println(finalunderline);
    System.out.println(option1 + option2 + option3 + option4);


  }
}
