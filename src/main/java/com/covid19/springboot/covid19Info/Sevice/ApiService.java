package com.covid19.springboot.covid19Info.Sevice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApiService {

    @Scheduled(fixedDelay = 1000)
    public void test() {

        log.error("test error");
    }


}
