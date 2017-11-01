public class Binary_Rep {
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);

        String revBinary="";
        String binary= "";
        int y = n;
        int repeat = n/2+1;

        for(int i = 0; i < repeat; i++)
        {
            int x =y%2;
            revBinary = revBinary + x;
            y = y/2;
        }

        for(int i =revBinary.length(); i>0; i--)
        {
          binary = binary + revBinary.substring(i-1,i);

        }

            System.out.print(binary);
    }
}
