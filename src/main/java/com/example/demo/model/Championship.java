package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Championship {

    private String name;

    private List<Team> teams;

    private List<MatchDay> matchDays;

    private int seassonNumber;

    public Map<Team, TableStatistics> getTable() {
        matchDays.stream()
    }
}
