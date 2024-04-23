package com.examly.springapp.Dhishaservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Dhishamodel.DhishaDoor;
import com.examly.springapp.Dhisharepository.DoorRepo;

@Service
public class DoorService {
    @Autowired
    private DoorRepo doorRepo;

    public DhishaDoor postData(DhishaDoor door) {
        return doorRepo.save(door);
    }

    public List<DhishaDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public DhishaDoor updateDetail(int doorid, DhishaDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<DhishaDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<DhishaDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public DhishaDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}