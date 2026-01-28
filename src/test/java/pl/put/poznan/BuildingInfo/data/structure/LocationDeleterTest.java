package pl.put.poznan.BuildingInfo.data.structure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LocationDeleterTest {
    LocationDeleter locationDeleter;
    Location mock1,mock2,mock3;
    @BeforeEach
    void setUp() {
        mock1=mock(Location.class);
        mock2=mock(Location.class);
        when(mock1.findLocationById(1)).thenReturn(mock2);
        when(mock1.findParentLocationById(1)).thenReturn(mock3);
        locationDeleter = new LocationDeleter(1,mock1);
    }
    @AfterEach
    void tearDown() {
        locationDeleter = null;
    }

    @Test
    public void deleteLocationByIdTest1()
    {





        mock2=null;

        assertFalse(locationDeleter.deleteLocationById());


    }
    @Test
    public void deleteLocationByIdTest2()
    {
        mock3=null;
        assertFalse(locationDeleter.deleteLocationById());
    }
}
