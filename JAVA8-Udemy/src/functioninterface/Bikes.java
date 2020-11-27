package functioninterface;

public class Bikes {
	
	private String bikeName;
	private String bikeNo;
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	@Override
	public String toString() {
		return "Bikes [bikeName=" + bikeName + ", bikeNo=" + bikeNo + "]";
	}
	

}
