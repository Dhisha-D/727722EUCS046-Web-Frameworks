package com.example.cw2.Dhishaservice;

import com.example.cw2.Dhishamodel.DhishaPlayer;
import com.example.cw2.Dhisharepository.DhishaPlayerRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhishaPlayerService {

    @Autowired
    private DhishaPlayerRepo playerRepo;

    public List<DhishaPlayer> getAllPlayers() {
        return playerRepo.findAll();
    }

    public DhishaPlayer getPlayerById(int id) {
        return playerRepo.findById(id).orElse(null);
    }

    public DhishaPlayer addPlayer(DhishaPlayer player) {
        return playerRepo.save(player);
    }
}
