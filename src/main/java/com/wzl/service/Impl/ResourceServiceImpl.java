package com.wzl.service.Impl;

import com.wzl.mapper.ResourceMapper;
import com.wzl.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;


    @Override
    public int addResource(int book_id, String filename) {
        return resourceMapper.addResource(book_id, filename);
    }

    @Override
    public int deleteResource(int book_id, String filename) {
        return resourceMapper.deleteResource(book_id, filename);
    }

    @Override
    public String getResource(int book_id) {
        return resourceMapper.getResource(book_id);
    }

    @Override
    public int updateResource(int book_id, String filename) {
        return resourceMapper.updateResource(book_id, filename);
    }
}
