package BusResv;

public class Bus {

	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	public void setCapacity(int cap) {
		capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + " AC:" +ac +" Total Capacity: "+capacity);
	}
}
