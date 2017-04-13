package test_1;

class Box{
	double w;
	double h;
	double d;
	
	 Box(double w,double h,double d){
		this.w = w;
		this.h = h;
		this.d = d;
		}
		
		 public String toString(){
			return "H = " + h + "\nW = " + w + "\nD = " + d;
		}
	}


public class ToString {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Box b = new Box(1.1,2.3,4.5);
		
		String s = b.toString();
		System.out.println(s);
	}

}
