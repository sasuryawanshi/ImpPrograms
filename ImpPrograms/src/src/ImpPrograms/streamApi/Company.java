package ImpPrograms.streamApi;

public class Company {
int cId;
String cName;
int empCount;


public Company(int cId, String cName, int empCount) {
	super();
	this.cId = cId;
	this.cName = cName;
	this.empCount = empCount;
}
@Override
public String toString() {
	return "Company [cId=" + cId + ", cName=" + cName + ", empCount=" + empCount + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cId;
	result = prime * result + ((cName == null) ? 0 : cName.hashCode());
	result = prime * result + empCount;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Company other = (Company) obj;
	if (cId != other.cId)
		return false;
	if (cName == null) {
		if (other.cName != null)
			return false;
	} else if (!cName.equals(other.cName))
		return false;
	if (empCount != other.empCount)
		return false;
	return true;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public int getEmpCount() {
	return empCount;
}
public void setEmpCount(int empCount) {
	this.empCount = empCount;
}


	public static void main(String[] args) {


	}
}
