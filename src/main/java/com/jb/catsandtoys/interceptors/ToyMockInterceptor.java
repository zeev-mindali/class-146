package com.jb.catsandtoys.interceptors;

import com.jb.catsandtoys.beans.Toy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ToyMockInterceptor implements BeanPostProcessor {
    private String[] colors = {"skin","black","white","organe","tricolor","asphalt","silver","red","grey"};
    private String[] names = {"Rubber duck","Ball","Stick","Mouse","Scratch board","katnip","Laser"};

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Toy){
            Toy toy = (Toy) bean;
            toy.setToyName(names[(int)(Math.random()*names.length)]);
            toy.setColor(colors[(int)(Math.random()*colors.length)]);
            toy.setHasSound((int)(Math.random()*2)!=0);

        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
