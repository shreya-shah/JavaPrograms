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
        CarInsuranceSurveyor carInsuranceSurveyor = new CarInsuranceSurveyor();
        ClaimManager claimManager= new ClaimManager(carInsuranceSurveyor);

        if(claimManager.approveClaim(claimId)){
            System.out.println(name+" your claim is filed.");
        }

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimManager claimManager2= new ClaimManager(healthInsuranceSurveyor);
    }
}
