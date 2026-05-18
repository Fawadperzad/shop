package com.fawad.shop.util;

public class MapperUtil
{
     public static <S, T> T map(S source, Class<T> targetClass)
     {
          try
          {
               T target = targetClass.getDeclaredConstructor().newInstance();
               org.springframework.beans.BeanUtils.copyProperties(source, target);
               return target;
          }
          catch (Exception e)
          {
               throw new RuntimeException("Error mapping objects", e);
          }
     }
}
