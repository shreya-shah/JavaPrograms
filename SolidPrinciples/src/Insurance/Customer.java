package Insurance;

public class Customer {
    HealthInsurance healthInsurance;
    String name;
    int age;

    public Customer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void fileClaim(String claimId){
        System.out.println("Filing claim: "+claimId);
        Surveyor surveyor = new Surveyor();
        if(surveyor.validateClaim(claimId)){
            System.out.println(name+" your claim is filed.");
        }
    }
}
