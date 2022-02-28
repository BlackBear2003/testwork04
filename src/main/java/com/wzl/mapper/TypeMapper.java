package com.wzl.mapper;

import com.wzl.entity.Type;

import java.util.List;

public interface TypeMapper {

    Type getTypeById(int id);

    List<Type> getTypes();

}
