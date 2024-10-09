package com.example.demo.Service;


import com.example.demo.Dto.stockDto;
import com.example.demo.Entity.stockEntity;
import com.example.demo.Repository.stockRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class stockService {

    @Autowired
    private stockRepository stockrepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<stockDto> getAllItems(){
        List<stockEntity>stockEntityList = stockrepository.findAll();
        return modelMapper.map(stockEntityList,new TypeToken<stockDto>(){}.getType());
    }
}
