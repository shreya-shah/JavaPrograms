package Insurance;

public class ClaimManager {
    String name;
    int age;
    Surveyor surveyor;

    public ClaimManager(Surveyor surveyor) {
        this.surveyor = surveyor;
    }

    public boolean approveClaim(String claimId){
        if(surveyor.validateClaim(claimId)){
            return true;
        }else{
            return false;
        }

    }
}
