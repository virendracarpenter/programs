import java.util.*;
class sort_insertion
{
  public static void main()
  {
    Scanner in = new Scanner(System.in);
    //declaration of the array
    String name[]= new String[5];
    int marks[]= new int[5];
    String temp1;
    int i,j,temp2;
    //input names and their marks
    System.out.println("Enter 5 names and their marks");
    for(i=0;i<5;i++)
    {
    name[i]=in.next();
    marks[i]=in.nextInt();
    }
    //sorting the array using insertion sort technique
   for(i=1;i<5;i++)
   {
   temp1=name[i];
   temp2=marks[i];
   j=i-1;
   
   while(j>=0 && temp2>marks[j])
   {
    marks[j+1]=marks[j];
    name[j+1]=name[j];
    j=j-1;
    }
   name[j+1]=temp1;
   marks[j+1]=temp2;
}
  //printing the sorted array
  System.out.println("Content");
  System.out.println("Name "+"\t"+" marks");
  for(i=0;i<5;i++)
  {
  System.out.println(name[i]+"\t" +marks[i]);
  }
}
}
