import java.util.Scanner;
class LinkedList{
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node reverse(Node n){
		Node prev = null;
		Node current = n;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		n = prev;
		return n;
	}
	void insert(int data){
		Node new_node = new Node(data);
		
		if(head == null){
			head = new_node;
			return;
		}
		Node temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = new_node;
		return;
	}
	
	void display(Node a){
		Node n = a;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList obj = new LinkedList();
		
		int t = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			obj.insert(sc.nextInt());
		}
		
		obj.head = obj.reverse(obj.head);
		obj.display(obj.head);
	}
	
	
	
}