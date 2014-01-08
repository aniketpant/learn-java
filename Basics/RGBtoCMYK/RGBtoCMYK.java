/**
 * RGBtoCMYK.java
 */

public class RGBtoCMYK {
  public static void main(String[] args) {
    float red = Integer.parseInt(args[0]);
    float green = Integer.parseInt(args[1]);
    float blue = Integer.parseInt(args[2]);

    float white, cyan, magenta, yellow, black;

    if (red == 0 && green == 0 && blue == 0) {
      cyan = 0;
      magenta = 0;
      yellow = 0;
      black = 1;
    } else {
      white = Math.max(red/255, Math.max(green/255, blue/255));

      cyan = (white - red/255)/white;
      magenta = (white - green/255)/white;
      yellow = (white - blue/255)/white;
      black = 1 - white;
    }

    System.out.println(cyan);
    System.out.println(magenta);
    System.out.println(yellow);
    System.out.println(black);
  }
}