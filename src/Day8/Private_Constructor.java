package Day8;

class Vault{
	String password;
	private Vault(String password) {
		this.password=password;
		System.out.println("Vault created successfully!");
	}
	
	void showPassword() {
		System.out.println("Password is: "+password);
	}
	
	//Method 1 
	static void createVault() {
		Vault v = new Vault("Anuja123");
		v.showPassword();
	}
	
	//Method 2
	public static Vault vaultCreation() {
		return new Vault("A");
	}
	
	// Method 3 - nested class
	static class VaultAccess{
		static void create() {
			Vault v = new Vault("Ann");
		}
	}
	
	//Method 4- By another Method 
	public static void Vault_Creation() {
		Vault vt = new Vault("A");
	}
}

public class Private_Constructor {

	public static void main(String[] args) {
//		Vault v1= new Vault("Anuja123");			//exception!
		
//		Vault.createVault();						//Method 1
//		Vault va = Vault.vaultCreation();			//Method 2
//		Vault.VaultAccess.create();					//Method 3
//		Vault.Vault_Creation();						//Method 4
		
		

	}

}
