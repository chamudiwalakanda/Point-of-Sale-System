package com.example.demo.Service;

import com.example.demo.Dto.itemDto;
import com.example.demo.Entity.itemEntity;
import com.example.demo.Repository.itemRepository;
import jakarta.transaction.Transactional;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class itemService {
    @Autowired
    private itemRepository itemrepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<itemDto> getAllItems(){
     List<itemEntity>itemEntityList = itemrepository.findAll();
     return modelMapper.map(itemEntityList,new TypeToken<itemDto>(){}.getType());
    }
}
