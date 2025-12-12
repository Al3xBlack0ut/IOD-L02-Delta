package pl.put.poznan.BuildingInfo.logic;
import pl.put.poznan.BuildingInfo.data.structure.LocationController;
import pl.put.poznan.BuildingInfo.data.structure.Location;
import pl.put.poznan.transformer.model.TransformRequest;
import pl.put.poznan.transformer.model.TransformResponse;
import java.util.ArrayList;
/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class BuildingInfo {

    //private final String[] transforms;
    //private ArrayList<Location> lokacje=new ArrayList<Location>();
    private LocationController lokacje;
    private int id;
    public BuildingInfo(){
        //this.id = id;
        lokacje=new LocationController();
    }
    public void insert(int id,TransformRequest location)
    {
        //if(location.getParentId()!=-1)
        if((location.getType()).equals("Room"))
        {

            lokacje.addLocation(id,location.getName(),location.getParentId(),location.getArea(),location.getCube(),location.getHeating(),location.getLight());
        }
        else
            lokacje.addLocation(id,location.getName(),location.getParentId());
        /*else
        {
            lokacje.addLocation(id,location.getName());
            lokacje.setArea(id, location.getArea());
            lokacje.setCube(id, location.getCube());
            lokacje.setLight(id, location.getLight());
            lokacje.setHeating(id, location.getHeating());
        }*/
        /*lokacje.add(location);
        if(ParentId!=-1)
        {
            for(int i=0;i<lokacje.size();i++)
            {
                if(ParentId==(lokacje.get(i)).getId())
                {
                    (lokacje.get(i)).
                }
            }
        }*/
        //System.out.println(location.getParentId());
        //System.out.println(lokacje.getArea(id));
    }
    public TransformResponse transform(int id,String polecenie){
        float wynik;
        System.out.println(polecenie);

            if(polecenie.equals("getArea")) {
                wynik = lokacje.getArea(id);
                System.out.println(wynik);

            }
            else if(polecenie.equals("getCube")){
                wynik = lokacje.getCube(id);
            }
            else if(polecenie.equals("getLight")){
                wynik = lokacje.getLight(id);
            }
            else if(polecenie.equals("getHeating")){
                wynik = lokacje.getHeating(id);
            }
            else if(polecenie.equals("getLightperM2")){
                wynik = lokacje.getLightperM2(id);
            }
            else {
                wynik = lokacje.getHeatingperM3(id);
            }
            TransformResponse result=new TransformResponse(wynik);
        return result;
    }
}
