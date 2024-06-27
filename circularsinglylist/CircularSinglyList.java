package com.circularsinglylist;

public class CircularSinglyList {
Node head;
int cnt;

public CircularSinglyList()
{
	head=null;
	cnt=0;
}
	

public boolean insertAtFirst(int data)
{
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		newNode.setNext(head);
		System.out.println("Element Inserted!!\n\n");
		cnt++;
		return true;
	}
	Node trav=head;
	while(trav.getNext()!=head)
	{
		trav=trav.getNext();
	}
	newNode.setNext(head);
	head=newNode;
	trav.setNext(head);
	System.out.println("Element Inserted At First!!\n\n");
	cnt++;
	return true;
}

public boolean insertAtLast(int data)
{
	Node newNode=new Node(data);
	if(head==null)
	{
		head=newNode;
		head.setNext(head);
		System.out.println("Element Inserted At Last!!\n\n");
		cnt++;
		return true;	
	}
	Node trav=head;
	while(trav.getNext()!=head)
	{
		trav=trav.getNext();
	}
	trav.setNext(newNode);
	newNode.setNext(head);
	System.out.println("Element Inserted At Last!!\n\n");
	cnt++;
	return true;
}

public boolean insertAtPosition(int pos,int data)
{
	if(pos>cnt)
	{
		System.out.println("We Have Only "+(cnt+1)+" Element Cannot insert!! Position is Wrong");
		return false;
	}
	if(pos==1)
	{
		return insertAtFirst(data);
	}
	if(pos==cnt)
	{
		return insertAtLast(data);
	}
	Node newNode=new Node(data);
	Node trav=head;
	for(int i=0;i<pos-2;i++)
	{
	trav=trav.getNext();	
	}
	newNode.setNext(trav.getNext());
	trav.setNext(newNode);
	System.out.println("Element inserted At Position "+pos);
	cnt++;
	return true;
}

public boolean deleteFirst()
{
	if(head==null)
	{
		System.out.println("List is Empty");
		return false;
	}
	if(head.getNext()==head)
	{
		head=null;
		System.out.println("First Element Deleted SuccessFully!! List is Empty");
		cnt--;
		return true;
	}
	Node trav=head;
	while(trav.getNext()!=head)
	{
		trav=trav.getNext();
	}
	head=head.getNext();
	trav.setNext(head);
	System.out.println("First Element Deleted SuccessFully ");
	cnt--;
	return true;
}

public boolean deleteLast()
{
	if(head==null)
	{
		System.out.println("List is Empty");
		return false;
	}
	if(head.getNext()==head)
	{
		head=null;
		System.out.println("Last Element Deleted SuccessFully!! List is Empty");
		cnt--;
		return true;
	}
	Node trav=head;
	while(trav.getNext().getNext()!=head)
	{
		trav=trav.getNext();
	}
	trav.setNext(head);
	System.out.println("Last Element Deleted SuccessFully!!");
	cnt--;
	return true;
}

public boolean deleteAtPos(int pos)
{
	if(pos<0 && pos>cnt)
	{
		System.out.println("Wrong Position");
		return false;
	}
	if(pos>cnt)
	{
		System.out.println("We Have Only "+(cnt+1)+" Element Cannot delete!! Position is Wrong");
		return false;
	}
	if(pos==1)
	{
		return deleteFirst();
	}
	if(pos==cnt)
	{
		return deleteLast();
	}
	Node trav=head;
	for(int i=0;i<pos-2;i++)
	{
		trav=trav.getNext();
	}
	trav.setNext(trav.getNext().getNext());
	System.out.println("Element deleted at position "+pos);
	cnt--;
	return true;
}

public boolean findElementPosition(int data)
{
	if(head==null)
	{
		System.out.println("List is Empty!!");
		return false;
	}
	int counter=0;
	Node trav=head;
	while(trav.getNext()!=head)
	{counter++;
		if(trav.getData()==data)
		{		
			System.out.println("Element found at "+counter+" Location" );
			return true;
		}
		trav=trav.getNext();
	}
	if(trav.getData()==data)
	{
		System.out.println("Element found at "+(counter+1)+" Location" );
		return true;
	}
	System.out.println("Element Not Found!!");
	return false;
}

public void display()
{
	if(head==null)
	{
		System.out.println("List is Empty");
		return ;
	}
	Node trav=head;
	while(trav.getNext()!=head )
	{
		
		System.out.print(trav.getData()+"-->");
		trav=trav.getNext();
	}
	System.out.println(trav.getData());
}

}
