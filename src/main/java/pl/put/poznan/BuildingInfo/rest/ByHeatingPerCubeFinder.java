package pl.put.poznan.BuildingInfo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/heatingm3")
public class ByHeatingPerCubeFinder {
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Integer>> getLocationsOverThreshold(@RequestParam("threshold") float threshold) {
        List<Integer> ids = BuildingInfoController.baza.getRoomIdsByHeatingPerCube(threshold);
        return ResponseEntity.ok(ids);
    }
}
