public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 38;
  public static int RED = 35;

  public static void color(int foreground,int background){
    System.out.print("\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print("\u001b[" + foreground + ";" + (100+background) + ";" + modifier + "m");
  }
  public static void main(String[] args) {
    for(int r = 0; r < 256; r+=12){
      for(int g = 0; g <= 256; g+=17){
        for(int b = 0; b <= 256; b+=15){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
      System.out.println();
    }
    System.out.print(HIDE_CURSOR);
  }
}
