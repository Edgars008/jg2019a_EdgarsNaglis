package HomeWork_11;

public class UserRepositoryMock extends UserRepository{


    private boolean isSaveTrggered;

    @Override
    public void save() {
        this.isSaveTrggered=true;
        System.out.println("Mock triggered");
    }

    public boolean isSaveTrggered(){
        return this.isSaveTrggered;
    }
}
