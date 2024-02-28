package projects;

public class VotingStaticMethod {
	public static boolean agecheck(int age)
	{
		return(age>=18);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean checking = VotingStaticMethod.agecheck(36);
		System.out.println("Eligibility for the Candidate is:"+checking);
	}

}
