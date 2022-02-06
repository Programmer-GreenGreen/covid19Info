package com.covid19.springboot.covid19Info.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Builder
public class CurrentSituationDto {

    private LocalDate state_dt; // 기준일
    private LocalDateTime state_time; //기준시간 00:00
    private LocalDateTime create_dt; //등록일시분초(ms)
    private LocalDateTime update_dt; //수정일시분초
    private Integer decide_cnt; //확진자
    private Integer acc_def_rate;//누적확진자
    private Integer death_cnt; //사망자
    private Integer seq; //게시글 고유 번호 -> pk

    

}
//buildup
