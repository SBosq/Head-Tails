import java.util.Scanner;
/**
 * Heads or Tails FIT Game program that reads line by line.
 * First insert the number of cases that you wish to test out and hit enter.
 * Then insert the first case number (i.e. "1") and hit enter.
 * Afterwards type out the result of the 40 coin tosses and hit enter.
 * The program will return the case number,
 * followed by the number of times it found certain patterns.
 * Repeat this process until all cases have been ran through the program.
 * 
 * @Saulo Bosquez 
 * v1.1
 */
public class heads_Tails
{
    public static void main()
    {
        System.out.print('\u000c');
        String uno,dos,tres;
        Scanner datos=new Scanner(System.in);
        int num=datos.nextInt();
        for(int i=1;i<=num;i++)
        {
            Scanner dataNum=new Scanner(System.in);
            int numSet=dataNum.nextInt();
            Scanner set=new Scanner(System.in);
            String flips=set.nextLine();
            int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0;
            for(int j=0;j<=36;j+=3)
            {
                uno=flips.substring(j,(j+3));
                switch(uno)
                {
                    case "TTT":
                    sum1++;
                    break;
                    case "TTH":
                    sum2++;
                    break;
                    case "THT":
                    sum3++;
                    break;
                    case "THH":
                    sum4++;
                    break;
                    case "HTT":
                    sum5++;
                    break;
                    case "HTH":
                    sum6++;
                    break;
                    case "HHT":
                    sum7++;
                    break;
                    case "HHH":
                    sum8++;
                    break;
                }
            }
            for(int k=1;k<=37;k+=3)
            {
                dos=flips.substring(k,(k+3));
                switch(dos)
                {
                    case "TTT":
                    sum1++;
                    break;
                    case "TTH":
                    sum2++;
                    break;
                    case "THT":
                    sum3++;
                    break;
                    case "THH":
                    sum4++;
                    break;
                    case "HTT":
                    sum5++;
                    break;
                    case "HTH":
                    sum6++;
                    break;
                    case "HHT":
                    sum7++;
                    break;
                    case "HHH":
                    sum8++;
                    break;
                }
            }
            for(int l=2;l<=35;l+=3)
            {
                tres=flips.substring(l,(l+3));
                switch(tres)
                {
                    case "TTT":
                    sum1++;
                    break;
                    case "TTH":
                    sum2++;
                    break;
                    case "THT":
                    sum3++;
                    break;
                    case "THH":
                    sum4++;
                    break;
                    case "HTT":
                    sum5++;
                    break;
                    case "HTH":
                    sum6++;
                    break;
                    case "HHT":
                    sum7++;
                    break;
                    case "HHH":
                    sum8++;
                    break;
                }
            }
            System.out.println(i+" "+sum1+" "+sum2+" "+sum3+" "+sum4+" "+sum5+" "+sum6+" "+sum7+" "+sum8);
        }
    }
}