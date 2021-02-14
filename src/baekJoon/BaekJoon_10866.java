package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10866 {
	static int Deck[];
	static int rear=-1;
	
	static void push_front(int data) {
		rear++;
		for(int i=rear; i>0; i--) {
			Deck[i] = Deck[i-1];
		}
		Deck[0] = data;
	}
	
	static void push_back(int data) {
		rear++;
		Deck[rear] = data;
	}
	
	static void pop_front() {
		int tmp = Deck[0];
		if(rear<0) {
			System.out.println("-1");
			return;
		}
		for(int i=0; i<rear; i++) {
			Deck[i] = Deck[i+1];
		}
		rear--;
		System.out.println(tmp);
		return;
	}
	
	static void pop_back() {
		if(rear<0) {
			System.out.println("-1");
			return;
		}
		int tmp = Deck[rear];
		rear--;
		System.out.println(tmp);
		return;
	}
	
	static void size() {
		if(rear<0) {
			System.out.println("0");
			return;
		}
		System.out.println(rear+1);
		return;
	}
	
	static void empty() {
		if(rear<0) {
			System.out.println("1");
			return;
		}
		System.out.println("0");
		return;
	}
	
	static void front() {
		if(rear<0) {
			System.out.println("-1");
			return;
		}
		System.out.println(Deck[0]);
		return;
	}
	
	static void back() {
		if(rear<0) {
			System.out.println("-1");
			return;
		}
		System.out.println(Deck[rear]);
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//sc.nextLine();
		Deck = new int[N];
		System.out.println();
		for(int i=0; i<Deck.length; i++) {
			String s = sc.next();
			if(s.equals("push_front")) {
				int tmp = sc.nextInt();
				push_front(tmp);
			}
			else if(s.equals("push_back")) {
				int tmp = sc.nextInt();
				push_back(tmp);
			}
			else if(s.equals("pop_front"))
				pop_front();
			else if(s.equals("pop_back"))
				pop_back();
			else if(s.equals("size"))
				size();
			else if(s.equals("empty"))
				empty();
			else if(s.equals("front"))
				front();
			else if(s.equals("back"))
				back();
		}
		return;
	}
}

