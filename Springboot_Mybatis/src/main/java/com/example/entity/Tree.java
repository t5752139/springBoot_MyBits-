package com.example.entity;

import sun.dc.pr.PRError;

import javax.xml.ws.soap.Addressing;
import java.util.List;

public class Tree {
    private int id;
    private int pId;
    private String name;
    private String adds;
    private List<Tree> list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tree> getList() {
        return list;
    }

    public void setList(List<Tree> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", pId=" + pId +
                ", name='" + name + '\'' +
                ", adds='" + adds + '\'' +
                ", list=" + list +
                '}';
    }
}
