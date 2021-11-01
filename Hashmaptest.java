import java.util.HashMap;
import java.util.Scanner;
public class Hashmaptest
{
    public static void main (String[] args)
    {
         
        HashMap<Integer , String> type = new HashMap<Integer, String>();
        type.put(1,"UNIPEDAL");
        type.put(2,"BIPEDAL");
        type.put(3, "QUADRUPEDAL");
        type.put(4, "ARACHNID");
        type.put(5, "RADIAL");
        type.put(6, "AERONAUTICAL");
        System.out.println(type);
            
        System.out.println(" SELECT A TYPE OF ROBOT FROM 1-6:");
        Scanner input = new Scanner(System.in);
        int i= Integer.parseInt(input.next());
        System.out.println("you have selected type:" + " " + type.get(i));
    
        HashMap<Integer , Integer> typetime= new HashMap<Integer, Integer>();
        typetime.put(1, 100);
        typetime.put(2, 200);
        typetime.put(3, 400);
        typetime.put(4, 400);
        typetime.put(5, 500);
        typetime.put(6, 600);

        HashMap<Integer , String> tasks = new HashMap<Integer, String>();
        tasks.put(1, "do wash dishes");
        tasks.put(2, "sweep house");
        tasks.put(3, "Do Laundry");
        tasks.put(4, "Take our Recyling Bin");
        tasks.put(5, "Make a sandwich");
        tasks.put(6, "Mow Lawn");
        tasks.put(7, "Rake Leaves");
        tasks.put(8, "Give dog Bath");
        tasks.put(9, "Bake Cookies");
        tasks.put(10, "Wash Car");
        System.out.println(tasks);

        System.out.println("Now, Select task 1/5 for the your robot");
        Scanner a = new Scanner(System.in);
        int j= Integer.parseInt(a.next());
        System.out.println("you have selected" + " " + tasks.get(j));
    
        
        System.out.println("Now, Select task 2/5 for the your robot");
        Scanner b = new Scanner(System.in);
        int k= Integer.parseInt(b.next());
        System.out.println("you have selected" + " " + tasks.get(k));

        
        System.out.println("Now, Select task 3/5 for the your robot");
        Scanner c = new Scanner(System.in);
        int l = Integer.parseInt(c.next());
        System.out.println("you have selected" + " " + tasks.get(l));

        System.out.println("Now, Select task 4/5 for the your robot");
        Scanner d = new Scanner(System.in);
        int m= Integer.parseInt(d.next());
        System.out.println("you have selected" + " " + tasks.get(m));
        
        System.out.println("Now, Select task 5/5 for the your robot");
        Scanner f = new Scanner(System.in);
        int n= Integer.parseInt(f.next());
        System.out.println("you have selected" + " " + tasks.get(n));
        
        

        System.out.println("This is the running time for the tasks");
        HashMap<Integer , Integer> time = new HashMap<Integer, Integer>();
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
        System.out.println(time);        
        System.out.println("Running time for tasks:"+((((time.get(j)+time.get(k))+time.get(l))+time.get(m))+time.get(n)+typetime.get(i)));




            

            
    }

    
}