// HackerRank
//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        /*
        Notice this scan.nextLine();
        After supplying data for int, we would hit the enter key.
        What nextInt() and nextDouble() does is it assigns integer to
        appropriate variable and keeps the enter key unread in thekeyboard buffer.
        So when its time to supply String the nextLine() will read the enter key from
        the user thinking that the user has entered the enter key.(that's we get empty output) .
        Unlike C, there is no fflush() to clean buffer, so we have to flush by not taking it in variable.
        Explanation by @Akshatsaxena21
        */
        /*
        Invisible "\n" newlines

        At the end of each line of the provided input, there is an invisible "\n" which is called a newline character.
        This basically represents what happens when you press the "Enter" key when typing.

        1) The first scan.nextInt() grabs the first "int" from the input. It still leaves the "\n" on that line.

        2) The second scan.nextDouble() skips over that "\n" and grabs the first "double" it sees.

        3) Now is the tricky part. It turns out scan.nextLine() works differently
        than scan.nextInt() and scan.nextDouble() in that it doesn't skip over any "\n" newline characters.
        What it does is it reads and returns all characters until it reaches the "\n" (which it gets rid of), and stops.
        In the scenario above, since "\n" is the first thing we see, we get an empty String back on our 1st call to scan.nextLine().

        4) Our next call to scan.nextLine() will start on line 3 of input and grab the String we want.
        */
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
