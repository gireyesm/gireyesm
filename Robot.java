import java.util.HashMap;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        //Creates Hashmap with the different types of Robots
        HashMap<Integer, String> type = new HashMap<Integer, String>();
        //The commands below adds values to the type hashmap
        type.put(1, "UNIPEDAL");
        type.put(2, "BIPEDAL");
        type.put(3, "QUADRUPEDAL");
        type.put(4, "ARACHNID");
        type.put(5, "RADIAL");
        type.put(6, "AERONAUTICAL");
        //Creates Hashmap with the different times it takes to do a task
        HashMap<Integer, Integer> typetime = new HashMap<Integer, Integer>();
        //The commands below addsv values to the typetime hashmap
        typetime.put(1, 100);
        typetime.put(2, 200);
        typetime.put(3, 400);
        typetime.put(4, 400);
        typetime.put(5, 500);
        typetime.put(6, 600);
        //Creates hashmap with the different tasks available
        HashMap<Integer, String> tasks = new HashMap<Integer, String>();
        //The commands below adds values to the tasks hashmap
        tasks.put(1, "do wash dishes");
        tasks.put(2, "sweep house");
        tasks.put(3, "Do Laundry");
        tasks.put(4, "Take out Recyling Bin");
        tasks.put(5, "Make a sandwich");
        tasks.put(6, "Mow Lawn");
        tasks.put(7, "Rake Leaves");
        tasks.put(8, "Give dog Bath");
        tasks.put(9, "Bake Cookies");
        tasks.put(10, "Wash Car");
        // Creates hashmap with the time duration of each task
        HashMap<Integer, Integer> time = new HashMap<Integer, Integer>();
        //The command below adds the values to the time hashmap
        time.put(1, 1000);
        time.put(2, 3000);
        time.put(3, 10000);
        time.put(4, 4000);
        time.put(5, 7000);
        time.put(6, 20000);
        time.put(7, 18000);
        time.put(8, 14500);
        time.put(9, 8000);
        time.put(10, 20000);
        // Creates hashmap with the different tasks available
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        // The commands below adds values to the tasks hashmap
        color.put(1, "green");
        color.put(2, "blue");
        color.put(3, "pink");
        color.put(4, "red");
        color.put(5, "black");
        //Asks user to enter their name
        System.out.println("Greetings Human, what is your name");
        // Scanner1)Scanner represents General Scanner Class
        //      x represents the object that is being created
        //      new Scanner creates new Scanner Object 
        //      System.in reading input coming in
        Scanner x = new Scanner(System.in);
        // creates a string called name and calls "next" a method found in scanner that captures the input 
        String name=x.next();
        // Prints out string name
        //System.out.println(name);
        System.out.println();
        //Prints out hashmap of type
        System.out.println("Here are the types of robot available:");
        // Calls type list to be printed
        System.out.println(" " + type + " ");
        //Prints out the name of the user and then instructs them to select a type
        System.out.println(" "+name+" Please select a type of robot to build from 1 to 6 ONLY:");
        //reference back to Scanner1 line 52-56)
        Scanner input = new Scanner(System.in);
        // Integer.parseInt converts  String into Int using static method of the Integer Class.
        // int is then assigned to int i
        int i = Integer.parseInt(input.next());
        //returns the name of the user
        //.get() returns the string based of the integer that corresponds to it
        System.out.println(name+" , you have selected type:" + " " + type.get(i));
        //Displays list of color
        System.out.println(color);
        //allows user to choose color
        System.out.println("What color would you like your robot to be:");
        //reference back to Scanner1)
        Scanner input0 = new Scanner(System.in);
        //reference back to int i
        int y= Integer.parseInt(input0.next());
        //Shows user what color they selected
        System.out.println("you have selected" + " "+color.get(y));
        System.out.println();
        System.out.println("Tasks that robots can do:");
        //prints out list of tasks
        System.out.println(tasks);
        System.out.println();
        //allows user to begin assigning tasks and notifies them that they have 5 tasks to assign
        System.out.println("Congrats"+" "+name+" "+"you have choosen robot type:"+type.get(i)+", assign it a maximum of 5 tasks. What will be your first task?(Enter 1-10 ONLY):");
        //Reference back to Scanner1)
        Scanner a = new Scanner(System.in);
        //reference back to int i
        int j = Integer.parseInt(a.next());
        //grabs and displays the task given the assigned integer
        System.out.println("you have selected" + " " + tasks.get(j));
        //allows user to choose second task
        System.out.println("Nice Choice! What will be your second task(Enter 1-10 ONLY):");
        //reference back to Scanner1)
        Scanner b = new Scanner(System.in);
        //reference back to int i
        int k = Integer.parseInt(b.next());
        // grabs and displays the task given the assigned integer
        System.out.println("you have selected" + " " + tasks.get(k));
        //allows user to select third task
        System.out.println("Interesting, onto the third task(Enter 1-10 ONLY):");
        //referenc back to Scanner1)
        Scanner c = new Scanner(System.in);
        //referenc back to int i
        int l = Integer.parseInt(c.next());
        // grabs and displays the task given the assigned integer
        System.out.println("you have selected" + " " + tasks.get(l));
        //allows user to select fourth task
        System.out.println("Glad you got that out the way, what will be your fourth task(Enter 1-10 ONLY):");
        //reference back to Scanner1)
        Scanner d = new Scanner(System.in);
        //reference back to int i
        int m = Integer.parseInt(d.next());
        // grabs and displays the task given the assigned integer
        System.out.println("you have selected" + " " + tasks.get(m));
        //allows user to select fifth task
        System.out.println("Last, but not least, what is your last task(Enter 1-10 ONLY)");
        //reference back to Scanner1)
        Scanner f = new Scanner(System.in);
        //reference back to int i
        int n = Integer.parseInt(f.next());
        //// grabs and displays the task given the assigned integer
        System.out.println("you have selected" + " " + tasks.get(n));
        System.out.println("Time of Tasks:" );
        //displays list of times for teach task
        System.out.println(time);
        System.out.println(name+" "+"Based of your selections, this is how long it will take your robot to complete its tasks:");
        System.out.println();
        System.out.println("Color:"+" "+color.get(y));
        //calls back i to display the type of robot
        System.out.println("Robot Type:" + " "+ type.get(i));
        //Displays the sum of all the times and returns one final sum labeled as milliseconds
        System.out.println("Running time for tasks:" + " "
                + ((((((time.get(j) + time.get(k)) + time.get(l)) + time.get(m)) + time.get(n) + typetime.get(i))))
                + " " + "milliseconds");
        //Displays the tasks choosen to get the running time for tasks
        System.out.println("Running time was produced by following tasks:"+tasks.get(j)+ ", "+ tasks.get(k)+ ", "
                 + tasks.get(l)+ ", "  + tasks.get(m)+ ", "  + tasks.get(n) );
        //Exit Message
        System.out.println( "We hope you had fun building your robot");
        System.out.println("Feel Free to execute the program again! We Encourage you to check out different outcomes");
        System.out.println("...P.S. One Day Robots will rule the world!");
        System.out.println();
        //provides different testing cases 
        System.out.print("Testing Different outcomes based of different inputs");
        System.out.println();
        System.out.println("Color:" + " " + color.get(1));
        // calls back i to display the type of robot
        System.out.println("Robot Type" + " " + type.get(1));
        // Displays the sum of all the times and returns one final sum labeled as
        // milliseconds
        System.out.println("Running time for tasks:" + " "
                + ((((((time.get(1) + time.get(2)) + time.get(3)) + time.get(4)) + time.get(5) + typetime.get(1))))
                + " " + "milliseconds");
        System.out.println("Running time was produced by:" + tasks.get(1) + ", " + tasks.get(2) + ", " + tasks.get(3)
                + ", " + tasks.get(4) + ", " + tasks.get(5)+type.get(1));
    }

}
