import java.util.Scanner;

class two{
	int st[];
	int size;
	int top1;
	int top2;
	
	two(int n){
		size = n;
		st = new int[n];
		top1 = n/2 + 1;
		top2 = n/2;
	}
	
	void push1(int val){
		if(top1 > 0){
			st[--top1] = val;
		}
		else{
			System.out.println("Stack overflow");
			return;
		}
	}

	void push2(int val){
		if(top2 < size-1){
			st[++top2] = val;
		}
		else{
			System.out.println("Stack overflow");
			return;
		}
	}

	int pop1(){
		if(top1 <= size/2){
			int x = st[top1++];
			return x;
		}
		else{
			System.out.println("Stack underflow");
		}
		return 0;
	}
	
	int pop2(){
		if(top2 >= size/2 + 1){
			int x = st[top2--];
			return x;
		}
		else{
			System.out.println("Stack underflow");
		}
		return 1;
	}
}

class StackApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size");
		int a =  sc.nextInt();
		two obj = new two(a);
		
		
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Push to Stack 1");
			System.out.println("2. Push to Stack 2");
			System.out.println("3. Pop from Stack 1");
			System.out.println("4. Pop from Stack 2");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			if(choice == 1){
				System.out.println("Enter value");
				int x = sc.nextInt();
				obj.push1(x);
			}
			else if(choice == 2){
				System.out.println("Enter value");
				int x = sc.nextInt();
				obj.push2(x);
			}
			else if(choice == 3){
				System.out.println("Popped element from stack 1 is " + obj.pop1());
			}
			else if(choice == 4){
				System.out.println("Popped element from stack 2 is " + obj.pop2());
			}
			else if(choice == 5){
				break;
			}
			else{
				System.out.println("Invalid choice");
			}
		}
		
	}
}