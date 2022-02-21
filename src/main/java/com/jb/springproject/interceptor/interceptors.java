package com.jb.springproject.interceptor;

import com.jb.springproject.beans.Cat;
import com.jb.springproject.beans.Phone;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class interceptors implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("cat")){
            //System.out.println("We found a cat!!!");
            //System.out.println("Let's check his age");
            Cat cat = (Cat)bean;
            //System.out.println(cat.getCatAge());
            if (cat.getCatAge()%2==1){
                //System.out.println("Setting new age");
                cat.setCatAge(cat.getCatAge()+1);
                return cat;
            }
        }

        if (beanName.equals("phone")){
            //System.out.println("We got a phone");
            Phone phone = (Phone)bean;
            String newNumber = "+972-"+phone.getPhoneNumber().substring(1);
            //System.out.println(newNumber);
            phone.setPhoneNumber(newNumber);
            return phone;
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
