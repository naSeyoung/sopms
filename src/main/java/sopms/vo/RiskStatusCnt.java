package sopms.vo;

//dashboard 리스크 상태 차트 VO
public class RiskStatusCnt {
	private String status;
	private int cnt;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
