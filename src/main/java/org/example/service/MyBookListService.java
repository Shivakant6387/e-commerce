package org.example.service;
import org.example.entity.MyBookList;
import org.example.repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MyBookListService  {
    @Autowired
    private MyBookListRepository myBookListRepository;
    public void saveMyBookList(MyBookList myBookList){
        myBookListRepository.save(myBookList);
    }
    public List<MyBookList> getAllMyBooks(){
        return myBookListRepository.findAll();
    }
    public void deleteById(int id){
        myBookListRepository.deleteById(id);
    }
}
