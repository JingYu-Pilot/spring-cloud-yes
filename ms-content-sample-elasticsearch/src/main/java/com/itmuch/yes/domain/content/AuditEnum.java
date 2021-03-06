package com.itmuch.yes.domain.content;

import lombok.Getter;

@Getter
public enum AuditEnum {
    // 尚未审核
    NOT_YET("NOT_YET"),
    // 审核通过
    PASSED("PASSED"),
    // 审核不通过
    FAILED("FAILED");

    private String name;

    AuditEnum(String name) {
        this.name = name;
    }
}
