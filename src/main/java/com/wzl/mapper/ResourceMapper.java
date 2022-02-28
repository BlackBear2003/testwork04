package com.wzl.mapper;

import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {

    int addResource(@Param("book_id")int book_id, @Param("filename")String filename);

    int deleteResource(@Param("book_id")int book_id, @Param("filename")String filename);

    String getResource(int book_id);

    int updateResource(@Param("book_id")int book_id, @Param("filename")String filename);

}
