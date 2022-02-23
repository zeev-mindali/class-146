package com.jb.catsandtoys.interceptors;

import com.jb.catsandtoys.beans.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CatMockInterceptor implements BeanPostProcessor {
    private String[] names = {"Mitzi","Pitzik","Kitzi","Bumper","Pagosh"
    ,"Luna","Maze","Gibur","Gadol","Niko","Nipo"};
    private String[] colors = {"skin","black","white","organe","tricolor","asphalt","silver","red","grey"};
    private String[] food = {"dry food","shazir","milk","meat","fish fish","tuna","mouse"};
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat){
            Cat cat = (Cat)bean;
            cat.setName(names[(int)(Math.random()*names.length)]);
            cat.setWeight((int)(Math.random()*5)+2);
            cat.setColor(colors[(int)(Math.random()*colors.length)]);
            cat.setAge((int)(Math.random()*5)+1);
            cat.setFavoriteFood(food[(int)(Math.random()*food.length)]);
            cat.setMale((int) (Math.random() * 2) != 0);
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
