
public class Main {

    public static void main(String[] args) {

        char[] input={'d','c','b','a'};
        powerSet(input,0,input.length,"");
        printBinary(3);
    }

    static void powerSet(char[] input,int bPosition, int n,String val)
    {
        if (bPosition == n)
        {
            System.out.println("{" + val + "}");
            return;
        }
        powerSet(input,bPosition+1, n,val);
        powerSet(input,bPosition+1, n,val + input[bPosition]);
    }

    public static void printBinary(int size)
    {
        int numRows = (int)Math.pow(2, size);
        boolean[][] bools = new boolean[numRows][size];
        for(int i = 0;i<numRows;i++)
        {
            for(int j = 0; j < size; j++)
            {
                int val = numRows * j + i;
                //System.out.println(val);
                int ret = (1 & (val >>> j));
                //System.out.println("val: " + val + " ,after >>> shift: " + (val>>>j) + ",ret: " + ret);
                bools[i][j] = ret != 0;
                System.out.print(bools[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
