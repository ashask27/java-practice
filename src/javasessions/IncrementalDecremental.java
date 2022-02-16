package javasessions;

public class IncrementalDecremental {

	public static void main(String[] args) {
		int a = 1;
		int b = a++;  //post increment
		
		System.out.println(a);
		System.out.println(b);
		
		int c = -99;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		int h = 1;
		int g = ++h;
		System.out.println(h);
		System.out.println(g);
		
		int x = 1;
		int y = (x++) + x;
		System.out.println(y);
		
		int l = -98;
		int i = ++l;
		System.out.println(l);
		System.out.println(i);
		
		int t = 10;
		System.out.println(t++);
		System.out.println(t++);
		
		
		int c1 = 2;
		int s1 = c1--;
		
		System.out.println(c1);
		System.out.println(s1);
		
		double ff = 12.33;
		System.out.println(++ff);
		
		char c2 = 'a';
		System.out.println((int)++c2);
	}

}
