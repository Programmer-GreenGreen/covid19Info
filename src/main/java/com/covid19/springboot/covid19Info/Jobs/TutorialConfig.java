package com.covid19.springboot.covid19Info.Jobs;


import com.covid19.springboot.covid19Info.Task.TutorialTask;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class TutorialConfig {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job tutorialJob() {
        return jobBuilderFactory.get("^^")
                .start(tutorialStep())
                .build();

    }
    @Bean
    public Step tutorialStep(){
        return stepBuilderFactory.get("step")
                .tasklet(new TutorialTask())
                .build();
    }


}
