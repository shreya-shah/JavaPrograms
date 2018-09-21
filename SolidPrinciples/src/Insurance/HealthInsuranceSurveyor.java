package Insurance;

public class HealthInsuranceSurveyor implements Surveyor{
    String name;
    int age;
    public boolean validateClaim(String claimId){
        System.out.println("Validating claim: "+claimId);
        if(claimId.equals("Si3176378")){
                System.out.println("Claim Approved");
                return true;
            }else{
                System.out.println("Claim was not approved");
                return false;
            }
    }
}
