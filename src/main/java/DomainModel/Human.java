package DomainModel;

public class Human {

    private String name;
    private Aeromobile aeromobile;

    public Human(String name, Aeromobile aeromobile) {
        this.name = name;
        this.aeromobile = aeromobile;
    }

    public String getName() {
        return name;
    }

    public Aeromobile getAeromobile() {
        return aeromobile;
    }
}
