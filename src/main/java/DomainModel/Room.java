package DomainModel;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name;
    private String description;
    private List<Aeromobile> aeromobileList;

    public Room(String name, String description, List<Aeromobile> aeromobileList) {
        this.name = name;
        this.description = description;

        if (aeromobileList != null) {
            this.aeromobileList = aeromobileList;
        } else {
            this.aeromobileList = new ArrayList<>();
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Aeromobile> getAeromobileList() {
        return aeromobileList;
    }

    public void addAeromobile(Aeromobile aeromobile) {
        this.aeromobileList.add(aeromobile);
    }

    public void removeAeromobile(Aeromobile aeromobile) {
        this.aeromobileList.remove(aeromobile);
    }

}
