package Insurance;

public class Surveyor {
    String name;
    int age;
    public boolean validateClaim(String claimId){
        System.out.println("Validating claim: "+claimId);
        if(claimId.equals("Si3176378")){
            Manager manager = new Manager();
            if(manager.approveClaim()){
                System.out.println("Claim Approved");
                return true;
            }else{
                System.out.println("Claim was not approved");
                return false;
            }
        }else{
            System.out.println("Claim id is not valid");
            return false;
        }
    }
}
