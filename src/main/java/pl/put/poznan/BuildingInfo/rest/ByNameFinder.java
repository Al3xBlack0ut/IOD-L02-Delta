package pl.put.poznan.BuildingInfo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.BuildingInfo.logic.BuildingInfo;

import java.util.List;

@RestController
@RequestMapping("/name")
public class ByNameFinder {
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Integer>> getRoomIdsByName(@RequestParam("name") String roomName) {
        List<Integer> ids = BuildingInfoController.baza.getRoomIdsByName(roomName);
        return ResponseEntity.ok(ids);
    }
}
