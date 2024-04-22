package com.example.day6pah.Dhishaservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6pah.Dhishamodel.DhishaLanguage;
import com.example.day6pah.Dhisharepository.DhishaLanguageRepo;

@Service
public class DhishaLangaugeService {
    public DhishaLanguageRepo languageRepo;
    public DhishaLangaugeService(DhishaLanguageRepo languageRepo)
    {
        this.languageRepo = languageRepo;
    }
    public boolean postLanguage(DhishaLanguage language)
    {
        try{

            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhishaLanguage> getSortedLanguages(String field)
    {
        return languageRepo.findAll(Sort.by(field));
    }
    public List<DhishaLanguage> getPaginationLanguages(int offset,int size)
    {
        return languageRepo.findAll(PageRequest.of(offset, size)).getContent();
        // return childrenRepo.findAll(Pageable.ofSize(size).withPage(offset)).getContent();
                        
    }
    public List<DhishaLanguage> getSortedPaginationLanguages(int offset,int size,String field)
    {
        return languageRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
}
