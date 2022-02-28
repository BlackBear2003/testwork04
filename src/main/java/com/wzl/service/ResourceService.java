package com.wzl.service;

import org.apache.ibatis.annotations.Param;

public interface ResourceService {
    int addResource(int book_id, String filename);

    int deleteResource(int book_id, String filename);

    String getResource(int book_id);

    int updateResource(int book_id, String filename);
}
