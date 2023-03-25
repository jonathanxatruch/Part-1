
public class Doctor extends HospitalEmployee{
	protected String specialty;
	Doctor(String empName, int empNumber, String empSpecialty) {
		super(empName, empNumber);
		specialty = empSpecialty;
	}
	
	@Override
	public String toString()
	{
		return name + "\t" + number + "\t" + specialty;
	}
	
	@Override
	public void work()
	{
		System.out.print(name + " works for the hospital. ");
		System.out.println(name + " is a(n) " + specialty + " doctor.");
	}
}