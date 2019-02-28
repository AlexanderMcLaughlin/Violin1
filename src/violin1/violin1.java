package violin1;

import java.util.Scanner;

public class violin1 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        for(int i=0; i<n; i++)
        {
            int[] fingers = {0,0,0,0,0};
            int notes = in.nextInt();
            int movements = 0;
            
            for(int j=0; j<notes; j++)
            {
                int next = in.nextInt();
                
                for(int k=next+1; k<5; k++)
                {
                    if(fingers[k]==1)
                    {
                        fingers[k]=0;
                        movements++;
                    }
                }
                
                if(fingers[next]!=1 && next!=0)
                {
                    fingers[next]=1;
                    movements++;
                }
                
            }
            
            
            System.out.println(movements);
        }
        
    }
    
}
