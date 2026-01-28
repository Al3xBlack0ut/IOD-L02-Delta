package pl.put.poznan.BuildingInfo.data.structure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class LocationSelecterTest {
    LocationSelecter locationSelecter;
    Location mock1,mock2;
    @BeforeEach
    void setUp() {
        mock1=mock(Location.class);
        mock2=mock(Location.class);
        when(mock1.findLocationById(1)).thenReturn(mock2);
        locationSelecter = new LocationSelecter(mock1,1);
    }
    @AfterEach
    void tearDown() {
        locationSelecter = null;
    }
    @Test
    public void getAreaTest()
    {
        when(mock2.getArea()).thenReturn(123.0f);
        assertEquals(123.0f,locationSelecter.getArea());

    }
    @Test
    public void getCubeTest()
    {
        when(mock2.getCube()).thenReturn(456.0f);
        assertEquals(456.0f,locationSelecter.getCube());

    }
    @Test
    public void getHeatingTest()
    {
        when(mock2.getHeating()).thenReturn(12.0f);
        assertEquals(12.0f,locationSelecter.getHeating());

    }
    @Test
    public void getLightTest()
    {
        when(mock2.getLight()).thenReturn(34.0f);
        assertEquals(34.0f,locationSelecter.getLight());

    }
    @Test
    public void getLightperM2Test()
    {
        when(mock2.getLight()).thenReturn(12.0f);
        when(mock2.getArea()).thenReturn(4.0f);
        assertEquals(3.0f,locationSelecter.getLightperM2());

    }
    @Test
    public void getHeatingperM3Test()
    {
        when(mock2.getHeating()).thenReturn(4.0f);
        when(mock2.getCube()).thenReturn(8.0f);
        assertEquals(0.5f,locationSelecter.getHeatingperM3());

    }
    @Test
    public void getLocationNameTest()
    {
        mock2=null;
        assertNull(locationSelecter.getLocationName());

    }
}
