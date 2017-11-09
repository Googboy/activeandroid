package com.example.activeandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.io.Serializable;

/**
 * Created by 潘硕 on 2017/11/9.
 */
@Table(name="subscr")
public class Subscriber extends Model implements Serializable {
    public Subscriber(){
        super();
    }
    //表字段
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Subscriber [name="+name+",age="+age+"]";
    }
}
