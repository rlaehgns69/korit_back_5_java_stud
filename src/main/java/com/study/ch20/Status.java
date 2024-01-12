package com.study.ch20;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum Status {
    // new Status(200,"ok")
    OK(200, "정상적인 요청"),
    BADREQUEST(400,"비정상적인 요청");

    private int code;
    private String statusName;
}
