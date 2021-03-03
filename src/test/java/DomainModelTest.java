import DomainModel.Aeromobile;
import DomainModel.Human;
import DomainModel.Room;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DomainModelTest {

    @Test
    void testAeromobile() {
        Aeromobile aeromobile = new Aeromobile(1);
        Assertions.assertEquals(1, aeromobile.getId());
    }

    @Test
    void testHuman() {
        Aeromobile aeromobile = new Aeromobile(2);
        Human human = new Human("DDD", aeromobile);
        Assertions.assertEquals("DDD", human.getName());
        Assertions.assertEquals(aeromobile, human.getAeromobile());
    }

    @Test
    void testRoom() {
        Room room = new Room("room","cool room", null);
        Assertions.assertEquals("room", room.getName());
        Assertions.assertEquals("cool room", room.getDescription());
        Assertions.assertEquals(Arrays.asList(),room.getAeromobileList());

        Aeromobile aeromobile = new Aeromobile(1);
        room.addAeromobile(aeromobile);
        Assertions.assertEquals(Arrays.asList(aeromobile), room.getAeromobileList());

        room.removeAeromobile(aeromobile);
        Assertions.assertEquals(Arrays.asList(), room.getAeromobileList());
    }

    @Test
    void testAeromobileAdding() {
        Room room = new Room("room","cool room", null);
        Aeromobile aeromobile = new Aeromobile(1);
        room.addAeromobile(aeromobile);
        Assertions.assertEquals(Arrays.asList(aeromobile), room.getAeromobileList());
    }

    @Test
    void testAeromobileRemoving() {
        Aeromobile aeromobile = new Aeromobile(1);
        Room room = new Room("room","cool room", new ArrayList<>(Arrays.asList(aeromobile)));
        room.removeAeromobile(aeromobile);
        Assertions.assertEquals(Arrays.asList(), room.getAeromobileList());
    }

}
