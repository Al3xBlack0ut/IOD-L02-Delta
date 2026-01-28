package pl.put.poznan.BuildingInfo.data.structure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
public class LocationAdderTest {
    LocationAdder locationAdder;
    Location mock1,mock2;
    @BeforeEach
    void setUp() {
        mock1=mock(Location.class);
        mock2=mock(Location.class);
        when(mock1.findLocationById(1)).thenReturn(mock2);

        locationAdder = new LocationAdder(mock1,1);
    }
    @AfterEach
    void tearDown() {
        locationAdder = null;
    }
    @Test
    public void addLocationTest1()
    {


        when(mock2.addSublocation(2,"f1",123,456,12,34)).thenReturn(true);
        LocationAdder locationAdder=new LocationAdder(mock1,2);
        assertTrue(locationAdder.addLocation(2,"f1",1,123,456,12,34));
    }
    @Test
    public void addLocationTest2()
    {

        when(mock1.checkIfExists(2)).thenReturn(false);
        assertFalse(locationAdder.addLocation(2,"f1",1,123,456,12,34));
    }
}
