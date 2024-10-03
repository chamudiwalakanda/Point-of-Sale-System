package com.example.demo.Service;

import com.example.demo.Dto.itemDto;
import com.example.demo.Entity.itemCategoryEntity;
import com.example.demo.Repository.itemCategoryRepository;
import jakarta.transaction.Transactional;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class itemCategoryService {
    @Autowired
    private itemCategoryRepository itemCategoryrepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<itemDto> getAllItems(){
        List<itemCategoryEntity>itemCategoryEntityList = itemCategoryrepository.findAll();
        return modelMapper.map(itemCategoryEntityList,new TypeToken<itemDto>(){}.getType());
    }
}
