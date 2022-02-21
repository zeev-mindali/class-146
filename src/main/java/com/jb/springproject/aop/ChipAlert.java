package com.jb.springproject.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//where the annotations will be used? (c'tor,type,method,field)
@Target({ElementType.TYPE, ElementType.METHOD})
//the annotation will be run at run time....
@Retention(RetentionPolicy.RUNTIME)
public @interface ChipAlert {

}
