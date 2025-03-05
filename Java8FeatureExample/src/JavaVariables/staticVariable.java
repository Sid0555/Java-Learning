package JavaVariables;

import java.util.ArrayList;
import java.util.List;

class Example {
    static int sharedCount = 0; // Static variable (shared among all objects)

    void incrementCount() {
        sharedCount++;
    }
}

public class staticVariable {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        Example obj3 = new Example();
        obj3 =new Example() ;

        obj1.incrementCount();
        System.out.println("Shared Count after obj1 increments: " + Example.sharedCount);

        obj2.incrementCount();
        System.out.println("Shared Count after obj2 increments: " + Example.sharedCount);
        
        obj3.incrementCount();
        System.out.println("Shared Count after obj3 increments: " + Example.sharedCount);
        
        List<int[]> list = new ArrayList<>();
        while(true)
        {
        	list.add(new int[1000000]);
        }

    }
}
