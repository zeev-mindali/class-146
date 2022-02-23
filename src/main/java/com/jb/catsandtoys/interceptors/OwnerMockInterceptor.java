package com.jb.catsandtoys.interceptors;

import com.jb.catsandtoys.beans.Owner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class OwnerMockInterceptor implements BeanPostProcessor {
    private String[] names = {"Tal","Golan","Yoav","Saar","Lea","Shachar","Amir","Omer"};
    private String[] address = {"Qiryat yam","Ramat Gan","Ashkelon?","Ramat ha Golan","TLV"};

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Owner){
            Owner owner = (Owner) bean;
            owner.setName(names[(int)(Math.random()*names.length)]);
            owner.setAddress(address[(int)(Math.random()*address.length)]);
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
