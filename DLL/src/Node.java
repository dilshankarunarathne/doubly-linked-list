public class Node
{
	int data;
	Node previous;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
	
	Node(Node previous, int data, Node next)
	{
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	public int data()
	{
		return data;
	}
}