import java.util.*;

public class Stack_Imp {
	int element;
	private ArrayList<Integer> stack=null;
	public Stack_Imp()
	{
		stack=new ArrayList<Integer>();
	}
	public void push(int item)
	{
		stack.add(item);
	}
	public int pop()
	{
		element=0;
		if(stack.isEmpty())
		{
			System.out.println("stack empty");
			System.exit(1);
		}
		else
		{
			element=stack.remove(stack.size()-1);
		}
		return element;
	}
	public int top()
	{
		element=0;
		if(!stack.isEmpty())
			element=stack.get(stack.size()-1);
		return element;
	}
	
public static void main(String args[])
{
	Stack_Imp st=new Stack_Imp();
	int item;
	System.out.println("welcome to stack implementation...........");
	while(true)
	{
	System.out.println("1.PUSH");
	System.out.println("2.POP");
	System.out.println("3.TOP");
	System.out.println("4.EXIT");
	System.out.println("Enter your choice");
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("enter an element to push");
		item=sc.nextInt();
		st.push(item);
		break;
	case 2:
		item=st.pop();
		System.out.println("The item popped is : "+item);
		break;
	case 3:
		item=st.top();
		System.out.println("element at top is :"+item);
		break;
	case 4:
		System.exit(0);
	}
    }
}
}
