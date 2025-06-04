package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PointsDao {
    @Autowired
    private PointsRepository repository;
    
    public Points save(Points points){
        return repository.save(points);
    }

    public void deleteAll(){
        repository.deleteAll();
    }

    public List<Points> getAllPoints(){
        List<Points> points = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(
                point -> {
                    points.add(point);
                }
        );
        return points;
    }


}
