package Ex53;
/**
 * 
 * @author Nguyen Trong Thuan
 * @since: 13/09/2016
 * @version: 1.0
 * --------------------------
 * create class max thread
 *
 */
public class MaxThread extends Thread{
	private int lo, hi;
	private int[] arr;
	private int max = 0;
	
	public MaxThread(int lo, int hi, int[] arr) {
		super();
		this.lo = lo;
		this.hi = hi;
		this.arr = arr;
	}

	public int getLo() {
		return lo;
	}

	public void setLo(int lo) {
		this.lo = lo;
	}

	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public void run(){
		for(int i = this.lo; i < this.hi; i ++){
			this.max=Math.max(arr[i], this.max);
		}
	}
}
