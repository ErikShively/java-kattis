//https://open.kattis.com/problems/speedlimit

import java.util.Scanner;

public class spLimit {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int lineCount = in.nextInt();
      while(lineCount != -1)
      {
          int rTotal = 0;
          int dist = 0;
          for(int i = 0; i < lineCount; i++)
          {
              int speed = in.nextInt();
              int total = in.nextInt();
              int hours = total-rTotal;
              dist = dist + (hours * speed);
              rTotal = rTotal + hours;
          }
          System.out.println(dist + " miles");
          lineCount = in.nextInt();
      }
    }
}
