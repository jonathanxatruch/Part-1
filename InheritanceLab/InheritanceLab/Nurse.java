
public class Nurse extends HospitalEmployee{
	protected int numOfPatients;
	Nurse(String empName, int empNumber, int numPatients) {
		super(empName, empNumber);
		numOfPatients = numPatients;
	}
	
	@Override
	public String toString()
	{
		return name + "\t" + number + "\thas " + numOfPatients + " patients.";
	}
	
	@Override
	public void work()
	{
		System.out.print(name + " works for the hospital. ");
		System.out.println(name + " is a nurse with " + numOfPatients + " patients.");
	}
}