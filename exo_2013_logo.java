public class exo_2013_logo
{
 public static void main (String []args)
 { 
  
   for (int i = 1; i <= 13; i++) 
   {
    for(int j = 1; j <= 18; j++) 
    {
           if(i==1||i==13)
           {
            if(j==3 || j==4 || j==12)
            {
            System.out.print("x");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==2 || i==12)
           {
            if(j==3 || j==5 || j==11 || j ==13)
            {
            System.out.print("o");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==3 || i==11)
           {
            if(j==4 || j==6 || j==10 || j ==12 || j==14)
            {
            System.out.print("x");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==4|| i==10)
           {
            if(j==5 || j==7 || j==9 || j==11 || j==13 || j==15)
            {
            System.out.print("o");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==5 || i==9)
           {
            if(j==6 || j==8 || j==10 || j==14 || j==16)
            {
            System.out.print("x");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==6 || i==8)
           {
            if(j==2 || j==3 || j==4 || j==5||j==6 || j==9|| j==15 || j==17)
            {
            System.out.print("o");
            }
            else
            {
            System.out.print(" ");
            }
           }
            else if(i==7)
           {
              if(j==1 || j==9 || j==15|| j==18)
            {
            System.out.print("x");
            }
            else
            {
            System.out.print(" ");
            }
           }
           else
           {
           System.out.print(" ");
           }
        }
    System.out.println();
    }
    
 }
}






