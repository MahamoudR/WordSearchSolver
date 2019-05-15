package com.aar.app.wordsearch.data;

import com.aar.app.wordsearch.model.GameTheme;

import java.util.ArrayList;
import java.util.List;

public class GameThemeRepository {

    public List<GameTheme> getGameThemes() {
        // sample data
        List<GameTheme> themes = new ArrayList<>();
        themes.add(new GameTheme(1, "Mobile Developer Intern Word Search problem"));
        return themes;
    }

}
