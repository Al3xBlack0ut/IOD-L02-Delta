package pl.put.poznan.BuildingInfo.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.BuildingInfo.logic.BuildingInfo;
import pl.put.poznan.transformer.model.TransformRequest;
import pl.put.poznan.transformer.model.TransformResponse;


@RestController
@RequestMapping("/building/{id}")
public class BuildingInfoController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingInfoController.class);
    private BuildingInfo baza=new BuildingInfo();
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    //public float get(@PathVariable int id,
     //                         @RequesatParam(value="operacje") String transform) {
    public TransformResponse get(@RequestParam(value="id") int id,@RequestParam(value="Operacja") String transform) {
        // log the parameters
        logger.debug(Integer.toString(id));
        logger.debug(transform);

        // perform the transformation, you should run your logic here, below is just a silly example
        //BuildingInfo transformer = new BuildingInfo(id);
        return baza.transform(id, transform);
        //return transformer.transform(transforms);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json",produces = "application/json")
    public void post(@PathVariable int id,
                      @RequestBody TransformRequest location) {

        // log the parameters
        System.out.println(location.getName());
        logger.debug(Integer.toString(id));
        logger.debug(Integer.toString(location.getParentId()));

        // perform the transformation, you should run your logic here, below is just a silly example
        //BuildingInfo transformer = new BuildingInfo(id);
        //return transformer.transform("Asd");
        baza.insert(id,location);
    }



}


