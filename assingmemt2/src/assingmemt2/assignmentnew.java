package assingmemt2;

public class assignmentnew {

	public int sp(int a,int b)
	{ int c;
	c=a-b;
	return c;
	}
	public int vp(int c,int x)
	{ int y;
	y=c+x;
	return y;
	}
	public int dp(int y,int t)
	{ int s;
	s=y-t;
	return s;
	}
	public int lt(int s,int w)
	{ int z;
	z=s*w;
	return z;
	}
	public int hp(int z,int p)
	{ int q;
	q=z/p;
	return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignmentnew obj=new assignmentnew();
		int c=obj.sp(10,2);
		System.out.println("sub"+c);
		int y= obj.vp(c,2);
		System.out.println("sum"+y);
		int s=obj.dp(y,2);
		System.out.println("sub"+s);
		int z =obj.lt(s,2);
		System.out.println("mul"+z);
		int q=obj.hp(z,2);
		System.out.println("div"+q);


	}

}
