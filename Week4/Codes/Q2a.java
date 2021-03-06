import java.lang.Math;
public class Q2a {

	public double funtionSolver(double n, double e) {
			double lo = 0;
			double hi = n;
			double v = (hi+lo)/2;

			boolean b = (hi-lo > 2*e);

			int index = 0;
			System.out.println("iteration: "+index+", "+b+", " + "v: "+v+ ", "+"hi: "+hi+", "+"lo:"+lo);

			index++;
			while (hi-lo > 2*e) {
				System.out.print("iteration: "+ index+", "+"true, ");
				System.out.print("f(v): "+ (Math.exp(v)-1/v) +", ");
				System.out.print("v: "+ v+ ", ");
				if ((Math.exp(v)-1/v) == 0) {
					System.out.print("=, ");
					return v;
				}
				if ((Math.exp(v)-1/v) < 0) {
					System.out.print("<, ");
					lo = v;
				}
				if ((Math.exp(v)-1/v) > 0) {
					System.out.print(">, ");
					hi = v;
				}
				v = (hi+lo)/2;
				System.out.print("hi: "+hi+", ");
				System.out.print("lo: "+lo+"\n");
				index++;
			}
			System.out.println("iteration: "+ index+", "+"false"+", "+"hi: "+hi+", "+"lo:"+lo);
			return v;
		}

	public static void main(String[] args) {
		Q2a q2a = new Q2a();
		System.out.println("return: "+q2a.funtionSolver(2,0.0625));
	}
}