import java.util.LinkedHashSet;
import java.util.Set;
public class Sets {
public static void main(String[] args)
{
	int count=0;
	Set<Integer>s1=new LinkedHashSet<Integer>();
	Set<Integer>s2=new LinkedHashSet<Integer>();
	s1.add(1);
	s1.add(54);
	s1.add(5);
	s1.add(4);
	//s1.add(2);
	//s1.add(3);
	s2.add(1);
	s2.add(54);
	s2.add(3);
	s2.add(5);
	System.out.println("Elements in first set:");
	System.out.print(s1);
	System.out.print("\n");
	System.out.println("Elements in second set:");
	System.out.print(s2);
	System.out.print("\n");
	for(Integer m:s1)
	{
		if(s2.contains(m))
			count++;
	}
	if(s1.size()==s2.size())
	{
	if(count==s1.size())
	{
		System.out.println("Sets are equal");
	}
	else
		System.out.println("Sets are not equal");
	}
	s1.retainAll(s2);
	System.out.print("Common elements are:"+s1);
}
}
