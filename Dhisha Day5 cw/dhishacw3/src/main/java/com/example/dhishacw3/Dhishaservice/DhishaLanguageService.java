package com.example.dhishacw3.Dhishaservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dhishacw3.Dhishamodel.DhishaLanguage;
import com.example.dhishacw3.Dhisharepository.DhishaLanguageRepo;

@Service
public class DhishaLanguageService {
    private DhishaLanguageRepo languageRepo;
    public DhishaLanguageService(DhishaLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(DhishaLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhishaLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,DhishaLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public DhishaLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
