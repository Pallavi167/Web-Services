package clientpack;


public class Client {
	public static void main(String[] args) {
		Fortis fortis=new Fortis();
		MediClaim mediClaim=fortis.getMediClaimImplPort();
		Information info=mediClaim.getClaim(101);
		System.out.println(info.getMediinfo());
	}

}
