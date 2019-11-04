package com.demo.model;

import java.util.Date;

public class Clazz {
    private int id;
    private int org_id;
    private String name;
    private String time;
    private int teacher_id;
    private int clazz_id;
    private String teacher_type;
    private int is_show;
    private String type;
    private String teacher_code;
    private String status;
    private String clazz_name;
    private Date start_time;
    private String clazz_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getClazz_id() {
        return clazz_id;
    }

    public void setClazz_id(int clazz_id) {
        this.clazz_id = clazz_id;
    }

    public String getTeacher_type() {
        return teacher_type;
    }

    public void setTeacher_type(String teacher_type) {
        this.teacher_type = teacher_type;
    }

    public int getIs_show() {
        return is_show;
    }

    public void setIs_show(int is_show) {
        this.is_show = is_show;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeacher_code() {
        return teacher_code;
    }

    public void setTeacher_code(String teacher_code) {
        this.teacher_code = teacher_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClazz_name() {
        return clazz_name;
    }

    public void setClazz_name(String clazz_name) {
        this.clazz_name = clazz_name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getClazz_type() {
        return clazz_type;
    }

    public void setClazz_type(String clazz_type) {
        this.clazz_type = clazz_type;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", org_id=" + org_id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", teacher_id=" + teacher_id +
                ", clazz_id=" + clazz_id +
                ", teacher_type='" + teacher_type + '\'' +
                ", is_show='" + is_show + '\'' +
                ", type='" + type + '\'' +
                ", teacher_code='" + teacher_code + '\'' +
                ", status='" + status + '\'' +
                ", clazz_name='" + clazz_name + '\'' +
                ", start_time=" + start_time +
                ", clazz_type='" + clazz_type + '\'' +
                '}';
    }

    public Clazz() {
    }

    public Clazz(int id, int org_id, String name, String time, int teacher_id, int clazz_id, String teacher_type, int is_show, String type, String teacher_code, String status, String clazz_name, Date start_time, String clazz_type) {
        this.id = id;
        this.org_id = org_id;
        this.name = name;
        this.time = time;
        this.teacher_id = teacher_id;
        this.clazz_id = clazz_id;
        this.teacher_type = teacher_type;
        this.is_show = is_show;
        this.type = type;
        this.teacher_code = teacher_code;
        this.status = status;
        this.clazz_name = clazz_name;
        this.start_time = start_time;
        this.clazz_type = clazz_type;
    }
}
