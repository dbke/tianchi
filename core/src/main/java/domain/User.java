package domain;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.Date;
import java.util.List;

/**
 * Created by yangtao.lyt on 2015/03/21 13:41
 */
public class User {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户的所有行为
     */
    private List<Behavior> allBehavior = Lists.newArrayList();

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAllBehavior(List<Behavior> allBehavior) {
        this.allBehavior = allBehavior;
    }

    public Long getUserId() {

        return userId;
    }

    public List<Behavior> getAllBehavior() {
        return allBehavior;
    }

    public boolean addBehavior(Behavior behavior){
        return allBehavior.add(behavior);
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.reflectionToString(this);
    }

}
