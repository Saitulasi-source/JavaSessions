package JavaSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		int x=-99;
		int y=x++;
		System.out.println(x);
		System.out.println(y);
		int m=1;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		int p=-89;
		int q=++p;
		System.out.println(p);
		System.out.println(q);
		int h=2;
		int g=h--;
		System.out.println(h);  
		System.out.println(g);
		int t=2;
		int w=--t;
		System.out.println(t);
		System.out.println(w);
		int v=2;
		System.out.println(v++);
		System.out.println(v);
		int c=3;
		System.out.println(++c);
		System.out.println(c);
		double d1=1.5;
		double d2=d1++;
		System.out.println(d1);
		System.out.println(d2);
		int i=1010;
		int j=1010;
		System.out.println(i++ / ++j * j-- / --i);
	}

}
