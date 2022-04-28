import java.lang.Math;
public class Q2b {

	public double funtionSolver(double n, double e) {
			double lo = 0;
			double hi = n;
			double v = (hi+lo)/2;

			boolean b = (hi-lo > 2*e);

			int index = 0;
			System.out.println("iteration: "+index+", "+b+", "+"hi: "+hi+", "+"lo:"+lo);

			index++;
			while (hi-lo > 2*e) {
				System.out.print("iteration: "+ index+", "+"true, ");
				System.out.print("f(v): "+ (v*v-10) +", ");
				if (v*v-10 == 0) {
					System.out.print("=, ");
					return v;
				}
				if (v*v-10 < 0) {
					System.out.print("<, ");
					lo = v;
				}
				if (v*v-10 > 0) {
					System.out.print(">, ");
					hi = v;
				}
				v = (hi+lo)/2;
				System.out.print("hi: "+hi+", ");
				System.out.print("lo: "+lo+"\n");
				index++;
			}
			System.out.println("iteration: "+ index+", "+"false");
			return v;
		}

	public static void main(String[] args) {
		Q2b q2b = new Q2b();
		System.out.println("return: "+q2b.funtionSolver(4,0.25));
	}
}