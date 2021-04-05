package com.hx.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page implements Serializable {
    private int id;
    private String name;
    private Date start_time;
    private String creator;
    private String duration;
    private String state;
    private String total_points;


}
