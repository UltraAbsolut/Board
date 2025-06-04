package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RestController
@RequestMapping("/points")
public class PointsController {
    
    @Autowired
    private PointsDao pointsDao;

    @GetMapping("/getAll")
    public List<Points> getAllPoints(){
        return pointsDao.getAllPoints();
    }

    @PostMapping("/save")
    public Points save(@RequestBody Points points) {
        return pointsDao.save(points);
    }

    @DeleteMapping("/clear")
    public ResponseEntity<Void> clearAllPoints() {
        try {
            pointsDao.deleteAll();
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
