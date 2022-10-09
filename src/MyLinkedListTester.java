import java.util.LinkedList;

public class MyLinkedListTester
{
    public static void main(String[] args)
    {
        MyLinkedList al1 = new MyLinkedList();
        MyLinkedList al2 = new MyLinkedList();
        int tests = 0;
        int fails = 0;

        // small test
        al1.addFirst(65);
        al1.addFirst(72);
        al1.addLast(11);
        al1.addLast(32); // 72, 65, 11, 32

        tests++;
        if (al1.size() != 4)
        {
            System.out.println("size test failed");
            fails++;
        }

        tests++;
        if (al2.size() != 0)
        {
            System.out.println("empty test failed");
            fails++;
        }

        tests++;
        if (al1.get(1) != 72)
        {
            System.out.println("get test failed");
            fails++;
        }

        tests++;
        al1.set(2, 89); // 65, 72, 89, 32
        if (al1.get(2) != 89)
        {
            System.out.println("set/get test failed");
            fails++;
        }

        al1.add(1, 41);
        al1.add(5, 93); // 65, 41, 72, 89, 32, 93
        //System.out.println(printList(al1));
        tests++;
        if (al1.size() != 6)
        {
            System.out.println("add test 1 failed");
            fails++;
        }
        tests++;
        if (al1.get(2) != 72)
        {
            System.out.println("add test 2 failed");
            fails++;
        }
        tests++;
        if (al1.get(5) != 93)
        {
            System.out.println("add test 3 failed");
            fails++;
        }

        tests++;
        if (al1.remove(4) != 32) // 65, 41, 72, 89, 93
        {
            System.out.println("remove test 1 failed");
            fails++;
        }
        tests++;
        if (al1.size() != 5)
        {
            System.out.println("remove test 1 failed");
            fails++;
        }
        tests++;
        if (al1.get(4) != 93)
        {
            System.out.println("remove test 1 failed");
            fails++;
        }

        tests++;
        al1.clear();
        if (al1.size() != 0)
        {
            System.out.println("clear test failed");
            fails++;
        }

        if (fails > 0)
        {
            System.out.println("Small test: failed " + fails + " out of " + tests);
        }
        else
        {
            System.out.println("Small test: all tests passed");
        }

        // large test
        final int LOW_SIZE = 100;
        final int RANGE_SIZE = 20;
        final int LOW_VAL = 200;
        final int RANGE_VAL = 500;
        int n = (int)(LOW_SIZE + Math.random() * RANGE_SIZE);
        LinkedList<Integer> testList = new LinkedList<Integer>();

        boolean match = true;
        for (int i = 0; i < n; i++)
        {
            int e = (int)(LOW_VAL + Math.random() * RANGE_VAL);
            int x = (int)((testList.size() + 1) * Math.random());
            testList.add(x, e);
            al2.add(x, e);
        }
        for (int i = 0; i < n; i++)
        {
            if (testList.get(i) != al2.get(i))
            {
                match = false;
            }
        }
        System.out.print("Large value test:");
        System.out.println(match ? "passed" : "failed");

        match = true;
        for (int i = LOW_VAL; i < LOW_VAL + RANGE_VAL; i++)
        {
            if (testList.contains(i) != al2.contains(i))
            {
                match = false;
            }
        }
        System.out.print("Large contains test:");
        System.out.println(match ? "passed" : "failed");
    }

    public static String printList(MyLinkedList aList)
    {
        String result = "{";
        if (aList.size() > 0)
        {
            result += aList.get(0);
        }
        for (int i = 1; i < aList.size(); i++)
        {
            result += "," + aList.get(i);
        }
        result += "}";
        return result;
    }
}